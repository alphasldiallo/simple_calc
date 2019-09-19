/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_software_arch;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Intro_software_arch {

    /**
     * @param args the command line arguments
     */
        static int n1, n2 = 0;
        
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        JFrame fen = new JFrame();
        fen.setTitle("First window");
        fen.setSize(400, 100);
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        pan.setBackground(Color.ORANGE);
        JLabel title = new JLabel("My simple calculator");
        JLabel result = new JLabel();
        JButton b = new JButton("Result");
        JTextField num1 = new JTextField("", 4);
        num1.setBounds(300, 70, 200, 30);
        JTextField num2 = new JTextField("", 4);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                n1 = Integer.parseInt(num1.getText());
                n2 = Integer.parseInt(num2.getText());
                int rsl = n1+n2;
                result.setText(Integer.toString(rsl));
            }
        });
        JLabel sign = new JLabel("+");
        JLabel eq = new JLabel("=");
        pan.add(title);
        pan.add(num1);
        pan.add(sign);
        pan.add(num2);
        pan.add(eq);
        pan.add(result);
        
        
        pan.add(b);
        //fen.setContentPane(pan);
        
        //fen.setVisible(true);
        
        simple_calc c = new simple_calc();
        c.setVisible(true);
        
    }
    
}
