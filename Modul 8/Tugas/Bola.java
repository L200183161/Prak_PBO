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
public class Bola extends MethodAbstract {
    final double phi = 3.14;
    double r = 7;
    
    public double Volume(){
        return 4/3 * phi * r*r*r;
    }
    
    public double LuasPermukaan(){
        return 4 * phi * r*r;
    }
}
