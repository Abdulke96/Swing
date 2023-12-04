package Basic;

import javax.swing.*;
import java.awt.*;

public class SwingSimple{
    public static void main(String[] args) {
        JFrame frame = new JFrame("MY APP");
        frame.setSize(400, 400);
        frame.setVisible(true);
        JButton button = new JButton("click");
        button.setBounds(0,0, 50, 40);
        button.setBackground(Color.PINK);
        frame.add(button);


    }

}
