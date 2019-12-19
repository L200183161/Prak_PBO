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
public class LayoutNumber1 extends JFrame {
    public LayoutNumber1(){
        setSize(400, 200);
        setTitle("Belajar Layout Manager");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel L1 = new JLabel("EAST");
        JLabel L2 = new JLabel("WEST");
        JLabel L3 = new JLabel("NORTH");
        JLabel L4 = new JLabel("SOUTH");
        JLabel L5 = new JLabel("CENTER");
        L1.setBackground(Color.RED);
        L1.setOpaque(true);
        L2.setBackground(Color.BLUE);
        L2.setOpaque(true);
        L3.setBackground(Color.GREEN);
        L3.setOpaque(true);
        L4.setBackground(Color.YELLOW);
        L4.setOpaque(true);
        L5.setBackground(Color.ORANGE);
        L5.setOpaque(true);
        
        add(L1);
        add(L2);
        add(L3);
        add(L4);
        add(L5);
        setVisible(true);
    }
    public static void main(String[] args) {
        LayoutNumber1 l = new LayoutNumber1();
    }
}
