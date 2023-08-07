package actionHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ActionDemo extends JFrame{
    ActionDemo(){
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Action hero");
        setSize(500,500);
        setDefaultCloseOperation(3);
        this.loadUi();
    }

     void loadUi(){
        JButton jbtn = new JButton("Thiiich malai");
        add(jbtn);
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("thich yo malai, guwaarrr!!!");
            }
        });
    }

    public static void main(String[] args) {
        new ActionDemo();
    }
}
