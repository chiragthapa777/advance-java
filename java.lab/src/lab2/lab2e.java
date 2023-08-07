/*
 * Create any five components of java swing, now using GridLayout, arrange them in a formation of 2x3 grids inside a JPanel
 */
package lab2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class lab2e extends JFrame {
       lab2e(){
        
        JPanel panel = new JPanel(new GridLayout(2, 3));

        // Create and add components to the panel
        JButton button1 = new JButton("Btn 1");
        panel.add(button1);

        JButton button2 = new JButton("Btn 2");
        panel.add(button2);

        JLabel label1 = new JLabel("l1");
        panel.add(label1);

        JLabel label2 = new JLabel("l2");
        panel.add(label2);

        JTextField textField = new JTextField("");
        panel.add(textField);

        JCheckBox checkBox = new JCheckBox("Check Box");
        panel.add(checkBox);

        add(panel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Layout");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab2e();
    }
}
