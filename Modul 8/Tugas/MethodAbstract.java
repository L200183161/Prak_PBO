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
public abstract  class MethodAbstract {
    public abstract double Volume();
    public abstract double LuasPermukaan();
    
    public double getVolume(){
        return Volume();
    }
    
    public double getLuasPermukaan(){
        return LuasPermukaan();
    }
}
