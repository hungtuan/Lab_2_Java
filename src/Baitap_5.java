import java.util.Scanner;

public class Baitap_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character;
        System.out.println("Nhập vào một ký tự:");
        character = sc.next().charAt(0);
        int output = 0;
        if (character == 'A' || character == 'a') {
            output = 1;
        } else if (character == 'B' || character == 'b') {
            output = 2;
        } else if (character == 'C' || character == 'c') {
            output = 3;
        } else if (character == 'D' || character == 'd') {
            output = 4;
        } else if (character == 'F' || character == 'f') {
            output = 5;
        } else if (character == 'W' || character == 'w') {
            output = 6;
        }
        switch (output) {
            case 1:
                System.out.println("Ada");
                break;
            case 2:
                System.out.println("Basic");
                break;
            case 3:
                System.out.println("Cobol");
                break;
            case 4:
                System.out.println("Android");
                break;
            case 5:
                System.out.println("Fortran");
                break;
            case 6:
                System.out.println("Windows Phone");
                break;
            default:
                System.out.println("Bạn đã nhập sai");
                break;
        }
    }
}
