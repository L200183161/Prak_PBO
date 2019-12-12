
import java.net.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donny
 */
public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500,500);
        URL img = FrameB.class.getResource("Shakehand2.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);   
        }
    }
