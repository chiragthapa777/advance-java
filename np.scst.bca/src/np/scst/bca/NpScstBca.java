/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package np.scst.bca;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class NpScstBca extends JFrame{
    
    NpScstBca(){
        JLabel l1 = new JLabel("hello world");
        setVisible(true);
        setSize(400,400);
        add(l1);
        setDefaultCloseOperation(3);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        new NpScstBca();
    }
    
}
