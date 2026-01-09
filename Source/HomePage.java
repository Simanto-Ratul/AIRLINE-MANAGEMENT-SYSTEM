package Source;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame{
    private Container c;
    private Color color1;
    private Font font1;
    private JLabel headingLabel, nameLabel, passportJLabel, numberJLabel, addressJLabel, genderJLabel, flyinglLabel;

    public HomePage(){
        this.setTitle("AIRLINE MANAGEMENT SYSTEM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);

        color1 = new Color(6, 109, 104);
        font1 = new Font("Cambria", Font.BOLD+Font.ITALIC,36);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(color1);

        headingLabel = new JLabel("WELCOME TO BIMAN BANGLADESH AIRLINES");
        headingLabel.setBounds(280,30,800,40);
        headingLabel.setFont(font1);
        headingLabel.setForeground(Color.white);
        c.add(headingLabel);
    }
}
