package Test;

import GUI.FigureGUIGroup;
import GUI.JPanelGameArea;
import GUI.RandomColor;
import Model.Area;
import Model.Coord;
import Model.Figure;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;

public class TetsJPanelGameArea {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Test game area");
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // logica ...
        Figure[] figures = new Figure[10];
        Random random = new Random();
        for (int i = 0; i < figures.length; i++) {
			figures[i] = new Figure(random.nextInt(40)+10,
        			Math.toRadians(random.nextInt(360)),
        			random.nextInt(90)+20,
        			new Coord(random.nextInt(750)+20,random.nextInt(550)+20));
        	figures[i].setArea(new Area(20,20,800,600));
		}
        // vista
        Color[] colors = {Color.YELLOW, Color.RED, Color.GREEN,
        		Color.BLUE, Color.BLACK, Color.ORANGE};
        RandomColor rColor = new RandomColor(colors);
        FigureGUIGroup figuresGUIGroup = new FigureGUIGroup(figures, rColor);
        JPanelGameArea jPanelGameArea = new JPanelGameArea(figuresGUIGroup);
        jFrame.add(jPanelGameArea);
        jPanelGameArea.init();
        jFrame.setVisible(true);
    }
    
}
