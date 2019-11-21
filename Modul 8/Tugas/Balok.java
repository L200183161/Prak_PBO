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
public class Balok extends MethodAbstract {
    double p = 3;
    double l = 4;
    double t = 5;
    
    public double Volume(){
        return p*l*t;
    }
    
    public double LuasPermukaan(){
        return 2*(p*l + p*t + l*t);
    }
}
