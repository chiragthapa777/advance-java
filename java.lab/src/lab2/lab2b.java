package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//WAP to create a desktop application that can take a number and display whether
// it is prime or not. Try to optimize the prime number detecting algorithm.
public class lab2b extends JFrame {
    lab2b(){
        JTextField numTxt = new JTextField();
        JButton btn = new JButton("Check prime");
        JLabel l1 = new JLabel("");
        numTxt.setColumns(20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = numTxt.getText();
                int num = Integer.parseInt(text);
                if(checkPrime(num)){
                    l1.setText(num +" is a prime number");
                }else{
                    l1.setText(num +" is not a prime number");
                }

            }
        });


        add(numTxt);add(btn);add(l1);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Font Demo");
        setSize(500,500);
        setDefaultCloseOperation(3);
    }



    boolean checkPrime(int num){
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new lab2b();
    }
}
