package bean;

public class PersonReturnProvince {
	private String tinhthanh;
	private String phuongtien;
	public PersonReturnProvince() {
		// TODO Auto-generated constructor stub
	}
	public PersonReturnProvince(String tinhthanh, String phuongtien) {
		super();
		this.tinhthanh = tinhthanh;
		this.phuongtien = phuongtien;
	}
	public String getTinhthanh() {
		return tinhthanh;
	}
	public void setTinhthanh(String tinhthanh) {
		this.tinhthanh = tinhthanh;
	}
	public String getPhuongtien() {
		return phuongtien;
	}
	public void setPhuongtien(String phuongtien) {
		this.phuongtien = phuongtien;
	}
	@Override
	public String toString() {
		return "PersonReturnProvince [tinhthanh=" + tinhthanh + ", phuongtien=" + phuongtien + "]";
	}
	

}
