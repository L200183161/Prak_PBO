public class Karyawan {
    String nama;
    double gaji;
    String jabatan;
    String alamat;

    void nama(String namaKaryawan){
        nama = namaKaryawan;
    }
    void gaji(int gajiKaryawan){
        gaji = gajiKaryawan;
    }
    void jabatan(String JabatanKaryawan){
        jabatan = JabatanKaryawan;
    }
    void Rumah(String alamatRumah){
        alamat = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama Karyawan :"+nama+"\n"+
                "Gaji per Bulan:"+gaji+"\n"+
                "Jabatan Kerja :"+jabatan+"\n"+
                "Alamat Rumah Karyawan :"+alamat+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan = new Karyawan();
        
        karyawan.nama("Donny Rizal");
        karyawan.gaji(9000000);
        karyawan.jabatan("Project Manager");
        karyawan.Rumah("Mendungan no.8");
        karyawan.Print();
        
    
    }
    
}
