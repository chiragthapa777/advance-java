/*
 * WAP to display the image of the logo of your college inside a swing application.
 */
package lab1;

import java.awt.*;
import javax.swing.*;

public class lab1c extends JFrame {
    lab1c(){
        ImageIcon img = new ImageIcon("logo.png");
        JLabel imgLabel = new JLabel(img);
        add(imgLabel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font Demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab1c();
    }
}
