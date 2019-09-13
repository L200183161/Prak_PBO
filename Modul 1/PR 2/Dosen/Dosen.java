/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

/**
 *
 * @author donny
 */
public class Dosen {
    String nama;
    int nomer;
    String Jenjang;
    String tanggal;

    void jeneng(String namaDosen){
        nama = namaDosen;
    }
    void nomer(int nikDosen){
        nomer = nikDosen;
    }
    void Dude(String Pendidikan){
        Jenjang = Pendidikan;
    }
    void Lahir(String tanggalLahir){
        tanggal = tanggalLahir;
    }
    void Print(){
        System.out.println(
                "Nama Dosen :"+nama+"\n"+
                "NIK:"+nomer+"\n"+
                "Pendidikan :"+Jenjang+"\n"+
                "Tanggal Lahir Dosen :"+tanggal+"\n"
        );
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        
        dosen.jeneng("Donny Rizal");
        dosen.nomer(200180161);
        dosen.Dude("UMS");
        dosen.Lahir("15 Agustus 1999");
        dosen.Print();
        
    
    }
    
}
