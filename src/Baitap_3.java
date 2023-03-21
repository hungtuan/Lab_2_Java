import java.util.Scanner;

public class Baitap_3 {
    public static void main(String[] args) {
        //Viet phuong trinh giai pt bac 2
        Scanner sc = new Scanner(System.in);
        //Nhap vao 3 so a,b,c
        double a, b, c;
        System.out.println("Nhập vào số a:");
        a = sc.nextDouble();
        System.out.println("Nhập vào số b:");
        b = sc.nextDouble();
        System.out.println("Nhập vào số c:");
        c = sc.nextDouble();
        //tinh delta
        double delta = (Math.pow(b, 2)) - (4 * a * c);
        //kiem tra dieu kien
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }
}
