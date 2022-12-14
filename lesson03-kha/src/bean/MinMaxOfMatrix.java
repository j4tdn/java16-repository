package bean;

public class MinMaxOfMatrix {
	public PointOfMatrix maxpoints;
	public PointOfMatrix minpoints;
	
	public MinMaxOfMatrix(PointOfMatrix maxpoints, PointOfMatrix minpoints) {
		this.maxpoints = maxpoints;
		this.minpoints = minpoints;
	}
	
	public PointOfMatrix getMaxpoints() {
		return maxpoints;
	}
	
	public PointOfMatrix getMinpoints() {
		return minpoints;
	}
	
	
	
}
