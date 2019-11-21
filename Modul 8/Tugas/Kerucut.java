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
public class Kerucut extends MethodAbstract{
    final double phi = 3.14;
    double r = 7;
    double t = 14;
    double s = 10;
    
    public double Volume(){
        return phi*r*r*t*1/3;
    }
    
    public double LuasPermukaan(){
        return phi * r * (r+s);
    }
}
