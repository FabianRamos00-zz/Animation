package Test;

import Model.Coord;

public class TestCoord {
    public static void main(String[] args) {
        Coord coord = new Coord(10,10);
        System.out.println(coord.getX()+","+coord.getY());
        coord.move(Math.toRadians(45),1);
        System.out.println(coord.getX()+","+coord.getY());
        coord.move(Math.toRadians(45),1);
        System.out.println(coord.getX()+","+coord.getY());
    }
    
}
