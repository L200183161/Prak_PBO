/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latian;

/**
 *
 * @author donny
 */
public class PersegiPanjang extends MethodAbstract{
    int sisi = 5;
    int panjang = 10;
    
    public int luas(){
        return sisi*panjang;
    }
    
    public int keliling(){
        return 2*(sisi+panjang);
    }
}
