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
public class FlowPanel extends JPanel {
    public FlowPanel(){
        setLayout(new FlowLayout());
        setBackground(Color.GREEN);
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        add (b1);
        add (b2);
        add (b3);
        add (b4);
    }
}
