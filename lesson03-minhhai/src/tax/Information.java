package tax;

public class Information {
	private Owner owner;
	private VehicleDetail vehicleDetail;

	public Information() {

	}

	public Information(Owner owner, VehicleDetail vehicleDetail) {
		this.owner = owner;
		this.vehicleDetail = vehicleDetail;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public VehicleDetail getVehicleDetail() {
		return vehicleDetail;
	}

	public void setVehicleDetail(VehicleDetail vehicleDetail) {
		this.vehicleDetail = vehicleDetail;
	}

	@Override
	public String toString() {
		return "Information [owner=" + owner + ", vehicleDetail=" + vehicleDetail + "]";
	}


	

	
	
}
