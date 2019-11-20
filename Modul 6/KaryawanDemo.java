/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k = new Karyawan();
        k.setNama("Don");
        k.setGaji(3000000);
        k.setUsia(19);
        
        System.out.println(k.getNama());
        System.out.println(k.getGaji());
        System.out.println(k.getUsia());
        System.out.println("\n");
        
        Manager m = new Manager();
        m.setNama("Riz");
        m.setGaji(250000);
        m.setGajiManager(450000);
        m.setUsia(20);
        m.setJamKerja(13);
        
        System.out.println(m.getNama());
        System.out.println(m.getGaji());
        System.out.println(m.getGajiManager());
        System.out.println(m.getUsia());
        System.out.println(m.getjamKerja());
        System.out.println("\n");
        
        Manager m1 = new Manager();
        m1.setNama("Zal");
        m1.setGaji(120000);
        m1.setGajiManager(520000);
        m1.setUsia(22);
        m1.setJamKerja(12);
        
        System.out.println(m1.getNama());
        System.out.println(m1.getGaji());
        System.out.println(m1.getGajiManager());
        System.out.println(m1.getUsia());
        System.out.println(m1.getjamKerja());
        System.out.println("\n");
        
        Manager m2 = new Manager();
        m2.setNama("Adh");
        m2.setGaji(4500000);
        m2.setGajiManager(5000000);
        m2.setUsia(26);
        m2.setJamKerja(15);
        
        System.out.println(m2.getNama());
        System.out.println(m2.getGaji());
        System.out.println(m2.getGajiManager());
        System.out.println(m2.getUsia());
        System.out.println(m2.getjamKerja());
        System.out.println("\n");
        
        Manager m3 = new Manager();
        m3.setNama("Dhi");
        m3.setGaji(250000);
        m3.setGajiManager(450000);
        m3.setUsia(30);
        m3.setJamKerja(13);
        
        System.out.println(m3.getNama());
        System.out.println(m3.getGaji());
        System.out.println(m3.getGajiManager());
        System.out.println(m3.getUsia());
        System.out.println(m3.getjamKerja());
        System.out.println("\n");
        
        Manager m4 = new Manager();
        m4.setNama("Pratama");
        m4.setGaji(25042000);
        m4.setGajiManager(450123000);
        m4.setUsia(35);
        m4.setJamKerja(7);
        
        System.out.println(m4.getNama());
        System.out.println(m4.getGaji());
        System.out.println(m4.getGajiManager());
        System.out.println(m4.getUsia());
        System.out.println(m4.getjamKerja());
        System.out.println("\n");
        
    
    
    
    }
}
