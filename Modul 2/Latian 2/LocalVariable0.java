public class LocalVariable0 {
    int usia = 0;

    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 3;

        beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
    public static void main(String[] args) {
        LocalVariable0 dis = new LocalVariable0();
        dis.hitungUsia();
        dis.beratBadan();
    }
}

/*
Answer No. 3
Right now we can call "usia" variable, because the variabel is instance variable that take place outside any method.
 */
