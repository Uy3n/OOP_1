package Fraction;

import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return this.tuSo;
    }

    public int getMauSo() {
        return this.mauSo;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tu so: ");
        tuSo = sc.nextInt();
        System.out.print("Mau so: ");
        mauSo = sc.nextInt();
    }

    public void print() {

        System.out.format("%d/%d\n", this.tuSo, this.mauSo);
    }

    private static int gcd(int a, int b) {
        if (a == b)
            return a;

        if (a > b) {
            return gcd(a - b, b);
        }

        return gcd(a, b - a);
    }

    public boolean isReducible() {
        int gcd = gcd(Math.abs(this.tuSo), Math.abs(this.mauSo));

        if (gcd == 1) {
            return false;
        }

        return true;
    }

    public boolean isPositive() {
        if (this.tuSo == 0)
            return false;

        if (this.tuSo > 0 && this.mauSo > 0)
            return true;

        if (this.tuSo < 0 && this.mauSo < 0)
            return true;

        return false;
    }

    public void reduce() {
        int gcd = gcd(Math.abs(this.tuSo), Math.abs(this.mauSo));

        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }

    public int compareTo(PhanSo another) {
        long tmp1 = this.tuSo * another.mauSo;
        long tmp2 = this.mauSo * another.tuSo;

        if (tmp1 > tmp2)
            return 1;

        if (tmp1 < tmp2)
            return -1;

        return 0;
    }

    public void plus(PhanSo another) {
        int tmp_ts = this.tuSo * another.mauSo + this.mauSo * another.tuSo;
        int tmp_ms = this.mauSo * another.mauSo;

        this.tuSo = tmp_ts;
        this.mauSo = tmp_ms;

        this.reduce();
    }

    public void subtraction(PhanSo another) {
        int sub_ts = this.tuSo * another.mauSo - this.mauSo * another.tuSo;
        int sub_ms = this.mauSo * another.mauSo;

        this.tuSo = sub_ts;
        this.mauSo = sub_ms;

        this.reduce();
    }

    public void multiplication(PhanSo another) {
        int mul_ts = this.tuSo * another.tuSo;
        int mul_ms = this.mauSo * another.mauSo;

        this.tuSo = mul_ts;
        this.mauSo = mul_ms;

        this.reduce();
    }

    public void division(PhanSo another) {
        int div_ts = this.tuSo * another.mauSo;
        int div_ms = this.mauSo * another.tuSo;

        this.tuSo = div_ts;
        this.mauSo = div_ms;

        this.reduce();
    }

    public static PhanSo parseFromString(String str) {
        String[] parts = str.split("/");

        PhanSo ps = new PhanSo();
        ps.tuSo = Integer.parseInt(parts[0]);
        ps.mauSo = Integer.parseInt(parts[1]);

        return ps;
    }
}

