package np.scst.bca.practiseForExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registration  extends JFrame {
    registration(){
        JLabel nameLabel = new JLabel("User Name");
        nameLabel.setBounds(10,10,200,20);

        JTextField nameTxt = new JTextField(20);
        nameTxt.setBounds(250,10,200,20);

        JLabel pwLabel = new JLabel("Password");
        pwLabel.setBounds(10,50,200,20);

        JTextField pwTxt = new JTextField(20);
        pwTxt.setBounds(250,50,200,20);


        JButton submit = new JButton("Submit");
        submit.setBounds(250,100,200,20);

        // add checkbox and radio button


        JLabel out = new JLabel();
        out.setBounds(10,150,200,20);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameTxt.getText();
                String pw = pwTxt.getText();
                out.setText("Name = "+username+" Pw = "+pw);
                //save in db;
            }
        });



        add(out);
        add(nameTxt);
        add(nameLabel);
        add(pwLabel);
        add(pwTxt);
        add(submit);

        setLayout(null);
        setVisible(true);
        setTitle("User registration");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new registration();
    }
}
