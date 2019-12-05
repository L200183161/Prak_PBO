/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getnum(){
            System.out.println("Ini adalah nilai dari variable private outerDemo");
            return num;
        }
    }
}
