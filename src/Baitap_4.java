import java.util.Scanner;

public class Baitap_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng:");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 2:
                int nam;
                System.out.println("Nhập vào năm:");
                nam = sc.nextInt();
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                    System.out.println("Tháng " + thang + " có 29 ngày");
                } else System.out.println("Tháng " + thang + " có 28 ngày");
                break;
            default:
                System.out.println("Bạn nhập tháng linh tinh");
                break;
        }
    }
}
