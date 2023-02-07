import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Event_Listener3 {
    public static void main(String[] args) {
        JFrame f = new JFrame(); 
        f.setBounds(100, 200, 500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Container c = f.getContentPane() ;
        c.setLayout(null) ;
       
        JButton btn1= new JButton("Click me") ;
        btn1.setBounds(100,100,90,30);
        c.add(btn1) ;
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.black);
            }
        });
        
    }
}
