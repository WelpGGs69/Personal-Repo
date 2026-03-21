// Notes for Java Swing GUI components
// JFrame = a GUI window to add components to
// JLabel = a GUI display area for a string of text, an image, or both

import javax.swing.*;
import java.awt.Color;

public class main {
    public static void main(String[] args) {
    /* 
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 150, 25);

        JButton button = new JButton("Submit");
        button.setBounds(180, 20, 90, 25);

        JLabel label = new JLabel("Enter your name: ");
        label.setBounds(20, 60, 250, 25);

        frame.setTitle("JavaGPT");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("java.icon.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });
        */
      new MyFrame();
    }
}