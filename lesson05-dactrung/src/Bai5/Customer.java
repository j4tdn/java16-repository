package Bai5;

public class Customer {
	private String maKH;
    private String hoTen;
    private String soDT;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maKH, String hoTen, String soDT, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
