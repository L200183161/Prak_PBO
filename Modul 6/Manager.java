/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class Manager extends Karyawan {
    private float jamKerja = 7.5f;
    private float GajiManager;
    
    public float getjamKerja(){
        return jamKerja;
    }
    public float getGajiManager(){
        return getGaji() *2;
    }
    public void setJamKerja(float jamKerja){
        this.jamKerja = jamKerja;
    }
    public void setGajiManager(float GajiManager){
        this.GajiManager = GajiManager;
    }
}
