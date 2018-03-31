import javax.swing.*;
import java.awt.*;

public class Creatie{

    public static void CreatieButon(JButton btn, String text, int x, int y,int width,int height) {

        btn.setBounds(x,y,width,height);
        btn.setText(text);
    }

    public static void CreatiePanel(JPanel pan,int x,int y,int width,int height){

        pan.setSize(x,y);
        pan.setLayout(null);
        pan.setVisible(true);
        pan.setBounds(x,y,width,height);
    }


    public static void CreatieBox(JComboBox box,boolean stat,boolean editable,int x,int y,int width,int height){

        box.setVisible(stat);
        box.setBounds(x,y,width,height);
        box.setEditable(editable);
    }

    public static void CreatieLabel(JLabel label,int x,int y,int width,int height){

        label.setBounds(x,y,width,height);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
