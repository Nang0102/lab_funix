package Lab1_bai2;
import java.util.Scanner;
import Lab1_bai2.Lab1_bai2;
public class MainLab1_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        System.out.println("R: ");
        int R = scanner.nextInt();

        Lab1_bai2 HinhTron = new Lab1_bai2(R);
        System.out.println("Chu vi hình tròn là: "+ HinhTron.tinhChuVi());
        System.out.println("Diện tích hình tròn là: "+ HinhTron.tinhDienTich());
    }
}
