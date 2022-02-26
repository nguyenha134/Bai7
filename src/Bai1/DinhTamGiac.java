package Bai1;

import java.util.Scanner;

public class DinhTamGiac {
    public static void main(String[] args) {
        double xa, ya, xb, yb, xc, yc;
        double ab, ac, bc, cv = 0, s, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap toa do thu nhat: ");
        xa = scanner.nextDouble();
        ya = scanner.nextDouble();
        System.out.println("Nhap toa do thu hai: ");
        xb = scanner.nextDouble();
        yb = scanner.nextDouble();
        System.out.println("Nhap toa do thu ba: ");
        xc = scanner.nextDouble();
        yc = scanner.nextDouble();
        ab = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
        ac = Math.sqrt((xa - xc) * (xa - xc) + (ya - yc) * (ya - yc));
        bc = Math.sqrt((xb - xc) * (xb - xc) + (yb - yc) * (yb - yc));
        if (ab + bc > ac && (ab + ac > bc) && (ac + bc > ab))
            cv = ab + bc + ac;
        p = cv / (double) 2;
        s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));

        System.out.println("Chu vi la: " + Math.round(cv*100.0)/100.0);
        System.out.println("Dien tich: " + Math.round(s*100.0)/100.0);

        if ((ab == bc) && (bc == ac)) {
            System.out.println("Tam giac deu");
        } else if ((ab == bc) || (ab == ac) || (bc == ac)) {
            System.out.println("Tam giac can!");
        } else if ((ab * ab == bc * bc + ac * ac) || (bc * bc == ab * ab + ac * ac) || (ac * ac == ab * ab + bc * bc)) {
            System.out.println("Tam giac vuong");
        }
        else{
            System.out.println("Tam giac thuong");
        }
    }
}