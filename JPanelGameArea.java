package GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import Model.Area;

public class JPanelGameArea extends JPanel implements java.lang.Runnable{
    
	public static final int REFRESH_TIME = 100;
	
	private FigureGUIGroup figuresGUI;
    
    public JPanelGameArea(FigureGUIGroup figuresGUI) {
        super();
        this.figuresGUI = figuresGUI;
    }
    
    public void init(){
       new Thread(this).start();
       this.figuresGUI.init();
    }
    
    @Override
    public void paint(Graphics graphics){
       super.paint(graphics);
       this.figuresGUI.draw(graphics);
    }

    public void run() {
        while(true){
           repaint();
            try {
                 Thread.sleep(REFRESH_TIME);
             } catch (InterruptedException ex) {
            }
        }
    }
}