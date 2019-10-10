public class Coba {
     public static void main (String[] args){
        Pegawai pg = new Pegawai();
        Pegawai pg2 = new Pegawai(2);
        Pegawai pg3 = new Pegawai(1);
        Pegawai pg1 = new Pegawai(0);
        /*pg.SetNama("Donny");
        pg.SetNIM("L200183161");*/
        System.out.println("Nama Saya : " + pg.getName());
        System.out.println("NIM : " + pg.getNIM());        }
}
