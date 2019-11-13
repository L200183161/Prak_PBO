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
public class PersegiPanjang extends BangunDatar {
    protected int panjang;
    protected double lebar;

    public double getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void hitungLuas() {
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }

    public void hitungKeliling() {
        keliling = (panjang + lebar) * 1;
        System.out.println("Keliling Persegi Panjang = " + keliling);
    }
}
