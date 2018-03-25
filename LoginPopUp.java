import javax.swing.*;
import java.awt.*;

public class LoginPopUp {

    public static void Login(){

        JLabel username = new JLabel("Username:");
        username.setBounds(20,20,80,30);

        JLabel password = new JLabel("Password");
        password.setBounds(20,75,80,30);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100,20,100,30);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100,75,100,30);

        JButton login = new JButton();
        Creatie.CreatieButon(login,"Login",100,130,90,30);

        JPanel all = new JPanel();
        Creatie.CreatiePanel(all,0,0,300,300);

        all.add(username);
        all.add(password);
        all.add(usernameField);
        all.add(passwordField);
        all.add(login);

        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(300,300);
        loginFrame.setResizable(false);
        loginFrame.setLocationRelativeTo(null);

        loginFrame.add(all);
        loginFrame.setVisible(true);
    }

}
