import java.util.Scanner;
public class BTT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap ngay thang nam sinh (vd: dd/mm/yyyy): ");
        String ngaySinh = scanner.nextLine();
        System.out.println("Ten day du cua ban la: " + hoTen);
        System.out.println("Ngay sinh cua ban la: " + ngaySinh);
        scanner.close();
    }
}