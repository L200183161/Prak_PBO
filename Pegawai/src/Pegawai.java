
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {

    private String name = " Donny ";
    private String NIM = "L200XX";

    public Pegawai() {
        System.out.println("###Program Quiz###");
    }

    public Pegawai(int PiihanJabatan) {
        setJabatan(PiihanJabatan);
    }

    protected void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    protected void setNIM(String newNIM) {
        this.NIM = newNIM;
    }

    public String getNIM() {
        return NIM;
    }

    private void setJabatan(int PiihanJabatan) {
        double gajiPokok = 0, tunjangan;
        System.out.println("\nUntuk mengetahui rincinan gaji, masukkan jabatan :\n"
                + "1. Manager Senior\n" + "2. Manager Junior");
        if (PiihanJabatan == 1) {
            gajiPokok = 2000;
            tunjangan = 500;
            System.out.println("Gaji Pokok = $" + gajiPokok + "\nTunjangan = $" + tunjangan);
        } else if (PiihanJabatan == 2) {
            gajiPokok = 1500;
            tunjangan = 3500;
            System.out.println("\nGaji Pokok = $ " + gajiPokok + "\nTunjangan = $" + tunjangan);
        } else {
            System.out.println("\nMohon masukkan no pilihan dengan benar");
        }
        double GajiRp = gajiPokok * 14500;
        NumberFormat KursIndo = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        System.out.printf("\n Jika Kurs Dollar ke Rupiah : Rp. 14.500.00"
                + "\n Maka Gaji dalam Rupiah : %s %n", KursIndo.format(GajiRp));
    }

    public static void main(String[] args) {
        Pegawai pg = new Pegawai();
        pg.setName("Donny Rizal");
        pg.setNIM("XXXX1808412");
        System.out.println("Nama Saya :" + pg.getNIM());
        System.out.println("NIM : " + pg.getName());
        Pegawai pg2 = new Pegawai();
        Pegawai pg3 = new Pegawai(2);
        Pegawai pg4 = new Pegawai(0);
    }
}
