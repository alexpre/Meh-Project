import javax.swing.*;

public class Creatie extends JButton{


    public Creatie(JButton btn,String text, int x, int y) {

        btn.setBounds(x,y,120,35);
        btn.setText(text);
    }
}
