public class Buku {
    String NamaPengarang;
    String JudulBuku;
    int TahunTerbit;
    int CetakanKe;
    double HargaJual;
    
    public Buku(){
        NamaPengarang = "Takahiro Moriuchi";
        JudulBuku = "How to be ONE OK ROCK";
        TahunTerbit = 2019;
        CetakanKe = 10969;
        HargaJual = 1000000.00;
    }
    public Buku(String NamaPengarang, String JudulBuku
    , int TahunTerbit, int CetakanKe, double HargaJual){
        this.NamaPengarang = NamaPengarang;
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.CetakanKe = CetakanKe;
        this.HargaJual = HargaJual;
    }
    public void Print(){
        System.out.println("Nama Pengarang = "+ NamaPengarang +"\nJudul Buku = " + JudulBuku + "\nTahun Terbit = " + TahunTerbit +
        "\nCetakan Ke = " + CetakanKe + "\nHarga Jual = " + HargaJual +"\n");
    }
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.Print();
        Buku buku2 = new Buku("Kakek Sugiono", "How to be The most Famous kakek in the world", 1999, 12, 666111666);
        buku2.Print();
        Buku buku3 = new Buku("Fahri Hamzah", "How to Prank the all elements in Indonesia", 2019, 1, 10000.00);
        buku3.Print();
        Buku buku4 = new Buku("Hyji-kun", "How to be The most Famous artist in the world", 2017, 2, 164323.00);
        Buku buku5 = new Buku("Nezuko-chan", "How to be The cutest creature in Anime", 2013, 3, 5000.00);
        buku5.Print();
    }
}