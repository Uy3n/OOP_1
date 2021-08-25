import Fraction.PhanSo;
/*
    Phân Số:
    Khai báo kiểu dữ liệu phân số (int)
    Nhập/Xuất
    Rút gọn
    Tính tổng, hiệu, tích, thương 2 phân số
    Kiểm tra phân số tối giản
    Quy đồng 2 phân số
    Kiểm tra phân số âm hay dương
    so sánh 2 phân số

    * Note: Phần so sánh 2 phân số em vẫn phải code lại của phần qui đồng.
     Em thấy vậy chưa ổn, nhờ thầy sửa giúp em phần này ạ!
    
 */
public class Exercise {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo();
        ps.init(15,10);
//        ps.print();
        ps.rutGon();

        PhanSo ps1 = new PhanSo();
        ps1.init(8,20);
        ps1.rutGon();

//        ps.sumPS(ps1);
//        ps.sub(ps1);
//        ps.mul(ps1);
//        ps.div(ps1);

//        ps1.frac();

//        ps.quiDong(ps1);

//        System.out.println(ps.phanSoDuong());

        ps.nhoHon(ps1);

    }
}
