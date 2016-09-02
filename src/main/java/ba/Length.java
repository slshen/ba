package ba;

public class Length extends Measure {

	private Point a;
	private Point b;

	public Length(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getValue() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
	
	public void setValue(double length) {
		
	}

}
