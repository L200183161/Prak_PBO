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
public class BorderNumber2 extends JFrame {
    public BorderNumber2() {
        setSize(400, 200);
        setTitle("JAncok");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        b1.setBackground(Color.orange);
        b2.setBackground(Color.green);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.red);
        b5.setBackground(Color.blue);
        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.NORTH);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.WEST);
        setVisible(true);
    }
    public static void main(String[] args) {
        BorderNumber2 bn = new BorderNumber2();
    }
}
