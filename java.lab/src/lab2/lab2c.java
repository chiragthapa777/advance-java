/*
 * 
WAP to create a swing application that demonstrates the use of KeyEvent Handling..
 */
package lab2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author DELL
 */
public class lab2c extends JFrame {
     lab2c(){
        
        JTextField tf = new JTextField(20);
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_ENTER) {
                    String text = tf.getText();
                    System.out.println("Entered text: " + text);
                    tf.setText("");
                }
            }
        });
        add(tf);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Key Event");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab2c();
    }
}
