package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .3, .2);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledCircle(.3, .6, .05);
		StdDraw.line(.3,.47,.3,.53);
		StdDraw.line(.37,.6,.43,.6);
		StdDraw.line(.36,.55,.4,.50);
	}
}