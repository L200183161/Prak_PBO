/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author donny
 */
public class Demo {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setRasioBunga(0);
        System.out.println(b1.getRasioBunga());
        System.out.println("\n");

        BankPribadi b2 = new BankPribadi();
        b2.setRasioBunga(1);
        System.out.println(b2.getRasioBunga());
        System.out.println("\n");

        BankUmum b3 = new BankUmum();
        b3.setRasioBunga(2);
        System.out.println(b3.getRasioBunga());
        System.out.println("\n");

        BankPasar b4 = new BankPasar();
        b4.setRasioBunga(3);
        System.out.println(b4.getRasioBunga());
        System.out.println("\n");

        BankSyariah b5 = new BankSyariah();
        b5.setRasioBunga(4);
        System.out.println(b5.getRasioBunga());
        System.out.println("\n");
    }
}
