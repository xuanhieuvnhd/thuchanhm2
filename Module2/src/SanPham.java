import java.io.Serializable;

public class SanPham implements Serializable {
    int ma;
    String ten;
    double gia;
    int soluong;
    String mota;

    public SanPham() {
    }

    public SanPham(int ma, String ten, double gia, int soluong, String mota) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", mota='" + mota + '\'' +
                '}';
    }
}
