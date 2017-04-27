package Test;

import Model.Coord;
import Model.Figure;

public class TestFigure {
    public static void main(String[] args) {
        Figure figure = new Figure(10,Math.toRadians(45),10.0,new Coord(100.0, 100.0));
        System.out.println(figure.getX()+","+figure.getY());
        figure.setMoving(true);
        double x = figure.getX();
        double y = figure.getY();
        new Thread(figure).start();
        while(true) {
            if (x!=figure.getX() || y!=figure.getY()) {
                x = figure.getX();
                y = figure.getY();
                System.out.println("");
                System.out.print(x+","+y);
            }
            else {
                System.out.print("");
            }
        }
        //figure.setMoving(false);
    }
    
}
