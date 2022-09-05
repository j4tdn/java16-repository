package ex05;

public class TextBook extends Book {
	private String tinhTrang;

	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String maSach, double donGia, String nhaXB, String tinhTrang) {
		super(maSach, donGia, nhaXB);
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + getMaSach() + ", donGia=" + getDonGia() + ", nhaXB=" + getNhaXB() + "]"
				+ "SachGK [tinhTrang=" + tinhTrang + "]";
	}

	@Override
	double tinhtien() {
		if(tinhTrang == "Cu" ) {
			return this.getDonGia()*(30/100);
		}
		return this.getDonGia();
	}
}
