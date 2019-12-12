/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author donny
 */
public class Tugas2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 2");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Ubah Warna");
        ButtonGroup buttongroup = new ButtonGroup();
        JRadioButtonMenuItem merah = new JRadioButtonMenuItem("Merah");        
        JRadioButtonMenuItem kuning = new JRadioButtonMenuItem("Kuning");
        JRadioButtonMenuItem hijau = new JRadioButtonMenuItem("Hijau");
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 250, 250);
        merah.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,0,0));
            }
        });
        kuning.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,255,0));
            }
        });
        hijau.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(0,255,0));
            }
        });
        buttongroup.add(merah);
        buttongroup.add(kuning);
        buttongroup.add(hijau);
        menu.add(merah);
        menu.add(kuning);
        menu.add(hijau);
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setUndecorated(true);
        frame.setVisible(true);         
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}