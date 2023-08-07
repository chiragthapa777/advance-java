/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Shape extends JFrame {
    public Shape(){
        JPanel jp = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D) g.create();
                g2.drawLine(1, 1, 40, 40);
                g2.setColor(Color.red);
//                g2.drawLine(100, 100, 600, 600);
//                g2.drawRect(200, 200, 600, 600);
//                g2.drawOval(300, 300, 30, 70);
//                int[] x = {250,400,400,100,100};
//                int[] y = {400,300,200,200,300};
//                g2.drawPolygon(x,y,5);
                int[] x2 = {200,400,200};
                int[] y2 = {100,300,300};
                g2.drawLine(100, 200, 300, 400);
                g2.drawLine(300, 400, 300, 200);
                g2.drawLine(300, 200, 100, 200);
                g2.setColor(Color.cyan);
                g2.drawPolygon(x2,y2,3);
            }
        };
        add(jp);
        setVisible(true);
        setTitle("Shapes");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new Shape();
    }
}
