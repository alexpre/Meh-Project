import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       gui();

    }

    public static void gui(){

        JPanel pan = new JPanel();
        pan.setSize(500, 500);
        Creatie buton = new Creatie("Text",0,0);
        JButton btn = new JButton();
        btn.setBounds(200,200,120,35);
        btn.setText("Text");
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(510,510);
        pan.setLayout(null);
        pan.add(buton);
        pan.add(btn);
        frame.add(pan);

    }
}
