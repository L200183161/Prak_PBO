/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class OuterDemo {
    int num;
    
    private class InnerDemo{
        private void print(){
            System.out.println("Ini Merupakan Method Inner Class");
        }
    }
    void displayInner(){
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}
