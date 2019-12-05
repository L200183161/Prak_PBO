/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class NestedClass {
    String nama = "Donny Rizal";
    String nim = "L200183161";
    public void printNama(){
        System.out.println(nama + " : \n" + nim);
    }
    static class StaticNestedClass{
        static String jurusan = "Informatika";
        public void printNama1(){
            NestedClass nest = new NestedClass();
            nest.printNama();
        }
    }
    class InnerClass{
        public void print_jurusan(){
            NestedClass.StaticNestedClass jur = new NestedClass.StaticNestedClass();
            System.out.println("Jurusan " + jur.jurusan );
        }
        
    }
    
}
