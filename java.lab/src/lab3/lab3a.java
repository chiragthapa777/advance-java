package lab3;
//Create any five components of java swing, now using BorderLayout, arrange them in a 5 directional formatio

import java.awt.*;
import javax.swing.*;

public class lab3a extends JFrame {
      lab3a(){
        
        JPanel panel = new JPanel(new BorderLayout());

        // Create and add components to the panel
        JButton buttonNorth = new JButton("North");
        panel.add(buttonNorth, BorderLayout.NORTH);

        JButton buttonSouth = new JButton("South");
        panel.add(buttonSouth, BorderLayout.SOUTH);

        JButton buttonEast = new JButton("East");
        panel.add(buttonEast, BorderLayout.EAST);

        JButton buttonWest = new JButton("West");
        panel.add(buttonWest, BorderLayout.WEST);

        JButton buttonCenter = new JButton("Center");
        panel.add(buttonCenter, BorderLayout.CENTER);

        add(panel);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Layout");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new lab3a();
    }
}
