package ba;

public class BikeGeometry extends Geometry {

	public final Tube downtube = new Tube(this, "downtube");
	public final Tube seatstay = new Tube(this, "seatstay");
	public final Tube chainstay = new Tube(this, "chainstay");
	public final Tube toptube = new Tube(this, "toptube");
	public final Tube seattube = new Tube(this, "seattube");
	public final Tube headtube = new Tube(this, "headtube");

	public final Point rearaxle = new Point(Point.FIXED, 0, 0);
	public final Point frontaxle = new Point(Point.FIXED_Y, 0, 0);
	public final Point bottombracket = new Point();
	public final Segment wheelbase = new Segment();

	public final Measure m_wheelbase = new Length(rearaxle, frontaxle);
	public final Measure m_stack;
	public final Measure m_reach;
	public final Measure m_chainstay_length;

	public final Measure m_seattube_angle = new AngleMeasure(wheelbase, seattube);
}
