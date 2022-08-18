package bean;

public class PointOfMatrix {
	public int index;
	public Point[] listpoints;
	
	public PointOfMatrix() {
		listpoints = new Point[0];
	}
	
	public void addListPoints(Point[] listP) {
		for (Point point : listP) {
			this.addPoint(point);
		}
	}
	
	public void addPoint(Point p) {
		Point[] tmp = new Point[this.listpoints.length + 1];
		for (int i = 0; i < this.listpoints.length; i++) {
			tmp[i] = this.listpoints[i];
		}
		tmp[tmp.length-1] = p;
		this.listpoints = tmp;
	}
	
	public boolean isContain(Point[] listpoints2) {
		for (Point point : listpoints2) {
			for (Point point2 : this.listpoints) {
				if(point2.x == point.x && point2.y == point.y)
					return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmp = "";
		for (Point point : listpoints) {
			tmp += point + "|";
		}
		return this.index + " -- " + tmp;
	}
	
}
