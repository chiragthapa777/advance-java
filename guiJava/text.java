import javax.swing.*;
import java.awt.*;

public class text extends JFrame {
    text(){
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font Demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
        JLabel j1 = new JLabel("j1");
        JLabel j2 = new JLabel("j2");
        JLabel j3 = new JLabel("j3");
        JLabel j4 = new JLabel("j4");


        ImageIcon img = new ImageIcon("pic.jpg");


        JLabel j5 = new JLabel(img);

        JButton jButton = new JButton(img);
        add(jButton);

        j1.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        j2.setFont(new Font(Font.DIALOG,Font.BOLD,30));

        add(j1);add(j2);add(j3);add(j4);add(j5);

    }

    public static void main(String[] args) {
        new text();
    }
}
