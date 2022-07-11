import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham implements Serializable {
    ArrayList <SanPham> sanPhams = new ArrayList<>();
    File file = new File("SanPham.txt");
    public void docTaiLieu(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            sanPhams = (ArrayList<SanPham>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.err.println();
        }
    }
    public void ghiTaiLieu(){
        ArrayList<SanPham>sanPhams = new ArrayList<>();
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(sanPhams);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println();
        }
    }
    public SanPham taoSanPham(Scanner scanner){
        System.out.print("Ma san pham: ");
        int ma = Integer.parseInt(scanner.nextLine());
        while (checkMa(ma)){
            System.err.println("Ma san pham da ton tai, vui long nhap lai ma khac: ");
            ma = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Ten san pham: ");
        String ten = scanner.nextLine();
        System.out.print("Gia san pham: ");
        double gia = Integer.parseInt(scanner.nextLine());
        System.out.print("So luong: ");
        int soluong = Integer.parseInt(scanner.nextLine());
        System.out.print("Mo ta san pham: ");
        String mota = scanner.nextLine();
        return new SanPham(ma,ten,gia,soluong,mota);
    }
    public boolean checkMa(int ma) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getMa() == ma) {
                return true;
            }
        }
        return false;
    }
    public void themSanPham(Scanner scanner){
        SanPham sanPham = taoSanPham(scanner);
        sanPhams.add(sanPham);
        System.out.println("Them san pham thanh cong !");
        ghiTaiLieu();
    }
    public void hienTatCa(){
        boolean check = false;
        for(SanPham a: sanPhams){
            System.out.println(a);
            check = true;
        }
        if(!check){
            System.err.println("Chua co san pham trong he thong !");
        }
    }
    public void suaSanPham(Scanner scanner){
        boolean check = false;
        System.out.print("Nhap ma san pham can sua: ");
        int ma = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++){
            if (sanPhams.get(i).getMa() == ma){
                check = true;
                System.out.print("Ten moi: ");
                String ten = scanner.nextLine();
                System.out.print("Gia moi: ");
                double gia = Integer.parseInt(scanner.nextLine());
                System.out.print("So luong moi: ");
                int soluong =  Integer.parseInt(scanner.nextLine());
                System.out.print("Mo ta moi: ");
                String mota = scanner.nextLine();
                sanPhams.get(i).setMa(ma);
                sanPhams.get(i).setTen(ten);
                sanPhams.get(i).setGia(gia);
                sanPhams.get(i).setSoluong(soluong);
                sanPhams.get(i).setMota(mota);
                ghiTaiLieu();
            }
        }
        if (!check) {
            System.err.println("Khong tim thay San Pham !");
        }
    }
    public void xoaSanPham(Scanner scanner){
        boolean check = false;
        System.out.print("Nhap ma san pham can xoa: ");
        int ma = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++){
            if (sanPhams.get(i).getMa() == ma){
                sanPhams.remove(i);
                ghiTaiLieu();
                check = true;
            }
        }
        if (!check) {
            System.err.println("Khong tim thay San Pham !");
        }
    }
    public void sapXepSanPham(){

    }
    public void timSanPham(Scanner scanner){
        boolean check = false;
        System.out.print("Nhap ");
    }
}
