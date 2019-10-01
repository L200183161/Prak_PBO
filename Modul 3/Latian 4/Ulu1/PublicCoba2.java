package Ulu1;

import Ulu.PublicModifier;
public class PublicCoba2{
    public static void main (String[] args){
        PublicModifier pm = PublicModifier();
        pm.kali();
        pm.add();
        pm.minus();
        pm.devided();
        pm.average();
    }
}
   

/* Bisa diakses di method ini juga karena publicmodifier methodnya public so if its either in the other package 
unless they still can import so it will be called by the other */