package np.scst.bca.UserRegistrationForm;

import java.awt.*;
import javax.swing.*;

public class UserRegistrationForm extends JFrame {

    // Labels and text fields for username and password
    private JLabel usernameLabel = new JLabel("Username:");
    private JTextField usernameField = new JTextField(20);
    private JLabel passwordLabel = new JLabel("Password:");
    private JPasswordField passwordField = new JPasswordField(20);

    // Button for submitting the form
    private JButton submitButton = new JButton("Submit");

    public UserRegistrationForm() {
        // Set the title of the window
        super("User Registration Form");

        // Create a panel for the labels and text fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.setSize(200,100);

        // Create a panel for the submit button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(submitButton);

        // Add the panels to the main content pane using a border layout
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and make the window visible
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the form
        new UserRegistrationForm();
    }
}