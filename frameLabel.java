import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border; 

public class frameLabel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My hero") ;
        JLabel label = new JLabel() ;
        
        frame.add(label) ;
        label.setText("bruhhh do you even code !!") ;
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
      //  ImageIcon img1 = new ImageIcon("C:/Users/UJJWAL/Downloads/immgg.png") ;
       ImageIcon img = new ImageIcon("C:/Users/UJJWAL/Desktop/ash.png") ;
       Border border = BorderFactory.createLineBorder(Color.green,3);
       label.setBorder(border);
      
     //   label.setIcon(img1) ;
        label.setIcon(img) ;
        label.setFont(new Font("MV BOLI",Font.PLAIN,20));
        label.setIconTextGap(-200);
       // frame.setSize(439,345) ;
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); 
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);
      //  frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.green);
        frame.pack();
        frame.setVisible(true); 
        

    }
    
}
