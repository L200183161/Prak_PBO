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
public class TestPolymorphism {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.beriNama("TOM");
        System.out.println(kucing.panggilNama());
        System.out.println(kucing.perilaku());
        System.out.println(kucing.makanan());

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.beriNama("BULL");
        System.out.println(anjing.panggilNama());
        System.out.println(anjing.perilaku());
        System.out.println(anjing.makanan());
    }
}
