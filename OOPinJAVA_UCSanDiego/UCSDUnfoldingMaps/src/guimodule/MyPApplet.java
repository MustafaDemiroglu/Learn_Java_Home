package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {
	
	PImage img;
	
	public void setup() {
		// Add setup code for MyPApplet
		size(900,900);        			//set canvas size
		background(255,0,0);			// set canvas color
		stroke(0);						// set pen color
		//img = loadImage("http://cseb.ucsd.edu/~minnes/palmTrees.jpg","jpg");
		img = loadImage("palmTrees.jpg");
		img.resize(0,height);			// resize loaded image to full height of canvas
		image(img,0,0);					// display image
	}
	
	public void draw () { 
		// Add drawing code for MyPApplet
		int[] color = sunColorSec(second());		// calculate color code for sun
		fill(color[0],color[1],color[2]);			// set sun color
		ellipse(width/4,height/5,width/4,height/5);	//draw sun
	}
	
	public int[] sunColorSec(float seconds) {
		int [] rgb = new int [3];
		// Scale the brightness of the yellow based on the seconds. 30 seconds
		// is black. O seconds is bright yellow. 
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		// System.out.println ("R" + rgb[0] + "G" + rgb[1] + "B" + rgb[2]);
		return rgb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}