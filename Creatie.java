import javax.swing.*;

public class Creatie{


    public static void CreatieButon(JButton btn, String text, int x, int y,int width,int height) {

        btn.setBounds(x,y,width,height);
        btn.setText(text);
    }

    public static void CreatiePanel(JPanel pan,int x,int y){

        pan.setSize(x,y);
        pan.setLayout(null);
    }

}
