package Tugas;

/**
 *
 * @author donny
 */
public class Demo {
    public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        SegitigaSamaKaki segitigasamakaki = new SegitigaSamaKaki();
        SegitigaSamaSisi segitigasamasisi = new SegitigaSamaSisi();
        persegi.setSisi(5);
        System.out.println("Sisi = " + persegi.getSisi());
        persegi.hitungLuas();
        persegi.hitungKeliling();
        System.out.println();
        persegipanjang.setPanjang(4);
        persegipanjang.setLebar(2);
        System.out.println("Panjang = " + persegipanjang.getPanjang());
        System.out.println("Lebar = " + persegipanjang.getLebar());
        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();
        System.out.println();
        segitigasamakaki.setSisiMiring(3);
        System.out.println("Sisi Miring = " + segitigasamakaki.getSisiMiring());
        segitigasamakaki.hitungKeliling();
        System.out.println();
        segitigasamasisi.setSisi(3);
        System.out.println("Sisi = " + segitigasamasisi.getSisi());
        segitigasamasisi.hitungKeliling();
    }
}