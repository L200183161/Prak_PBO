/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author donny
 */
public class Pet {
    private String nama;

    public void beriNama(String beriNama) {
        this.nama = beriNama;
    }

    public String panggilNama(){
        return nama;
    }

    public String perilaku() {
        return "Hewan Penurut";
    }

}

