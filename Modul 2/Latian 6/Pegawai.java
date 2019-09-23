public class Pegawai {
    String nama;
    int NIP;
    double gaji;
    String Alamat;
    String jabatan;
    String ttl;
    
    public void peg(String namaPeg,double GajiPeg, int NIPPeg, String AlamatPeg
    , String JabatanPeg, String TTLPeg){
        this.nama = namaPeg;
        this.gaji= GajiPeg;
        this.NIP = NIPPeg;
        this.Alamat = AlamatPeg;
        this.jabatan = JabatanPeg;
        this.ttl = TTLPeg;
        System.out.println("Nama Pegawai :"+nama+ "\n" + "Gaji      :" +gaji+ " \nNIP Pegawai :"
            + NIP + "\nAlamat Rumah:" +Alamat+ "\nJabatan      :" +jabatan+ "\nTTL          :"
            +ttl+"\n");
             
    }
    
    public static void main (String[] args){
        Pegawai pns = new Pegawai();
        Pegawai pns1 = new Pegawai();
        Pegawai pns2 = new Pegawai();
        Pegawai pns3 = new Pegawai();
        Pegawai pns4 = new Pegawai();
        Pegawai pns5 = new Pegawai();
        pns.peg("Donny Rizal Adhi P", 3500000, 3412612, "Rembang", "Ekselon XXX", 
                "21 Agustus 1999");
        pns1.peg("Ai Lop You", 2500000, 132423, "Solo", "Ekselon XVII", 
                "13 November 1995");
        pns2.peg("Ai Hate You", 2000000, 19395325, "Surakarta", "Ekselon X", 
                "12 November 1953");
        pns3.peg("Lay Lay Lay", 1500000, 18426, "Jebres", "Skeleton VI", 
                "1 Januari 1995");
        pns4.peg("Joker", 9999990, 1323423, "USA", "Ekselon XV2", 
                "Undefined");
        pns5.peg("Now You Have an Opportunity", 3100000, 132423, "Solo", "Ekselon XVII", 
                "21 Januari 1995");
    }
}
    

