
package np.scst.bca.event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class mouseEvent extends JFrame {
    public Graphics2D d2;
    mouseEvent(){
        
//        JButton jButton = new JButton("Click me");
        
//        jButton.addMouseListener(new MouseListener(){
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("Mouse clicked");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("mouse pressed");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("mouse released");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                System.out.println("mouse entered"); 
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println("mouse exited");
//            }
//        });
        
        JPanel jp = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                d2 = (Graphics2D)g.create();
                d2.setColor(Color.BLACK);
                int x = 50;
                int y = 50;
                d2.fillRect(x, y, 5, 5);
            }
            
            
        };
        jp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX());
                d2.setColor(Color.BLACK);
                d2.fillRect(e.getX(), e.getY(), 5, 5);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                d2.setColor(Color.BLACK);
                d2.fillRect(e.getX(), e.getY(), 5, 5);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        add(jp);
//        add(jButton);
//        setLayout(new FlowLayout());
        setVisible(true);
        setTitle(" Mouse Event");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        mouseEvent m = new mouseEvent();
    }
    
}
