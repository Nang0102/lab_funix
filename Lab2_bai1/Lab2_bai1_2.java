package Lab2_bai1;

import java.util.Scanner;

public class Lab2_bai1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tham số a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào tham số b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhập vào tham số c: ");
        float c = scanner.nextFloat();

        double delta = Math.pow(b,b) - (4 * a* c);

        if(delta < 0 ){
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x1 = -b/(2*a);
            System.out.println("Phương trình có 1 nghiệm là x1 = x2: " + x1 );
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm là: " + x1 + " và " + x2);
        }
    }
}
