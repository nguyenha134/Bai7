package Bai3;

import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        c = scanner.nextDouble();
        System.out.println("Phuong trinh bac hai co dang: "+ a +"x^2 + "+ b +"x + "+c+" = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-b / c));
            }
        }
        //tinh delta
        double delta = b * b - 4 * a * c;
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem!");
        }else if(delta==0){
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co 1 nghiem la x1 = x2 = "+x1);
        }else{
            x1 = (-b-Math.sqrt(delta))/(2*a);
            x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co hai nghiem x1 = "+x1+" va x2 = "+x2);
        }
    }
}
