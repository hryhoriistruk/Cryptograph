// CryptographGUI.java (refactored)

package ua.com.javarush.gnew.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CryptographGUI {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private JButton encryptButton;
    private JButton decryptButton;

    public CryptographGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Cryptograph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TO DO: implement encryption logic here
                textArea.setText("Encryption not implemented yet.");
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TO DO: implement decryption logic here
                textArea.setText("Decryption not implemented yet.");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CryptographGUI();
            }
        });
    }
}
