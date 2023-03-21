import java.util.Scanner;

public class Baitap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        char pheptinh;
        System.out.println("Nhập số thứ nhất: ");
        num1 = sc.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        num2 = sc.nextDouble();
        System.out.println("Chọn phép tính (+, -, *, /)");
        pheptinh = sc.next().charAt(0);
        double output = 0.0;;
        switch (pheptinh) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    output = num1 / num2;
                } else {
                    System.out.println("Không thể chia cho số không");
                }
                break;
            default:
                output = 0.0;
                System.out.println("Bạn chọn sai phép tính");
                break;
        }
        System.out.println("Kết quả là:");
        System.out.println(num1+" "+pheptinh+" "+num2+" = "+output);


    }
}
