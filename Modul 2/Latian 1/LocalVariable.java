public class LocalVariable {
    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan(){
        int beratBadan = 0;
        int beratLahir = 3;
        
        beratBadan = beratLahir + (usia/2);
        
        System.out.println("Berat badan saya :"+beratBadan);
    }
    public static void main (String[] args){
        LocalVariable dis = new LocalVariable();
        dis.hitungUsia();
        dis.beratBadan();
    }
}
For the question on the modul is "Is the "usia" variable can be called on void
beratBadan()??
- No it wont be called cause it is located on the outside of the class method of 
hitungUsia
*/
