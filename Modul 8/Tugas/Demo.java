/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author donny
 */
public class Demo {
    public static void main(String[] args) {
        Balok bl = new Balok();
        System.out.println("Volume Balok = "+bl.getVolume());
        System.out.println("Luas Permukaan Balok = "+bl.LuasPermukaan());
        System.out.println("\n");
        
        Kubus kb = new Kubus();
        System.out.println("Volume Jajar Genjang = "+ kb.getVolume());
        System.out.println("Luas Permukaan Jajar Genjang = "+kb.getLuasPermukaan());
        System.out.println("\n");
        
        Bola bb = new Bola();
        System.out.println("Volume Bola = "+bb.getVolume());
        System.out.println("Luas Permukaan Bola = "+bb.getLuasPermukaan());
        System.out.println("\n");
        
        Kerucut st = new Kerucut() {};
        System.out.println("Volume Kerucut = " + st.getVolume());
        System.out.println("Luas Kerucut = "+ st.getLuasPermukaan());
        System.out.println("\n");
    }
}
