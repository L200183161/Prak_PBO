/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author donny
 */
public class Hewan {
    String nama;
    int kaki;
    String makan;
    String tipe;

    void jeneng(String namaHewan){
        nama = namaHewan;
    }
    void sikil(int kakiHewan){
        kaki = kakiHewan;
    }
    void pangan(String makanan){
        makan = makanan;
    }
    void tipe(String tipeHewan){
        tipe = tipeHewan;
    }
    void Print(){
        System.out.println(
                "Nama Hewan :"+nama+"\n"+
                "Jumlah Kaki:"+kaki+"\n"+
                "Makanan :"+makan+"\n"+
                "Tipe Hewan :"+tipe+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan hewan = new Hewan();
        
        hewan.jeneng("Harimau");
        hewan.sikil(4);
        hewan.pangan("Daging");
        hewan.tipe("Karnivora");
        hewan.Print();
        
        hewan.jeneng("Kerbau");
        hewan.sikil(4);
        hewan.pangan("Rumput");
        hewan.tipe("Herbivora");
        hewan.Print();
    
    }
    
}
