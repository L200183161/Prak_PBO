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
public class JajarGenjang extends MethodAbstract {
    int a = 3;
    int b = 4;
    int tinggi = 5;
    
    public int luas(){
        return a*tinggi;
    }
    
    public int keliling(){
        return 2*(a+b);
    }
}
