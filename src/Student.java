public class Student {
    private final String maSV;
    private final String hoTen;
    private final String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() { return maSV; }

    public void hienThiThongTin() {
        System.out.println("[FEATURE] Thong tin SV: " + maSV + " | " + hoTen + " | " + ngaySinh);
    }
}
