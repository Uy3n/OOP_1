package Fraction;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public void init(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void print() {
        System.out.format("%d/%d\n", this.tuSo, this.mauSo);
    }

    public void rutGon() {

        for (int i = this.tuSo; i > 1; i--) {
            if (this.tuSo % i == 0 && this.mauSo % i == 0) {
                this.tuSo /= i;
                this.mauSo /= i;
                break;
            }
        }
        System.out.println(this.tuSo + "/" + this.mauSo);
    }

    public PhanSo sumPS(PhanSo x) {
        PhanSo sumPS = new PhanSo();

        this.tuSo = (tuSo * x.mauSo + mauSo * x.tuSo);
        this.mauSo = (mauSo * x.mauSo);
//        System.out.println(this.tuSo + "/" + this.mauSo);

        return sumPS;

    }

    public PhanSo sub(PhanSo x) {
        PhanSo sub = new PhanSo();

        this.tuSo = (tuSo * x.mauSo - mauSo * x.tuSo);
        this.mauSo = (mauSo * x.mauSo);
//        System.out.println(this.tuSo + "/" + this.mauSo);

        return sub;
    }

    public PhanSo mul(PhanSo x) {
        PhanSo mul = new PhanSo();

        this.tuSo = (tuSo * x.tuSo);
        this.mauSo = (mauSo * x.mauSo);
//        System.out.println(this.tuSo + "/" + this.mauSo);

        return mul;
    }

    public PhanSo div(PhanSo x) {
        PhanSo div = new PhanSo();

        this.tuSo = (tuSo * x.mauSo);
        this.mauSo = (mauSo * x.tuSo);
//        System.out.println(this.tuSo + "/" + this.mauSo);

        return div;
    }

    public boolean frac() {
        boolean frac = true;
        for (int i = tuSo; i > 1; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                frac = false;
                break;
            }
        }
        return frac;
    }

    public PhanSo quiDong(PhanSo x) {
        int mau = 0;

        if (this.mauSo != x.mauSo) {
            for (int i = this.mauSo; i >= 1; i--) {

                if (this.mauSo % i == 0 && x.mauSo % i == 0) {
                    mau = (this.mauSo * x.mauSo) / i;
                    this.tuSo = (tuSo * x.mauSo) / i;
                    x.tuSo = (x.tuSo * this.mauSo) / i;
                    break;
                }
            }

        }

        System.out.println(this.tuSo + "/" + mau);
        System.out.println(x.tuSo + "/" + mau);

        return null;
    }

    public boolean phanSoDuong() {
        boolean test = false;

        if ((this.tuSo > 0 && this.mauSo > 0) || (this.tuSo < 0 && this.mauSo < 0)) {
            test = true;
        }

        return test;
    }

    public PhanSo nhoHon(PhanSo x) {
        boolean nhoHon = false;
        int mau1 = 0;

        if (this.mauSo != x.mauSo) {
            for (int i = this.mauSo; i >= 1; i--) {

                if (this.mauSo % i == 0 && x.mauSo % i == 0) {
                    mau1 = (this.mauSo * x.mauSo) / i;
                    this.tuSo = (tuSo * x.mauSo) / i;
                    x.tuSo = (x.tuSo * this.mauSo) / i;
                    break;
                }
            }

        }

        if (this.tuSo < x.mauSo) {
            nhoHon = true;
        }

        System.out.println(nhoHon);
        return null;
    }

}
