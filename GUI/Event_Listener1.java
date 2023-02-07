import javax.swing.*;
import java.awt.* ;
import java.awt.event.* ;
class myframe extends JFrame implements ActionListener {
    Container c ;
    
    JButton btn ;
    myframe() {
         c = this.getContentPane()   ;
         c.setLayout(null);

         btn = new JButton("Click me") ;
         
         btn.setBounds(100,100,90,30);
         c.add(btn) ;
         
       
         btn.addActionListener(this) ;
        }
        public void actionPerformed(ActionEvent e){
            c.setBackground(Color.yellow) ;
            c.setBackground(Color.BLACK);
        }


    }
class Event_Listener1{
    public static void main(String[] args) {
        myframe f = new myframe() ; 
        f.setTitle("ACtion_Demo1");
        f.setSize(540,534);
        f.setLocation(100,100 );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       


    }
}