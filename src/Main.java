import java.util.*;
public class Main {
    static ArrayList<Sinhvien> danhSach = new ArrayList<>();
    static class Sinhvien {
        String ma;
        String ten;
        double diem;
        Sinhvien(String ma, String ten, double diem) {
            this.ma =ma;
            this.ten = ten;
            this.diem = diem;
        }
        void hienthi() {
            System.out.println(ma + " - " + ten + " - " + diem);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhSach.add(new Sinhvien("SV01", "Do Tuan Hung", 8.0));
        danhSach.add(new Sinhvien("SV02", "Do Tuan Hung", 6.5));
        System.out.println("=== QUAN LY SINH VIEN ===");
        for (Sinhvien sv : danhSach) {
    }
}
