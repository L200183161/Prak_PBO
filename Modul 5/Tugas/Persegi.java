
package Tugas;

public class Persegi extends BangunDatar {
    protected double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);

    }

    public void hitungKeliling() {
        keliling = (sisi + sisi) * 2;
        System.out.println("Keliling Persegi = " + keliling);
    }
}