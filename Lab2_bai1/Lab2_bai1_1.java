package Lab2_bai1;

import java.util.Scanner;

public class Lab2_bai1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên N: ");
        int N = scanner.nextInt();
            if(N % 400 == 0 || N % 4 == 0 && N % 100 !=0){
                System.out.println(N + " là năm nhuận.");
            } else  {
                System.out.println(N + " không phải là năm nhuận.");
            }
    }

}
