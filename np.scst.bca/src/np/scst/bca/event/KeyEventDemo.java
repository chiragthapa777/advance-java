/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.scst.bca.event;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class KeyEventDemo extends JFrame {

    public KeyEventDemo() {
        
        JTextField tf = new JTextField(20);
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("key typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key released");
            }

            
        });
        
        add(tf);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle(" Mouse Event");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
