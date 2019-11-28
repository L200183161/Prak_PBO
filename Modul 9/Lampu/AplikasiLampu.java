/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lampu;

import java.util.Scanner;


/**
 *
 * @author donny
 */
public class AplikasiLampu {
    public static void main(String[] args){
		Lampu lampu = new Lampu();
		Scanner sc = new Scanner(System.in);
		lampu.statusLampu = lampu.setSaklar(0);
		System.out.println("Status lampu = "+lampu.statusLampu+"\nketikkan");
		System.out.println("1 untuk Menyalakan Lampu\n0 untuk mematikan lampu");
		while(lampu.statusLampu != 3){
			if(lampu.setSaklar(sc.nextInt()) == 0){
				lampu.matikanLampu();
				if(lampu.setSaklar(sc.nextInt()) == 0){
					lampu.matikanLampu();
				}
				else{
					lampu.hidupkanLampu();
				}
			}else{
				lampu.hidupkanLampu();
					if(lampu.setSaklar(sc.nextInt()) == 0){
						lampu.hidupkanLampu();
						if(lampu.setSaklar(sc.nextInt()) == 0 ){
							lampu.hidupkanLampu();
						}
						else{
							lampu.matikanLampu();
						}
					}
					else{
						lampu.matikanLampu();
					}
			}
			lampu.statusLampu++;
		}
	}
}
