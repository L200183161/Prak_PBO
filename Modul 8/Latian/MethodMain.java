/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latian;

/**
 *
 * @author donny
 */
public class MethodMain {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang = "+pp.getKell());
        System.out.println("Luas Persegi Panjang = "+pp.getLuas());
        System.out.println("\n");
        
        JajarGenjang JG = new JajarGenjang();
        System.out.println("Keliling Jajar Genjang = "+JG.getKell());
        System.out.println("Luas Jajar Genjang = "+JG.getLuas());
        System.out.println("\n");
        
        Lingkaran l = new Lingkaran();
        System.out.println("Keliling Lingkaran = "+l.getKell());
        System.out.println("Luas Lingkaran = "+l.getLuas());
        System.out.println("\n");
        
        Segitiga st = new Segitiga() {};
        System.out.println("Keliling Segitiga = " + st.getKell());
        System.out.println("Luas Segitiga = "+ st.getLuas());
        System.out.println("\n");
    }
}
