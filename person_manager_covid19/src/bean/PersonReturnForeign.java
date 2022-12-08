package bean;

public class PersonReturnForeign {
	private String quocgia;
	private String machuyenbay;
	public PersonReturnForeign() {
		// TODO Auto-generated constructor stub
	}
	public String getQuocgia() {
		return quocgia;
	}
	public void setQuocgia(String quocgia) {
		this.quocgia = quocgia;
	}
	public String getMachuyenbay() {
		return machuyenbay;
	}
	public void setMachuyenbay(String machuyenbay) {
		this.machuyenbay = machuyenbay;
	}
	public PersonReturnForeign(String quocgia, String machuyenbay) {
		super();
		this.quocgia = quocgia;
		this.machuyenbay = machuyenbay;
	}
	@Override
	public String toString() {
		return "PersonReturnForeign [quocgia=" + quocgia + ", machuyenbay=" + machuyenbay + "]";
	}
	

}
