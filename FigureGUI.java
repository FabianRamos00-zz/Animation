package GUI;

import Model.Figure;
import java.awt.Color;
import java.awt.Graphics;

public class FigureGUI extends Figure {
	
    private Color color;
	
    public FigureGUI(Figure figure, Color color) {
        super(figure.getSize(),figure.getDirection(), figure.getSpeed(),
                figure);
        this.setArea(figure.getArea());
        this.color = color;
    }
     
    public void init(){
       this.setMoving(true);
       new Thread(this).start();
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(color);
        graphics.fillOval((int) this.getX(),(int) this.getY(),this.getSize(), this.getSize());
    }
    
    
}







