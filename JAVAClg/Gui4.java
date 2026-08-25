package JAVAClg;
/*Student registration */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui4 {
    public static void main(String[] args) {
        
 
        JFrame f = new JFrame("Student Register"); 
 
        // Creating labels 
        JLabel label1 = new JLabel("First Name"); 
        JLabel label2 = new JLabel("Last Name"); 
        JLabel label3 = new JLabel("Middle Name"); 
        JLabel label4 = new JLabel("Address"); 
 
        // Creating text fields 
        JTextField tf1 = new JTextField(); 
        JTextField tf2 = new JTextField(); 
        JTextField tf3 = new JTextField(); 
        JTextField tf4 = new JTextField(); 
 
        // Creating buttons 
        JButton btn1 = new JButton("Register"); 
        JButton btn2 = new JButton("Clear"); 
 
        // Setting bounds for labels 
        label1.setBounds(20, 20, 100, 30); 
        label2.setBounds(20, 60, 100, 30); 
        label3.setBounds(20, 100, 100, 30); 
        label4.setBounds(20, 140, 100, 30); 
 
        // Setting bounds for text fields 
        tf1.setBounds(120, 20, 150, 30); 
        tf2.setBounds(120, 60, 150, 30); 
        tf3.setBounds(120, 100, 150, 30); 
        tf4.setBounds(120, 140, 150, 30); 
 
        // Setting bounds for buttons 
        btn1.setBounds(60, 200, 100, 30); 
        btn2.setBounds(170, 200, 100, 30); 
 
        // Adding components to the frame 
        f.add(label1); 
        f.add(label2); 
        f.add(label3); 
        f.add(label4); 
        f.add(tf1); 
        f.add(tf2); 
        f.add(tf3); 
        f.add(tf4); 
        f.add(btn1); 
        f.add(btn2); 
 
        // Frame properties 
        f.setSize(350, 300); 
        f.setLayout(null); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true); 
    
    }
}
