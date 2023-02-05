package model;

public class Student {
    private int msv;
    private String ten;
    private float diem;
    private String gioitinh;

    public Student(int msv, String ten, float diem, String gioitinh) {
        this.msv = msv;
        this.ten = ten;
        this.diem = diem;
        this.gioitinh = gioitinh;
    }
    public Student(){}

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv=" + msv +
                ", ten='" + ten + '\'' +
                ", diem=" + diem +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
