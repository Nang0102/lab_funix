package Lab1_bai1;

import Lab1_bai1.Lab1Triangle;

import java.util.Scanner;

public class MainLab1_bai1 {
    public static void main (String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập độ dài các cạnh: ");
        System.out.println("Cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Cạnh c: ");
        int c = scanner.nextInt();

        Lab1Triangle tamGiac = new Lab1Triangle(a,b,c);
        System.out.println("Chu vi của tma giác là: " + tamGiac.tinhChuVi());
        System.out.println("Diện tích của tam  giác là: " + tamGiac.tinhDienTich());
    }
}
