package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import Model.Area;
import Model.Figure;

public class FigureGUIGroup {
	
	private FigureGUI[] figuresGUI;
	
	public FigureGUIGroup(Figure[] figures, RandomColor rColor) {
		super();
		this.figuresGUI = new FigureGUI[figures.length];
		for (int i = 0; i < figures.length; i++) {
			this.figuresGUI[i] = new FigureGUI(figures[i], rColor.next());
		}
	}
	
	public void add(FigureGUI figureGUI){
		FigureGUI[] figuresGUIAux = this.figuresGUI;
		this.figuresGUI = new FigureGUI[this.figuresGUI.length+1];
		for (int i = 0; i < figuresGUIAux.length; i++) {
			this.figuresGUI[i] = figuresGUIAux[i];
		}
		this.figuresGUI[this.figuresGUI.length-1] = figureGUI;
	}
	
	
	public void init(){
	    for (int i = 0; i < figuresGUI.length; i++) {
	    	this.figuresGUI[i].init();
	    }
	}
	
	public void draw(Graphics graphics){
		graphics.setColor(Color.BLACK);
	    Area area = this.figuresGUI[0].getArea();
	    graphics.drawRect((int)area.getX(), (int)area.getY(), (int)area.getWidth(), (int)area.getHeight());
		for(FigureGUI figureGUI : figuresGUI) {
			figureGUI.draw(graphics);
		}
	}
}
