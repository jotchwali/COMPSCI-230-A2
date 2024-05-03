/*
 *	===============================================================================
 *	RectangleShape.java : A shape that is a rectangle.
 *  YOUR UPI: jli816
 *	=============================================================================== */
import java.awt.*;
class RectangleShape extends Shape {
    public RectangleShape() {}
	public RectangleShape(int x, int y, int w, int h, int pw, int ph, Color c, Color bc, PathType pt) {
		super(x ,y ,w, h ,pw ,ph, c, bc, pt);
	}
	public void draw(Graphics g) { //complete the draw method
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
		g.setColor(this.borderColor);
		g.drawRect(this.x, this.y, this.width, this.height);
	}
}