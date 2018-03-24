import javax.swing.*;
import java.awt.*;

public class CallerID {

    public static void Caller(){

        JLabel telefon = new JLabel();
        Creatie.CreatieLabel(telefon,0,0,400,125);
        JLabel descriere = new JLabel();
        Creatie.CreatieLabel(descriere,60,500,700,170);

        JComboBox<String> pizza = new JComboBox<>();
        Creatie.CreatieBox(pizza,true,false,40,200,300,60);
        JComboBox<String> sosuri = new JComboBox<>();
        Creatie.CreatieBox(sosuri,true,false,40,280,300,60);
        JComboBox<String> adresa = new JComboBox<>();
        Creatie.CreatieBox(adresa,true,true,40,360,300,60);

        JButton plus = new JButton();
        Creatie.CreatieButon(plus,"+",342,200,60,60);

        JPanel harta = new JPanel();
        Creatie.CreatiePanel(harta,485,10,350,350);
        harta.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bazaDate = new JPanel();
        Creatie.CreatiePanel(bazaDate,845,0,419,682);
        bazaDate.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel all = new JPanel();
        Creatie.CreatiePanel(all,0,0,1250,720);

        all.add(telefon);
        all.add(descriere);
        all.add(pizza);
        all.add(sosuri);
        all.add(adresa);
        all.add(plus);
        all.add(harta);
        all.add(bazaDate);

        JFrame frame = new JFrame();
        Creatie.CreatieFrame(frame,1280,720);
        frame.add(all);

    }
}
