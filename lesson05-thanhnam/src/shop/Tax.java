package shop;

public class Tax {
	private int thue;
	private double donGia;
	private String maSach;

    public void ReferenceBooks() {
    }

    public void ReferenceBooks(String maSach, double donGia, String nhaXB, int thue) {
        super(maSach, donGia, nhaXB);
        this.thue = thue;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }public int getnhaXB() {
        return getnhaXB();
    }

    public void setnhaXB(String nhaXB) {
        this.thue = thue;
    }
    public int getdonGia() {
        return getdonGia();
    }

    public void setdonGia( double donGia) {
        this.donGia = donGia;
    }
    public String getmaSach() {
        return maSach;
    }

    public void setmaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "Sach [maSach=" + getmaSach() + ", donGia=" + getdonGia() + ", nhaXB=" + getnhaXB() + "]"
                + "SachTK [thue=" + thue + "]";
    }

    double tinhtien() {
        return this.getdonGia() * (1 + thue);
    }
}
