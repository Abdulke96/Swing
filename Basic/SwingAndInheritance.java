package Basic;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingAndInheritance  extends JFrame{
    JFrame frame;
    SwingAndInheritance(){
     JButton button = new JButton("click");
     button.setBounds(getBounds());
     button.setBackground(Color.pink);
     add(button);
     setSize   (400,400);
     setVisible(true);

        

    }
    public static void main(String[] args) {
        new SwingAndInheritance();
    }
    
}
