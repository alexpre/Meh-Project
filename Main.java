import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       gui();

    }

    public static void gui(){

        JPanel pan = new JPanel();
        Creatie.CreatiePanel(pan,500,500);
        JButton btn = new JButton();
        Creatie.CreatieButon(btn,"Text",100,100,120,35);
        JButton btn2 = new JButton();
        Creatie.CreatieButon(btn2,"Text2",200,200,120,35);
        JFrame frame=new JFrame();
        Creatie.CreatieFrame(frame,500,500);
        pan.add(btn);
        pan.add(btn2);
        frame.add(pan);

    }
}
