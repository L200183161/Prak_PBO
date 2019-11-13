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
public class SegitigaSamaKaki extends Segitiga {
    protected double sisiMiring;

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public void hitungKeliling() {
        alas = 3;
        keliling = alas + (sisiMiring * 2);
        System.out.println("Keliling Segitiga Sama Kaki = " + keliling);
    }
}
