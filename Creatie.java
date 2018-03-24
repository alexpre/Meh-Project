import javax.swing.*;

public class Creatie extends JButton {


    public Creatie(String text,int x,int y) {
        JButton btn = new JButton();
        btn.setBounds(x,y,120,35);
        btn.setText(text);
    }
}
