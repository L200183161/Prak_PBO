/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author donny
 */
public class GridNumber3 extends JFrame {
    public GridNumber3() {
        setSize(400, 200);
        setTitle("Mewarnai");
        setLayout(new GridLayout(1,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel b1 = new JLabel("255,102,102");
        b1.setBackground(new java.awt.Color(255,102,102));
        b1.setOpaque(true);
        JLabel b2 = new JLabel("255,51,51");
        b2.setBackground(new java.awt.Color(255,51,51));
        b2.setOpaque(true);
        JLabel b3 = new JLabel("255,0,0");
        b3.setBackground(new java.awt.Color(255, 0,0));
        b3.setOpaque(true);
        JLabel b4 = new JLabel("BUTTON 4");
        b4.setBackground(new java.awt.Color(204, 0, 0));
        b4.setOpaque(true);
        JLabel b5 = new JLabel("153,0,0");
        b5.setBackground(new java.awt.Color(153, 0, 0));
        b5.setOpaque(true);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        GridNumber3 gr = new GridNumber3();
    }
}
