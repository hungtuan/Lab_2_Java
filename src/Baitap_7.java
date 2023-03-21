import java.util.Scanner;

public class Baitap_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute, second;
        System.out.println("Nhập vào giờ:");
        hour = sc.nextInt();
        System.out.println("Nhập vào phút:");
        minute = sc.nextInt();
        System.out.println("Nhập vào giây:");
        second = sc.nextInt();
        if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)) {
            // Tính thời gian trước và sau 1 giây
            int totalSeconds = hour * 3600 + minute * 60 + second;
            int beforeSeconds = totalSeconds - 1;
            int afterSeconds = totalSeconds + 1;
            int beforeHour = beforeSeconds / 3600;
            int beforeMinute = (beforeSeconds % 3600) / 60;
            int beforeSecond = (beforeSeconds % 3600) % 60;
            int afterHour = afterSeconds / 3600;
            int afterMinute = (afterSeconds % 3600) / 60;
            int afterSecond = (afterSeconds % 3600) % 60;
            // In ra thời gian trước và sau 1 giây
            System.out.printf("Thời gian hợp lệ là %02d:%02d:%02d\n", hour, minute, second);
            System.out.printf("Trước đó 1 giây là %02d:%02d:%02d\n", beforeHour, beforeMinute, beforeSecond);
            System.out.printf("Sau đó 1 giây là %02d:%02d:%02d\n", afterHour, afterMinute, afterSecond);

        } else {
            System.out.println("Thời gian không hợp lệ.");
        }
    }
}
