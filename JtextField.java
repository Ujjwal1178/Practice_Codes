import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField; 
public class JtextField { 
    public static void main(String[] args) {
        JFrame frame = new JFrame() ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setLayout(null);

        JTextField t1 = new JTextField() ; 
        t1.setBounds(100,100,200,70) ; 
        Font font = new Font("Calligraphy",Font.BOLD,22) ;
        t1.setFont(font) ;
        t1.setText("Ujjwal Sinduria");
        
       
        t1.setEditable(false);
        t1.setForeground(Color.red);
        t1.setBackground(Color.BLACK);
        
        
        
        
        frame.add(t1) ;



        frame.setVisible(true);

    }
}
