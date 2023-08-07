/*
* Write a Program (WAP) to display a star shape inside of a swing application.
 */
package lab1;

import java.awt.*;
import javax.swing.*;
public class lab1a extends JFrame {
        lab1a(){
        setDefaultCloseOperation(3);
        JPanel panel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g.create();
               
                int[] x={50,60,100,60,50,40,0,40,50};
                int[] y={0,40,50,60,100,60,50,40,0};
                g.drawPolyline(x, y, 9);
            }
        };
        add(panel);
        setTitle("Star Shape");
        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        new lab1a();
    }
}
