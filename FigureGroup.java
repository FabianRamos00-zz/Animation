package Model;

public class FigureGroup {
	
	private Figure[] figures;

	public FigureGroup(Figure[] figures) {
		super();
		this.figures = figures;
	}
	
	public boolean isIntersection(Figure figure, Figure figure2){
		double x = (figure.getX()+figure.getSize()/2) - (figure2.getX()+figure.getSize()/2);
		double y = figure.getY() - figure2.getY();
		double d = figure.getSize()/2 + figure2.getSize()/2;
		return Math.hypot(x, y) == d;
	}
	
	public void colision(){
		for (int i = 0; i < figures.length-1; i++) {
			for (int j = i+1; j < figures.length; j++) {
				if (isIntersection(figures[i], figures[j])) {
					this.figures[i].setCrash(true);
					this.figures[j].setCrash(true);
				}
			}
		}
	}
}
