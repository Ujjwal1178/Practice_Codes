import javax.swing.*;
import java.awt.* ;
import java.awt.event.* ;

public class Event_Listener4 {

        public static Container c ;
    public static void main(String[] args) {
        
        JFrame f = new JFrame() ;
        f.setBounds(100, 200, 500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        c = f.getContentPane() ;
        c.setLayout(null) ;

        JButton green = new JButton("Green") ;
        JButton red = new JButton("Red") ;
        JButton black = new JButton("Black") ;

        green.setBounds(100,100,80,30);
        red.setBounds(200,100,80,30);
        black.setBounds(300,100,80,30);


        c.add(green) ;
        c.add(red) ;
        c.add(black) ;


        green.addActionListener(new greenClass());
        red.addActionListener(new redClass());
        black.addActionListener(new blackClass());

    
    
    }
    
}
class redClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Event_Listener4.c.setBackground(Color.red) ;
    }
}

class greenClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Event_Listener4.c.setBackground(Color.green) ;
    }
}

class blackClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Event_Listener4.c.setBackground(Color.black) ;
    }
}