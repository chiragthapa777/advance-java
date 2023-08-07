/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.scst.bca.eventAdapter;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class mouseAdapterDemo extends JFrame{

    mouseAdapterDemo() {
        
        JButton btn =  new JButton("Click me");
        btn.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("CLicked");
            }
            
        });
        
        JTextField txt = new JTextField(20);
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key pressed");//To change body of generated methods, choose Tools | Templates.
            }
            
        });
        add(txt);
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle(" Mouse Event");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new mouseAdapterDemo();
    }
}
