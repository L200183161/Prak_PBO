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
public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super ("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtkOK = new JButton("OK");
        kontainer.add(jbtkOK);
    }
}
