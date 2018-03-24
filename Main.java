import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       gui();
       gui2();

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

        String[] sir=new String[]{"1","2","3"};
        JComboBox<String> box=new JComboBox<>(sir);
        box.setBounds(300,100,90,35);
        pan.add(box);

        frame.add(pan);

    }
    public static void gui2(){

        String[] sir=new String[]{"1","2","3"};
        JComboBox<String> box=new JComboBox<>(sir);
        box.setBounds(300,100,80,35);
        JFrame frame2=new JFrame();
        Creatie.CreatieFrame(frame2,500,500);
        JPanel pan2 = new JPanel();
        Creatie.CreatiePanel(pan2,500,500);
        pan2.add(box);
        frame2.add(pan2);
    }

}
