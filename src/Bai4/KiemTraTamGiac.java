package Bai4;

import java.util.Scanner;

public class KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nhap canh thu nhat: ");
        a = scanner.nextDouble();
        System.out.println("Nhap canh thu hai: ");
        b = scanner.nextDouble();
        System.out.println("Nhap canh thu ba: ");
        c = scanner.nextDouble();

        if((a==b) && (b==c)){
            System.out.println("Tam giac deu");
        }else if((a==b) || (a==c) || b==c){
            System.out.println("Tam giac can!");
        }else if((a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b)){
            System.out.println("Tam giac vuong");
        }else{
            System.out.println("Tam giac thuong");
        }
    }
}
