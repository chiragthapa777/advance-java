package lab1;

/*
 * WAP to display ‘Hello world’ in a JLabel, contained inside of a cyan-backgrounded JPanel, inside of a JFrame.
 */

import java.awt.*;
import javax.swing.*;
public class lab1b extends JFrame {
    lab1b(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        JLabel jlabel = new JLabel("Hello World");
        jlabel.setBackground(Color.cyan);
        panel.add(jlabel);
        add(panel);
        setDefaultCloseOperation(3);
        setTitle("Star Shape");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new lab1b();
    }
}
