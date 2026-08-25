package JAVAClg;
/*Login Page */
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gui3 {
    public static void main(String[] args) {
        JFrame chat = new JFrame("Login Window");
        
        JLabel l1 = new JLabel("User:");
        l1.setBounds(20,20,100,30);
        JTextField t1 = new JTextField(10);
        t1.setBounds(120,20,150,30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20,60,100,30);
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(120,60,150,30);


        JButton b = new JButton("Login");
        b.setBounds(60,200,100,30);
        JButton b1 = new JButton("register");
        b1.setBounds(170,200,100,30);
        
        chat.add(l1);
        chat.add(t1);
        chat.add(l2);
        chat.add(t2);
        chat.add(b);
        chat.add(b1);



        chat.setSize(400,400);
        chat.setLayout(null);
        chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chat.setVisible(true);




    }
}
