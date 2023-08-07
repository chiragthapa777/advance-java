package np.scst.bca.layout;

import javax.swing.*;
import java.awt.*;

public class borderlayout extends JFrame {
    borderlayout(){
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("East");
        JButton b3 = new JButton("West");
        JButton b4 = new JButton("South");
        JButton b5 = new JButton("center");
//      flow layout tries to set all component near to center, position of component can change in layout

        setLayout(new BorderLayout());
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);
        setVisible(true);
        setTitle("border layout");
        setSize(500,400);
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new borderlayout();
    }
}
