import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       gui();

    }

    public static void gui(){

        JPanel pan = new JPanel();
        pan.setSize(500, 500);
        JButton btn = new JButton();
        Creatie.CreatieButon(btn,"Text",100,100);
        JButton btn2 = new JButton();
        Creatie.CreatieButon(btn2,"Text2",200,200);
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(510,510);
        pan.setLayout(null);
        pan.add(btn);
        pan.add(btn2);
        frame.add(pan);

    }
}
