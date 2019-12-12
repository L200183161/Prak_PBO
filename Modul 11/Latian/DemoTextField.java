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
public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama :");
        JLabel password = new JLabel("Password :");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputPsw =  new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputPsw);
        u.add(panel);
    }
    
}
