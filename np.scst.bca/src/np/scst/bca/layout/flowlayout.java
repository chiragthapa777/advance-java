package np.scst.bca.layout;

import javax.swing.*;
import java.awt.*;

public class flowlayout extends JFrame {
    flowlayout(){
        JLabel l1 = new JLabel("label 1");
        JLabel l2 = new JLabel("label 2");

//      flow layout tries to set all component near to center, position of component can change in layout

        add(l1);add(l2);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("flow layout");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new flowlayout();
    }
}
