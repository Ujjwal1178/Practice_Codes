import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JpassworfField {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,450,250);
        frame.setLayout(null);
        
        JPasswordField pass = new JPasswordField() ;
        pass.setText("12345678");
        pass.setFont(new Font("Arial",Font.ITALIC,13));
        pass.setBounds(100,100,70,20);
        pass.setEchoChar('*') ;
        pass.setEchoChar((char).0);
        frame.add(pass) ;


        frame.setVisible(true);
    }
}
