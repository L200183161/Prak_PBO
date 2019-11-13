package Tugas;

public class SegitigaSamaSisi extends Segitiga {
    protected double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungKeliling() {
        alas = sisi;
        keliling = alas * 3;
        System.out.println("Keliling Segitiga Sama Sisi = " + keliling);
    }
}
