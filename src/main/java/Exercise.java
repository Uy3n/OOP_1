import Fraction.Monomial;
import Fraction.PhanSo;

import java.util.Scanner;

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

 */
public class Exercise {
    public static void main(String[] args) {
//        PhanSo ps = new PhanSo();
//        ps.input();
//        ps.print();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("a/b: ");
//
//        String strPs = sc.nextLine();
//        PhanSo ps = PhanSo.parseFromString(strPs);
//        ps.print();

//        PhanSo ps1 = PhanSo.parseFromString("10/12");

//        ps.plus(ps1);
//        System.out.println(ps);

//        ps.subtraction(ps1);
//        System.out.println(ps);

//        ps.multiplication(ps1);
//        System.out.println(ps);

//        ps.division(ps1);
//        System.out.println(ps);

//        if (ps.isReducible()) {
//            System.out.println("Phân số chưa tối giản");
//        } else System.out.println("Phân số tối giản");

//        if(ps.isPositive()){
//            System.out.println("Phân số dương");
//        } else System.out.println("Phân số âm");

//        ps.reduce();
//        ps.print();


//        if (ps.compareTo(ps1) < 0) {
//            System.out.format("%s < %s\n", ps, ps1);
//
//        } else if (ps.compareTo(ps1) > 0) {
//            System.out.format("%s > %s\n", ps, ps1);
//
//        } else System.out.format("%s = %s\n", ps, ps1);
//--------------------------------------------------------------

        Monomial mn = new Monomial();
        mn.input();
//        mn.print();
//        System.out.println("-------------------");
//        Monomial mn1 = new Monomial();
//        mn1.input();
//        mn.print();
//
//        mn.multiplication(mn1);
//        mn.division(mn1);
//        mn.print();
        mn.derivativeLevelk(mn, 3);
        mn.print();

//        System.out.println(mn.value(2));
    }
}
