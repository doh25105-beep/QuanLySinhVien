import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> danhSachSV = new ArrayList<>();
        danhSachSV.add(new Student("2606610007", "Do Tuan Hung", "11/08/2008"));
        danhSachSV.add(new Student("SV02", "Tran Thi B", "15/05/2004"));

        System.out.println("---- DANH SACH SINH VIEN ----");
        for (Student sv : danhSachSV) {
            sv.hienThiThongTin();
        }
    }
}