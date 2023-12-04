package Basic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingActionLisner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MY APP");
        JButton button = new JButton("Butoon");
        JTextField field = new JTextField();
        field.setBounds(100, 100, 300, 60);
        button.setBounds(200, 200, 40, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("well come to swing");
            }
        });
        frame.add(field);
        frame.add(button);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);


    }

}
