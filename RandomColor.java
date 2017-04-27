package GUI;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
	
	private Color[] colors;
	Random random;

	public RandomColor(Color[] colors) {
		super();
		this.colors = colors;
		random = new Random();
	}
	
	public Color next(){
		return colors[random.nextInt(colors.length-1)];
	}
}
