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
public class Tugas1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 1");
        String[] IsiTabel = {"Sangat tidak setuju", "tidak setuju", "kurang setuju",
            "kurang setuju", "Setuju", "Sangat Setuju",};
        JLabel Isi = new JLabel("Modul Praktikum Pemrograman Beriorientasi Objek Jelas dan Mudah");
        JComboBox comboBoxOption = new JComboBox(IsiTabel);
        Isi.setBounds(800, 50, 500, 25);
        comboBoxOption.setBounds(925, 80, 200, 25);
        frame.setSize(1920, 150);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxOption);
        frame.add(Isi);
    }
}
