/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author donny
 */
public class CustomerData {
    String nama;
    String alamat;
    String tanggalLahir;
    String pekerjaan;
    double gaji;

    public CustomerData() {
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(tanggalLahir);
        System.out.println(pekerjaan);
        System.out.println(gaji);
    }

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(tanggalLahir);
        System.out.println(pekerjaan);
        System.out.println(gaji);
    }
}
