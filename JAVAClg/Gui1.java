package JAVAClg;
import javax.swing.*;

import javafx.scene.control.Button;

public class Gui1 {
    public static void main(String[] args) {
        //Check box
       /* JFrame f =new JFrame("chech box");
        JCheckBox cb1 =new JCheckBox("python");
        cb1.setBounds(10,5,80,150);
        
        JCheckBox cb2 =new JCheckBox("java",true);
        cb2.setBounds(90,5,150,150);

        f.add(cb1);
        f.add(cb2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
*/

   /* JFrame f =new JFrame("radio button");
    JRadioButton cb1 =new JRadioButton("a) python");
    cb1.setBounds(75,50,100,30);

    JRadioButton cb2 =new JRadioButton("b) java");
    cb2.setBounds(75,100,100,30);
    ButtonGroup bg = new ButtonGroup();
    bg.add(cb1);
    bg.add(cb2);

    f.add(cb1);
    f.add(cb2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);*/

    JFrame f;
    f = new JFrame("table ex");
    String data[][]={{"1","rama","4125686265"},
    {"2","abbi","3125686265"},
    {"3","deep","5125686265"}};
    String length[]={"ID","Name","MoNum"};
    JTable jt = new JTable(data, length);
    jt.setBounds(30,40,200,300);
    JScrollPane sp = new JScrollPane(jt);
    f.add(sp);
    f.setSize(300,400);
    f.setVisible(true);
    




    }
}
