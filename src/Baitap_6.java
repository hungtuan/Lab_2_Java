import java.util.Scanner;

public class Baitap_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhập cạnh thứ 1:");
        a = sc.nextFloat();
        System.out.println("Nhập cạnh thứ 2:");
        b = sc.nextFloat();
        System.out.println("Nhập cạnh thứ 3:");
        c = sc.nextFloat();
        //kiem tra 3 canh cua tam giac
        //a+b>c ,a+c>b, b+c>a và a>0 b>0 c>0
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                System.out.println("Đây là tam giác đều");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Đây là tam giác cân");
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Đây là tam giác vuông");
            } else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) || ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }
}