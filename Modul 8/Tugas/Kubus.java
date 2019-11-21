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
public class Kubus extends MethodAbstract {
    double sisi = 10;
    
    public double Volume(){
        return sisi*sisi*sisi;
    }
    
    public double LuasPermukaan(){
        return 6*sisi;
    }
}
