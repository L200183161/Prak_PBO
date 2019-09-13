public class Mahasiswa {
    String nama;
    int semester;
    String nim;
    String alamat;

    void nama(String namaMahasiswa){
        nama = namaMahasiswa;
    }
    void semester(int semesterMahasiswa){
        semester = semesterMahasiswa;
    }
    void nim(String Pendidikan){
        nim = Pendidikan;
    }
    void Rumah(String alamatRumah){
        alamat = alamatRumah;
    }
    void Print(){
        System.out.println(
                "Nama Mahasiswa :"+nama+"\n"+
                "Semester :"+semester+"\n"+
                "NIM :"+nim+"\n"+
                "Alamat Rumah Mahasiswa :"+alamat+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nama("Donny Rizal");
        mahasiswa.semester(3);
        mahasiswa.nim("L200183161");
        mahasiswa.Rumah("Mendungan no.8");
        mahasiswa.Print();
        
    
    }
}