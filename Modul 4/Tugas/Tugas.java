public class Tugas{
    String Nama;
    String WhoIsHe;

    public Tugas(){
        Nama = "Takahiro Morata";
        WhoIsHe = "Lead Singer ONE OK ROCK";
        System.out.println("Personel Name " + Nama + "\n So who is he? " + WhoIsHe +"\n");
    }
    public Tugas(String Nama, String WhoIsHe){
        this.Nama = Nama;
        this.WhoIsHe = WhoIsHe;
        System.out.println("Personel Name " + Nama + "\n So who is he? " + WhoIsHe +"\n");
    }
    public static void main(String[] args) {
        Tugas Band = new Tugas();
        Tugas Band1 = new Tugas("Toru Yamashita", "Guitarist and Leader of ONE OK ROCK");
    }
}