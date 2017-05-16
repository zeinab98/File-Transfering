package Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Java extends JFrame{
    private JButton show;
    private JPanel panel1;
    private JTextField textField1;


    public  Java()
    {
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello world");
            }
        });
        this.setBounds(0,0,300,400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Result:");
        frame.setContentPane(new Java().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}

