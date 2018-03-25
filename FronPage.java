import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FronPage {

    public static void Front()

    {
        // Draw the interface //

        JLabel comenzi = new JLabel();
        Creatie.CreatieLabel(comenzi,180,220,560,450);

        JButton logareAdmin = new JButton();
        Creatie.CreatieButon(logareAdmin,"Admin",770,639,120,30);

        JButton vanzari = new JButton();
        Creatie.CreatieButon(vanzari,"Vanzari",15,639,120,30);

        JButton undo = new JButton();
        Creatie.CreatieButon(undo,"Undo",740,220,50,50);

        JPanel logo = new JPanel();
        Creatie.CreatiePanel(logo,0,0,250,150);
        logo.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel all = new JPanel();
        Creatie.CreatiePanel(all,0,0,920,720);

        String data[][] ={{"1","Vera","12" + "lei"},
                         {"2","Not Vera", "21" + "lei"}};

        String column[] = {"Nr.","Pizza Name","Price"};

        JTable jt = new JTable(data,column);
        jt.setBounds(0,0,560,450);
        comenzi.add(jt);


        all.add(comenzi);
        all.add(logareAdmin);
        all.add(vanzari);
        all.add(undo);
        all.add(logo);

        JFrame frame = new JFrame();
        Creatie.CreatieFrame(frame,920,720);
        frame.add(all);

        // Action Listeners //

        logareAdmin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                LoginPopUp.Login();
            }
        });

    }
}
