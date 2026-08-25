package JAVAClg;
import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class Gui2 {
    public static void main(String[] args) {
        JFrame chat = new JFrame("ChatFrame");
        chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chat.setSize(400,400);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");

        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        JPanel panel = new JPanel();
        JLabel lb = new JLabel("Enter text");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(lb);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();

        chat.getContentPane().add(BorderLayout.SOUTH,panel);
        chat.getContentPane().add(BorderLayout.NORTH,mb);
        chat.getContentPane().add(BorderLayout.CENTER,ta);
        

        chat.setVisible(true);





    }
}
