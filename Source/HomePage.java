package Source;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {
    private Container c;
    private Color color1;
    private Font font1, font2, font3, font4;;
    private JLabel headingLabel, nameLabel, passportJLabel, numberJLabel, nationalityJLabel, genderJLabel,
            flyingToJLabel, flyingFromJLabel, departureLabel, ticketJLabel, tripTypJLabel;
    private JTextField nameTextField, passporTextField, numberTextField, nationalityJTextField, departurTextField;
    private JRadioButton maleButton, femaleButton, othersButton, oneWayTripButton, roundTripButton, multiCityTripButton;
    private ButtonGroup group1, group2;
    private JComboBox<String> flyingFrComboBox, flyingToComboBox, ticketComboBox;
    private String[] places = { " ", "DHAKA", "CHITTAGONG", "SYLHET", "JESSORE", "COX'S BAZAR" };
    private String[] tickets = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", };
    private JButton submiButton;
    private JTextArea textArea1;
    private Cursor cursor;

    public HomePage() {
        this.setTitle("AIRLINE MANAGEMENT SYSTEM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);

        color1 = new Color(32, 49, 47);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        font1 = new Font("Cambria", Font.BOLD + Font.ITALIC, 38);
        font2 = new Font("Cambria", Font.PLAIN, 18);
        font3 = new Font("Cambria", Font.BOLD, 20);
        font4 = new Font("Courier New", Font.PLAIN, 16);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(color1);

        headingLabel = new JLabel("WELCOME TO BIMAN BANGLADESH AIRLINES");
        headingLabel.setBounds(250, 20, 900, 50);
        headingLabel.setFont(font1);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        c.add(headingLabel);

        nameLabel = new JLabel("Name : ");
        nameLabel.setBounds(50, 100, 150, 30);
        nameLabel.setFont(font3);
        nameLabel.setForeground(Color.WHITE);
        c.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setBounds(200, 100, 350, 35);
        nameTextField.setFont(font2);
        nameTextField.setForeground(Color.BLACK);
        nameTextField.setHorizontalAlignment(JTextField.CENTER);
        c.add(nameTextField);

        passportJLabel = new JLabel("Passport No. : ");
        passportJLabel.setBounds(50, 160, 150, 30);
        passportJLabel.setFont(font3);
        passportJLabel.setForeground(Color.WHITE);
        c.add(passportJLabel);

        passporTextField = new JTextField();
        passporTextField.setBounds(200, 160, 350, 35);
        passporTextField.setFont(font2);
        passporTextField.setHorizontalAlignment(JTextField.CENTER);
        c.add(passporTextField);

        numberJLabel = new JLabel("Mobile No. : ");
        numberJLabel.setBounds(50, 220, 150, 30);
        numberJLabel.setFont(font3);
        numberJLabel.setForeground(Color.WHITE);
        c.add(numberJLabel);

        numberTextField = new JTextField();
        numberTextField.setBounds(200, 220, 350, 35);
        numberTextField.setFont(font2);
        numberTextField.setHorizontalAlignment(JTextField.CENTER);
        c.add(numberTextField);

        nationalityJLabel = new JLabel("Nationality : ");
        nationalityJLabel.setBounds(50, 280, 150, 30);
        nationalityJLabel.setFont(font3);
        nationalityJLabel.setForeground(Color.WHITE);
        c.add(nationalityJLabel);

        nationalityJTextField = new JTextField();
        nationalityJTextField.setBounds(200, 280, 350, 35);
        nationalityJTextField.setFont(font2);
        nationalityJTextField.setHorizontalAlignment(JTextField.CENTER);
        c.add(nationalityJTextField);

        genderJLabel = new JLabel("Gender : ");
        genderJLabel.setBounds(50, 340, 150, 30);
        genderJLabel.setFont(font3);
        genderJLabel.setForeground(Color.WHITE);
        c.add(genderJLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(200, 340, 100, 30);
        maleButton.setFont(font2);
        maleButton.setForeground(Color.WHITE);
        maleButton.setBackground(color1);
        c.add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(300, 340, 100, 30);
        femaleButton.setFont(font2);
        femaleButton.setForeground(Color.WHITE);
        femaleButton.setBackground(color1);
        c.add(femaleButton);

        othersButton = new JRadioButton("Others");
        othersButton.setBounds(400, 340, 100, 30);
        othersButton.setFont(font2);
        othersButton.setForeground(Color.WHITE);
        othersButton.setBackground(color1);
        c.add(othersButton);

        group1 = new ButtonGroup();
        group1.add(maleButton);
        group1.add(femaleButton);
        group1.add(othersButton);

        flyingFromJLabel = new JLabel("Flying From : ");
        flyingFromJLabel.setBounds(50, 400, 150, 30);
        flyingFromJLabel.setFont(font3);
        flyingFromJLabel.setForeground(Color.WHITE);
        c.add(flyingFromJLabel);

        flyingFrComboBox = new JComboBox<>(places);
        flyingFrComboBox.setBounds(200, 400, 350, 35);
        flyingFrComboBox.setFont(font2);
        c.add(flyingFrComboBox);

        flyingToJLabel = new JLabel("Flying To : ");
        flyingToJLabel.setBounds(50, 460, 150, 30);
        flyingToJLabel.setFont(font3);
        flyingToJLabel.setForeground(Color.WHITE);
        c.add(flyingToJLabel);

        flyingToComboBox = new JComboBox<>(places);
        flyingToComboBox.setBounds(200, 460, 350, 35);
        flyingToComboBox.setFont(font2);
        c.add(flyingToComboBox);

        departureLabel = new JLabel("Departure Date : ");
        departureLabel.setBounds(50, 520, 180, 30);
        departureLabel.setFont(font3);
        departureLabel.setForeground(Color.WHITE);
        c.add(departureLabel);

        departurTextField = new JTextField();
        departurTextField.setBounds(230, 520, 320, 35);
        departurTextField.setToolTipText("DD--MM--YY");
        departurTextField.setFont(font2);
        departurTextField.setHorizontalAlignment(JTextField.CENTER);
        c.add(departurTextField);

        ticketJLabel = new JLabel("No. of Tickets : ");
        ticketJLabel.setBounds(50, 580, 150, 30);
        ticketJLabel.setFont(font3);
        ticketJLabel.setForeground(Color.WHITE);
        c.add(ticketJLabel);

        ticketComboBox = new JComboBox<>(tickets);
        ticketComboBox.setBounds(200, 580, 100, 35);
        ticketComboBox.setFont(font2);
        c.add(ticketComboBox);

        tripTypJLabel = new JLabel("Trip Type : ");
        tripTypJLabel.setBounds(50, 640, 150, 30);
        tripTypJLabel.setFont(font3);
        tripTypJLabel.setForeground(Color.WHITE);
        c.add(tripTypJLabel);

        oneWayTripButton = new JRadioButton("One Way");
        oneWayTripButton.setBounds(200, 640, 100, 30);
        oneWayTripButton.setFont(font2);
        oneWayTripButton.setForeground(Color.WHITE);
        oneWayTripButton.setBackground(color1);
        c.add(oneWayTripButton);

        roundTripButton = new JRadioButton("Round Trip");
        roundTripButton.setBounds(300, 640, 120, 30);
        roundTripButton.setFont(font2);
        roundTripButton.setForeground(Color.WHITE);
        roundTripButton.setBackground(color1);
        c.add(roundTripButton);

        multiCityTripButton = new JRadioButton("Multi City");
        multiCityTripButton.setBounds(420, 640, 120, 30);
        multiCityTripButton.setFont(font2);
        multiCityTripButton.setForeground(Color.WHITE);
        multiCityTripButton.setBackground(color1);
        c.add(multiCityTripButton);

        group2 = new ButtonGroup();
        group2.add(oneWayTripButton);
        group2.add(roundTripButton);
        group2.add(multiCityTripButton);

        textArea1 = new JTextArea();
        textArea1.setBounds(750, 250, 700, 650);
        textArea1.setFont(font4);
        textArea1.setBackground(color1);
        textArea1.setForeground(Color.WHITE);
        c.add(textArea1);

        submiButton = new JButton("SUBMIT");
        submiButton.setBounds(250, 700, 200, 45);
        submiButton.setFont(font3);
        submiButton.setCursor(cursor);
        submiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String name = nameTextField.getText();
                String passport = passporTextField.getText();
                String number = numberTextField.getText();
                String nationality = nationalityJTextField.getText(); // Fixed: was using nameTextField
                String departureDate = departurTextField.getText();

                String gender = "";
                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                } else if (othersButton.isSelected()) {
                    gender = "Others";
                }

                String flyingFrom = (String) flyingFrComboBox.getSelectedItem();
                String flyingTo = (String) flyingToComboBox.getSelectedItem();

                String numTickets = (String) ticketComboBox.getSelectedItem();

                String tripType = "";
                if (oneWayTripButton.isSelected()) {
                    tripType = "One Way";
                } else if (roundTripButton.isSelected()) {
                    tripType = "Round Trip";
                } else if (multiCityTripButton.isSelected()) {
                    tripType = "Multi City";
                }

                JOptionPane.showMessageDialog(null, "SUBMITTED SUCCESSFULLY!!");

                String details = "CUSTOMER DETAILS\n" +
                        "================\n" +
                        "Name: " + name + "\n" +
                        "Passport No.: " + passport + "\n" +
                        "Mobile No.: " + number + "\n" +
                        "Nationality: " + nationality + "\n" +
                        "Gender: " + gender + "\n" +
                        "Flying From: " + flyingFrom + "\n" +
                        "Flying To: " + flyingTo + "\n" +
                        "Departure Date: " + departureDate + "\n" +
                        "Number of Tickets: " + numTickets + "\n" +
                        "Trip Type: " + tripType + "\n" +
                        "================\n" +
                        "Thank you for choosing Biman Bangladesh Airlines!";
                textArea1.setText(details);
            }
        });
        c.add(submiButton);
    }
}