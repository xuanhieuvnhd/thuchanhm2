import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.docTaiLieu();
        int chon = -1;
        do {
            System.out.println(" >>>>   QUAN LY SAN PHAM   <<<<<");
            System.out.println("   ------> Vui long chon chuc nang: ");
            System.out.println("|       1. Xem danh sach san pham             ");
            System.out.println("|       2. Them moi san pham         ");
            System.out.println("|       3. Cap nhat san pham  ");
            System.out.println("|       4. Xoa san pham            ");
            System.out.println("|       5. Sap xep san pham         ");
            System.out.println("|       6. Tim kiem san pham co gia cao nhat            ");
            System.out.println("|       7. Doc tu file        ");
            System.out.println("|       8. Ghi vao file            ");
            System.out.println("|       9. Thoat chuong trinh                              ");
            System.out.println(" ----------------------------------------------");
            try{
                chon = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.err.println("Chuc nang khong ton tai , vui long chon :");
            }
            switch (chon){
                case 1 -> quanLySanPham.hienTatCa();
                case 2 -> quanLySanPham.themSanPham(scanner);
                case 3 -> quanLySanPham.suaSanPham(scanner);
                case 4 -> quanLySanPham.xoaSanPham(scanner);
                case 5 -> quanLySanPham.sapXepSanPham();
                case 6 -> quanLySanPham.timSanPham();
                case 7 -> quanLySanPham.docTaiLieu();
//                case 8 -> quanLySanPham.ghiTaiLieu();
                case 9 -> System.exit(9);
            }
        }
        while (chon!=0);
    }
}
