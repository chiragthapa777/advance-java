/*
 * WAP to create a swing application that demonstrates the use of MouseEvent Handling using MouseAdapter class.
 */
package lab2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author DELL
 */
public class lab2d extends JFrame {
     lab2d(){
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse clicked at: (" + x + ", " + y + ")");
            }

            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse pressed at: (" + x + ", " + y + ")");
            }

            public void mouseReleased(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse released at: (" + x + ", " + y + ")");
            }
        });
        add(panel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Key Event");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab2d();
    }
}
