/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampu;

/**
 *
 * @author donny
 */
public class Lampu implements ActivityLampu {
    public int statusLampu;
    @Override
	public void matikanLampu(){
		if(statusLampu ==0){
			System.out.println("Lampu sudah dalam kondisi mati");
		}else if(statusLampu == 1){
			statusLampu =- 1;
			System.out.println("Lampu sudah dimatikan");
		}
	}
    @Override
	public void hidupkanLampu(){
		if(statusLampu == 1){
			System.out.println("Lampu sudah dinyalakan");
		}else{
			statusLampu =- 1;
			System.out.println("Lampu sudah dalam kondisi menyala");
		}
	}
    @Override
	public void redupkanLampu(){
		if(statusLampu == 3){
			System.out.println("Lampu sudah redup");
		}else{
			statusLampu =- 1;
			System.out.println("Lampu sudah dalam kondisi redup");
		}
	}
	public int setSaklar(int saklar){
		return statusLampu = saklar;
	}
}
