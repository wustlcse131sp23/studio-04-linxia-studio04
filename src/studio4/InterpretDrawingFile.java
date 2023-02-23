package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		boolean ifFilled = in.nextBoolean();
		double[] point = new double[6];
		int i = 0;
		while(in.hasNextDouble()) {
			point[i] = in.nextDouble();
			i++;
		}
		
		Color newColor = new Color(red, green, blue);
		StdDraw.setPenColor(newColor);
		if (shape.equals("ellipse")) {
			if (ifFilled) {
				StdDraw.filledEllipse(point[0], point[1],point[2],point[3]);
			} else {
				StdDraw.ellipse(point[0], point[1],point[2],point[3]);
			}
		} else if (shape.equals("rectangle")) {
			if (ifFilled) {
				StdDraw.filledRectangle(point[0], point[1],point[2],point[3]);
			} else {
				StdDraw.rectangle(point[0], point[1],point[2],point[3]);
			}
		} else if (shape.equals("triangle")) {
			double[] x = {point[0], point[2],point[4]};
			double[] y = {point[1], point[3],point[5]};
			if (ifFilled) {
				StdDraw.filledPolygon(x,y);
			} else {
				StdDraw.polygon(x,y);
			}
		}


	}
}
	