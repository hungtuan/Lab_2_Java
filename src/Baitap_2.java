import java.util.Scanner;

public class Baitap_2 {
    public static void main(String[] args) {
        //nhap diem trung binh vao ban phim
        float dtb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diem trung binh:");
        dtb = sc.nextFloat();
        String xeploai = (dtb == 10) ? "xep loai xuat sac" :
                ((dtb >= 8 && dtb < 10) ? "xep loai gioi" :
                        ((dtb >= 6.5 && dtb < 8) ? "xep loai kha" :
                                ((dtb >= 5 && dtb < 6.5) ? "xep loai trung binh" : "xep loai yeu")));
        System.out.println("Ban " + xeploai);
    }
}
