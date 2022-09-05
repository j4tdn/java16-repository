package shop;

public class Shopp {
	private String maSach;
    private double donGia;
    private String nhaXB;

    public void Book() {
    }

    public void Book(String maSach, double donGia, String nhaXB) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nhaXB = nhaXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    @Override
    public String toString() {
        return "Sach [maSach=" + maSach + ", donGia=" + donGia + ", nhaXB=" + nhaXB + "]";
    }

    double tinhtien() {
		return 0;
	}
}
