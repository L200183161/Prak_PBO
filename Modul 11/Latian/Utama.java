/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

/**
 *
 * @author donny
 */
public class Utama extends javax.swing.JFrame{
    public Utama(){
        super ("Belajar mengenal GUI");
        setSize(300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Utama u = new Utama();
    }
}
