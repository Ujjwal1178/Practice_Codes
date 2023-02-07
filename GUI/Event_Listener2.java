import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

class demo extends JFrame implements ActionListener{
        Container c  ;
        JButton btn1 = new JButton("Red") ;
        JButton btn2 = new JButton("Green") ;
        JButton btn3 = new JButton("Black") ;
    demo(){
        c = this.getContentPane() ;
        c.setLayout(null) ;

        btn1.setBounds(100,100,80,50) ;
        btn2.setBounds(200,100,80,50);
        btn3.setBounds(300, 100, 80, 50);
        
      
        

        c.add(btn1) ;
        c.add(btn2) ;
        c.add(btn3) ;

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1) {
            c.setBackground(Color.red);
        }
        if(e.getSource() == btn2) {
            c.setBackground(Color.green);
        }
        if(e.getSource() == btn3) {
            c.setBackground(Color.black);
        }

    }
}
class Event_Listener2{
    public static void main(String[] args) {
        demo f = new demo() ;
        f.setBounds(100,100,700,500) ;
        f.setTitle("Action Listener2");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}