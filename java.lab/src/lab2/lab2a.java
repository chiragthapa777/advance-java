package lab2;

//WAP to display the use of various font families and styles in a swing application.

import javax.swing.*;
import java.awt.*;

public class lab2a extends JFrame{
    lab2a(){
        //font family:serif SnsSerif Dialog DialogInput Monospace
        //font style: PLAIN BOLD ITALIC BOLD|ITALIC

        JLabel j1 = new JLabel("SERIF");
        JLabel j2 = new JLabel("SANS_SERIF");
        JLabel j3 = new JLabel("DIALOG_INPUT");
        JLabel j4 = new JLabel("DIALOG");
        JLabel j5 = new JLabel("MONOSPACED");
        //                      family      style      size
        j1.setFont(new Font(Font.SERIF,Font.PLAIN,10));
        j2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,10));
        j3.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,10));
        j4.setFont(new Font(Font.DIALOG,Font.BOLD|Font.ITALIC,10));
        j5.setFont(new Font(Font.MONOSPACED,Font.PLAIN,10));


        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);


        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font Demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab2a();
    }
}
