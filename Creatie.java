import javax.swing.*;
import java.awt.*;

public class Creatie{

    public static void CreatieButon(JButton btn, String text, int x, int y,int width,int height) {

        btn.setBounds(x,y,width,height);
        btn.setText(text);
    }

<<<<<<< HEAD
    public static void CreatiePanel(JPanel pan,int x,int y){
=======
    public static void CreatiePanel(JPanel pan,int x,int y,int width,int height){
>>>>>>> Darky

        pan.setSize(x,y);
        pan.setLayout(null);
        pan.setVisible(true);
<<<<<<< HEAD
=======
        pan.setBounds(x,y,width,height);
>>>>>>> Darky
    }

    public static void CreatieFrame(JFrame frame,int x,int y){

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x,y);
<<<<<<< HEAD

=======
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }

    public static void CreatieBox(JComboBox box,boolean stat,boolean editable,int x,int y,int width,int height){

        box.setVisible(stat);
        box.setBounds(x,y,width,height);
        box.setEditable(editable);
    }

    public static void CreatieLabel(JLabel lable,int x,int y,int width,int height){

        lable.setBounds(x,y,width,height);
        lable.setBorder(BorderFactory.createLineBorder(Color.black));
>>>>>>> Darky
    }
}
