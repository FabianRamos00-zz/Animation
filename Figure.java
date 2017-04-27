package Model;

import java.util.Random;

public class Figure extends Coord implements Runnable{
	
   private static final int STEP = 1;
   private static final int Speed_Loss = -5;
   
   private int size;
   private double direction;
   private double speed;
   
   private Area area;
   
   private boolean moving;
   private boolean crash;

    public Figure(int size, double direction, double speed, Coord coord) {
        super(coord.x, coord.y);
        this.size = size;
        this.direction = direction;
        this.speed = speed;
        this.moving = false;
        this.crash = false;
        this.area = null;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
    
    public boolean isCrash() {
		return crash;
	}

	public void setCrash(boolean crash) {
		this.crash = crash;
	}

	@Override
    public void run() {
    	Random random = new Random();
        while(moving){
            try {
                Thread.sleep((long)((STEP/this.speed)*1000)); 
                this.move(this.direction,STEP);
                if (!this.isInArea(area) || this.crash){
                   this.setDirection(this.direction+Math.toRadians(random.nextInt(180)));
                   this.move(this.direction,STEP*2);
                   this.speed += Speed_Loss;
                   moving = this.speed > 0;
                   this.crash = false;
                }
            } catch (InterruptedException ex) {
            }
        }
    }
}
