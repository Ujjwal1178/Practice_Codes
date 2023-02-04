import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


public class Jbutton { 
    public static void main(String[] arg){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,450,250);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("C:/Users/UJJWAL/Desktop/pikachu.png") ;

        JButton button = new JButton(icon) ;
        button.setFont(new Font("Arieal",Font.BOLD,15)) ;
        button.setSize(150, 30);
        button.setLocation(100, 100);
        button.setForeground(Color.black) ;
        button.setBackground(Color.blue);
        button.setSize(icon.getIconWidth(),icon.getIconHeight());
        button.setVisible(true);
        


    Cursor cur = new Cursor(Cursor.HAND_CURSOR) ;//CROSSHAIR_CURSOR,WAIT_CURSOR
        button.setCursor(cur);

        button.setEnabled(true);

        frame.add(button) ;


        frame.setVisible(true);
    }
    
}
