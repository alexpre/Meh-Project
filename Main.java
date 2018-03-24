import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       gui();

    }

    public static void gui(){

        JPanel pan = new JPanel();
        pan.setSize(500, 500);
        Creatie buton = new Creatie(200,200);
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(510,510);
        pan.add(buton);
        frame.add(pan);

    }
}
