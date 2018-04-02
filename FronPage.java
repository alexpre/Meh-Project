import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Array;
import java.util.Arrays;


public class FronPage {

    private static String id = "admin";
    private static String password1 = "admin";
    private static JButton logOut = new JButton();
    private static JButton adaugaPizza = new JButton();
    private static JFrame loginFrame = new JFrame();
    public static void Front()

    {
        // Draw the interface //

        JLabel comenzi = new JLabel();
        Creatie.CreatieLabel(comenzi, 180, 220, 560, 450);

        JButton logareAdmin = new JButton();
        Creatie.CreatieButon(logareAdmin, "Admin", 770, 639, 120, 30);

        JButton vanzari = new JButton();
        Creatie.CreatieButon(vanzari, "Vanzari", 15, 639, 120, 30);

        JButton undo = new JButton();
        Creatie.CreatieButon(undo, "Undo", 740, 220, 50, 50);

        JPanel logo = new JPanel();
        Creatie.CreatiePanel(logo, 0, 0, 250, 150);
        logo.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel all = new JPanel();
        Creatie.CreatiePanel(all, 0, 0, 920, 720);

        String data[][] = {{"1", "Vera", "12" + "lei"},
                {"2", "Not Vera", "21" + "lei"}};

        String column[] = {"Nr.", "Pizza Name", "Price"};

        JTable jt = new JTable(data, column);
        jt.setBounds(0, 0, 560, 450);
        comenzi.add(jt);


        all.add(comenzi);
        all.add(logareAdmin);
        all.add(vanzari);
        all.add(undo);
        all.add(logo);

        Frame frame = new Frame(920,720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(all);



        //********************* ACTION LISTENERS *********************//

                             // Log in panel popUp //
        logareAdmin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JLabel username = new JLabel("Username:");
                username.setBounds(20,20,80,30);

                JLabel password = new JLabel("Password:");
                password.setBounds(20,75,80,30);

                JTextField usernameField = new JTextField();
                usernameField.setBounds(100,20,100,30);

                JPasswordField passwordField = new JPasswordField();
                passwordField.setBounds(100,75,100,30);

                JButton login = new JButton();
                Creatie.CreatieButon(login,"Login",100,130,90,30);

                JPanel allLogin = new JPanel();
                Creatie.CreatiePanel(allLogin,0,0,300,300);

                allLogin.add(username);
                allLogin.add(password);
                allLogin.add(usernameField);
                allLogin.add(passwordField);
                allLogin.add(login);

                Frame loginFrame = new Frame(300,300);

                loginFrame.add(allLogin);
                loginFrame.setVisible(true);

                // LOG IN BUTTON ACTION //
                login.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        char[] password = passwordField.getPassword();
                        char[] correctPass = new char[] {'a', 'd', 'm', 'i', 'n'};

                        if(usernameField.getText().equals("admin") && Arrays.equals(password,correctPass)) {

                            Creatie.CreatieButon(adaugaPizza, "Adauga Pizza", 15, 500, 120, 30);
                            Creatie.CreatieButon(logOut, "Deconectare", 770, 639, 120, 30);

                            all.add(logOut);
                            all.add(adaugaPizza);
                            all.remove(logareAdmin);
                            frame.revalidate();
                            frame.repaint();
                            loginFrame.setVisible(false);
                            loginFrame.dispose();

                        }else{

                            JOptionPane.showMessageDialog(loginFrame,"Username or password incorect!");

                        }

                    }
                });

            }
        });

                                // DISCCONECT BUTTON ACTION //
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                all.remove(adaugaPizza);
                all.remove(logOut);
                all.add(logareAdmin);
                frame.revalidate();
                frame.repaint();

            }
        });
    }

}


