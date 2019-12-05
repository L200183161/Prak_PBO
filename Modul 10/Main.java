/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class Main {
    public static void main(String[] args) {
        NestedClass nest = new NestedClass();
        NestedClass.StaticNestedClass snes = new NestedClass.StaticNestedClass();
        nest.printNama();
        snes.printNama1();
        NestedClass.InnerClass ic = nest.new InnerClass();
        ic.print_jurusan();
        
        
    }
}
