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
public class BankUmum extends Bank{
    public void setRasioBunga(int Bunga) {
        this.Bunga = Bunga;
    }
    protected int getRasioBunga() {
        return Bunga;
    }
}
