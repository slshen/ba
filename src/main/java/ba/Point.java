package ba;

public class Point extends GeometryObject {
	public static final int FIXED_X = 1, FIXED_Y = 2, FIXED = FIXED_X | FIXED_Y;
	private double x, y;
	private int flags;

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int flags, double x, double y) {
		this.flags = flags;
		this.x = x;
		this.y = y;
	}
	
	public double angleTo(Point a) {
		return 0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		if ((flags & FIXED_X) != 0 && x != this.x) {
			EvaluationContext.get().error(this,
					"cannot set x value of " + getName() + " to " + x + " because it has been fixed to " + this.x);
		} else {
			this.x = x;
		}
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
