import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Student timKiemTheoMa(List<Student> danhSach, String maSV) {
        for (Student sv : danhSach) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Student> danhSachSV = new ArrayList<>();
        danhSachSV.add(new Student("2606610007", "Do Tuan Hung", "11/08/2008"));
        danhSachSV.add(new Student("SV02", "Tran Thi B", "15/05/2004"));

        System.out.println("---- KET QUA TIM KIEM ----");
        Student kq = timKiemTheoMa(danhSachSV, "2606610007");
        if (kq != null) {
            kq.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay sinh vien!");
        }
    }
}