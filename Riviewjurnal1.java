/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.riviewjurnal1;

/**
 *
 * @author user
 */

import javax.swing.*;
import java.awt.event.*;

public class Riviewjurnal1 extends JFrame {
    private JTextField txtNama, txtUsia, txtAlamat;
    private final JButton btnSimpan;
    private JTextArea taData;

    public Riviewjurnal1() {
        setTitle("Aplikasi Pengolahan Data Pengguna");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(10, 10, 80, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(100, 10, 150, 25);
        add(txtNama);

        JLabel lblUsia = new JLabel("Usia:");
        lblUsia.setBounds(10, 40, 80, 25);
        add(lblUsia);

        txtUsia = new JTextField();
        txtUsia.setBounds(100, 40, 150, 25);
        add(txtUsia);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(10, 70, 80, 25);
        add(lblAlamat);

        txtAlamat = new JTextField();
        txtAlamat.setBounds(100, 70, 150, 25);
        add(txtAlamat);

        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(100, 100, 100, 30);
        add(btnSimpan);

        taData = new JTextArea();
        taData.setBounds(10, 140, 350, 100);
        taData.setEditable(false);
        add(taData);

        btnSimpan.addActionListener((ActionEvent e) -> {
            String nama = txtNama.getText();
            String usia = txtUsia.getText();
            String alamat = txtAlamat.getText();
            taData.append("Nama: " + nama + "\nUsia: " + usia + "\nAlamat: " + alamat + "\n\n");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Riviewjurnal1().setVisible(true);
        });
    }
}
