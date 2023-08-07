package np.scst.bca.layout;

import javax.swing.*;
import java.awt.*;

public class gridlayout extends JFrame {
    gridlayout(){
        JLabel l1 = new JLabel("label 1");
        JLabel l5 = new JLabel("label 5");
        JLabel l2 = new JLabel("label 2");
        JLabel l3 = new JLabel("label 3");
        JLabel l4 = new JLabel("label 4");
        JLabel l6 = new JLabel("label 6");

//      flow layout tries to set all component near to center, position of component can change in layout

        add(l1);add(l2);
        add(l3);add(l4);
        add(l5);add(l6);
        setLayout(new GridLayout(2,3));
        setVisible(true);
        setTitle("grid layout");
        setSize(500,400);
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new gridlayout();
    }

}
