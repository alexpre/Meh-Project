import javax.swing.*;
import java.awt.*;


public class FronPage {

    public static void Front()

    {
        JLabel comenzi = new JLabel();
        Creatie.CreatieLabel(comenzi,180,220,560,450);

        JButton logareAdmin = new JButton();
        Creatie.CreatieButon(logareAdmin,"Admin",770,639,120,30);

        JButton vanzari = new JButton();
        Creatie.CreatieButon(vanzari,"Vanzari",15,639,120,30);

        JPanel all = new JPanel();
        Creatie.CreatiePanel(all,0,0,920,720);

        all.add(comenzi);
        all.add(logareAdmin);
        all.add(vanzari);

        JFrame frame = new JFrame();
        Creatie.CreatieFrame(frame,920,720);
        frame.add(all);
    }
}
