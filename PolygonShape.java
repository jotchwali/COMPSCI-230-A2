/*
 *	===============================================================================
 *	PolygonShape.java : A shape that is a polygon.
 *  YOUR UPI:jli816
 *	=============================================================================== */
import java.awt.*;
import java.util.Arrays;
class PolygonShape extends SquareShape {
	private Point centre = new Point(DEFAULT_HEIGHT/2, DEFAULT_HEIGHT/2);
	private int radius = DEFAULT_HEIGHT/2;
	private int numberOfSides = 6;
	public PolygonShape() {}
	public PolygonShape(int x, int y, int s, int pw, int ph, Color c, Color bc, PathType pt, ShapeType st) {
		super(x ,y ,s, pw ,ph, c, bc, pt);
		this.numberOfSides = st.getNumberOfSides();
		radius = s/2;
		centre  = new Point(x + width/2, y + height/2);
	}

	// Polygon(int[] xpoints, int[] ypoints, int npoints)
	public void draw(Graphics g) { //complete the draw method
		g.setColor(this.color);
		int[] xCoordinate = new int[numberOfSides];
		int[] yCoordinate = new int[numberOfSides];
		this.centre = new Point(x + width / 2, y + height / 2);

		for (int i = 0; i < numberOfSides; i++) {
			xCoordinate[i] = (int) (centre.x + radius * Math.cos((i * 2 * Math.PI) / numberOfSides));
			yCoordinate[i] = (int) (centre.y + radius * Math.sin((i * 2 * Math.PI) / numberOfSides));
		}

		Polygon p = new Polygon(xCoordinate, yCoordinate, this.numberOfSides);
		g.fillPolygon(p);
		g.setColor(this.borderColor);
		g.drawPolygon(p);
	}
}