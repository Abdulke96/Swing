package Basic;

import java.awt.*;
import javax.swing.*;

public class SwingSimple2 {
    JFrame frame;
    public SwingSimple2(){
        frame = new JFrame();
        JButton button = new JButton("click-me");
        frame.setSize(400 ,500);
        frame.setVisible(true);
        button.setBounds(100,100, 50,50);
       button.setBackground(Color.CYAN);
        frame.add(button);


    }
    public static void main(String[] args) {
        new SwingSimple2();
    }


}


