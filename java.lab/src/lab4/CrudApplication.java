package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CrudApplication extends JFrame implements ActionListener {
    private JTextField idField, nameField, ageField,genderField,classField;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private JTextArea outputArea;
    private Connection conn;

    public CrudApplication() {
        super("CRUD Application");

        // Initialize GUI components
        idField = new JTextField(10);
        nameField = new JTextField(20);
        ageField = new JTextField(20);
        genderField = new JTextField(20);
        classField = new JTextField(20);
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        outputArea = new JTextArea(10, 40);

        // Add action listeners to buttons
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to layout
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Class:"));
        inputPanel.add(classField);
        inputPanel.add(addButton);
        inputPanel.add(updateButton);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        Container container = getContentPane();
        container.add(inputPanel, BorderLayout.NORTH);
        container.add(buttonPanel, BorderLayout.CENTER);
        container.add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Connect to database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ajp";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getSource() == addButton) {
                // Insert new record into database
                PreparedStatement statement = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?,?,?)");
                statement.setString(1, idField.getText());
                statement.setString(2, nameField.getText());
                statement.setString(3, ageField.getText());
                statement.setString(4, genderField.getText());
                statement.setString(5, classField.getText());
                int rows = statement.executeUpdate();
                if (rows > 0) {
                    outputArea.append("Record added successfully\n");
                } else {
                    outputArea.append("Record not added\n");
                }
            } else if (event.getSource() == updateButton) {
                // Update existing record in database
                PreparedStatement statement = conn.prepareStatement("UPDATE student SET name=?,age=?,gender=?,class=? WHERE id=?");

                statement.setString(1, nameField.getText());
                statement.setString(2, ageField.getText());
                statement.setString(3, genderField.getText());
                statement.setString(4, classField.getText());
                statement.setString(5, idField.getText());
                int rows = statement.executeUpdate();
                if (rows > 0) {
                    outputArea.append("Record updated successfully\n");
                } else {
                    outputArea.append("Record not updated\n");
                }
            } else if (event.getSource() == deleteButton) {
                // Delete existing record from database
                PreparedStatement statement = conn.prepareStatement("DELETE FROM student WHERE id=?");
                statement.setString(1, idField.getText());
                int rows = statement.executeUpdate();
                if (rows > 0) {
                    outputArea.append("Record deleted successfully\n");
                } else {
                    outputArea.append("Record not deleted\n");
                }
            } else if (event.getSource() == clearButton) {
                // Clear input fields and output area
                idField.setText("");
                nameField.setText("");
                ageField.setText("");
                genderField.setText("");
                classField.setText("");
                outputArea.setText("");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CrudApplication();
    }
}
