package np.scst.bca.layout;

import javax.swing.*;
import java.awt.*;

public class cardlayout extends JFrame {
    cardlayout(){
        JLabel l1 = new JLabel("label 1");
        JLabel l2 = new JLabel("label 2");

//        null layout is default of swing layout which shows only last element
//        card layout imposes one component over another

        add(l1);add(l2);
        setLayout(new CardLayout());
        setVisible(true);
        setTitle("Card layout");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new cardlayout();
    }
}
