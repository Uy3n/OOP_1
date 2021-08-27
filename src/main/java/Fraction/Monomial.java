package Fraction;

import java.util.Scanner;

public class Monomial {

    private float heSo;
    private int soMu;

    public Monomial() {

    }

    public Monomial(float heSo, int soMu) {
        this.heSo = heSo;
        this.soMu = soMu;
    }

    public float getHeSo() {
        return this.heSo;
    }

    public int getSoMu() {
        return this.soMu;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("He so: ");
        heSo = sc.nextFloat();
        System.out.print("So mu: ");
        soMu = sc.nextInt();
    }

    public void print() {
        if (heSo == 0) {
            System.out.println("Gia tri cua don thuc la 0\n");

        } else if (soMu == 0) {
            System.out.format("%.3f", this.heSo);

        } else if (soMu == 1) {
            System.out.format("%.3fx\n", this.heSo);

        } else System.out.format("%.3fx^%d\n", this.heSo, this.soMu);
    }

    public void multiplication(Monomial another) {
        float mul_hs = this.heSo * another.heSo;
        int mul_sm = this.soMu * another.soMu;

        this.heSo = mul_hs;
        this.soMu = mul_sm;
    }

    public void division(Monomial another) {
        float div_hs = 0;
        if (this.heSo % another.heSo == 0) {
            div_hs = this.heSo / another.heSo;
//        } else {
//            float div_hs = (float) this.heSo/another.heSo;
        }
        int div_sm = this.soMu - another.soMu;

        this.heSo = div_hs;
        this.soMu = div_sm;
    }

    public void derivativeLevel1() {
        this.heSo *= soMu;
        this.soMu -= 1;
    }

    public Monomial derivativeLevelk(Monomial a, int k) {
        Monomial der = new Monomial();

        if (k > (a.soMu + 1)) {
            this.heSo = 0;

        } else {
            while (k != 0) {
                this.heSo *= soMu;
                this.soMu -= 1;
                k--;
            }
        }
        return der;
    }

    public float value(int x) {
        float value = heSo * (float) (Math.pow(x,soMu));
        return value;
    }
}
