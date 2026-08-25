
import javax.swing.*;
import java.awt.event.*;


public class Gui7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Add Two Number");
        
        final JLabel Lbl_A = new JLabel("Enter A");
        Lbl_A.setBounds(10,50,150,20);
        JTextField Txt_A = new JTextField();
        Txt_A.setBounds(100,50,150,20);

        final JLabel Lbl_B = new JLabel("Enter B");
        Lbl_B.setBounds(10,75,150,20);
        JTextField Txt_B = new JTextField();
        Txt_B.setBounds(100,75,150,20);

        final JLabel Lbl_result = new JLabel("Result");
        Lbl_result.setBounds(10,100,150,20);
        
        final JLabel Lbl_r = new JLabel("No Result");
        Lbl_r.setBounds(100,100,150,20);

        JButton add = new JButton("Add");
        add.setBounds(10,125,100,40);

        
        JButton clear = new JButton("Clear");
        clear.setBounds(120,125,100,40);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                Txt_A.setText("");
                Txt_B.setText("");
                Lbl_r.setText("No result");
            }
        });

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String stA = Txt_A.getText();
                String stB = Txt_B.getText();
                int intA  = Integer.parseInt(stA);
                int intB  = Integer.parseInt(stB);
                int c = intA+intB;
                String str_c = String.valueOf(c);
                Lbl_r.setText(str_c);
            }
        });

        f.add(Lbl_A);
        f.add(Txt_A);
        f.add(Lbl_B);
        f.add(Txt_B);
        f.add(Lbl_result);
        f.add(Lbl_r);
        f.add(add);
        f.add(clear);

        f.setSize(350, 300); 
        f.setLayout(null); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true); 


    }
    
}
