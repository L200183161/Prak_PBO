public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal;

    public void Nil(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    public double NilaiUTS() {
        return nilaiUTS;
    }

    public double NilaiUAS() {
        return nilaiUAS;
    }

    public double NilaiTugas() {
        return nilaiTugas;
    }

    public double NilaiTotal() {
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        return nilaiTotal;
    }

    public static void main(String[] args){
        Nilai nilai = new Nilai();
        nilai.Nil(70, 60, 50);
        System.out.println("Nilai UTS : " + nilai.NilaiUTS() + "\n" +
                            "Nilai UAS : " + nilai.NilaiUAS() + "\n" +
                            "Nilai Tugas : " + nilai.NilaiTugas() + "\n" +
                            "\n" +
                            "Nilai Total : " + nilai.NilaiTotal());
    }
}
