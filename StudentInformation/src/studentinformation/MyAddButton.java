package studentinformation;

/**
 *
 * @author Administrator
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

class MyAddButton extends JFrame implements ActionListener {

    JFrame addFrame;
    JLabel formTitleLabel, studentFormLabel, firstFormLabel, lastFormLabel, middleFormLabel,
            courseFormLabel, sectionFormLabel, yearFormLabel, idFormLabel, birthFormLabel,
            emailFormLabel, exampleFormLabel, phoneFormLabel, validFormLabel, addressFormLabel, zipFormLabel,
            imageLabel, genderFormLabel, ageFormLabel;

    JSpinner daySpinner, monthSpinner, yearSpinner;
    SpinnerNumberModel dayModel, yearModel;
    SpinnerListModel monthModel;

    JTextField idFormField, firstFormField, lastFormField, middleFormField, courseFormField, sectionFormField,
            yearFormField, emailFormField, phoneFormField, addressFormField, zipFormField, ageFormField;

    JRadioButton maleRadioButton, femaleRadioButton;
    ButtonGroup genderButtonGroup;

    JButton addButton, uploadButton, clearButton,
            logoutButton, exitButton;

    DefaultTableModel model;
    JTable tblForms;

    MyAddButton() {

        addFrame = new JFrame();
        addFrame.setTitle("Student Information System");
        addFrame.setSize(1000, 700);
        addFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addFrame.setResizable(false);
        addFrame.setLocationRelativeTo(null);
        addFrame.setLayout(new BorderLayout()); // Set the layout to BorderLayout
        addFrame.setVisible(true);

        addFrame.getContentPane().setBackground(Color.BLACK);
        // Create and configure form elements

        // Set up the form title label
        formTitleLabel = new JLabel();
        formTitleLabel.setText("Student Information ");
        formTitleLabel.setForeground(Color.LIGHT_GRAY);
        formTitleLabel.setFont(new Font("Century", Font.BOLD, 35));
        formTitleLabel.setBounds(270, 0, 450, 50);
        addFrame.add(formTitleLabel);

        idFormLabel = new JLabel();
        idFormLabel.setText("Student  ID  Number :");
        idFormLabel.setForeground(Color.LIGHT_GRAY);
        idFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        idFormLabel.setBounds(70, 70, 170, 50);
        addFrame.add(idFormLabel);

        idFormField = new JTextField();
        idFormField.setBounds(240, 80, 300, 30);
        addFrame.add(idFormField);

        studentFormLabel = new JLabel();
        studentFormLabel.setText("Name of  Student");
        studentFormLabel.setForeground(Color.LIGHT_GRAY);
        studentFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        studentFormLabel.setBounds(80, 120, 130, 50);
        addFrame.add(studentFormLabel);

        firstFormField = new JTextField();
        firstFormField.setBounds(60, 170, 180, 30);
        addFrame.add(firstFormField);

        firstFormLabel = new JLabel();
        firstFormLabel.setText("First Name");
        firstFormLabel.setForeground(Color.LIGHT_GRAY);
        firstFormLabel.setFont(new Font("Century", Font.BOLD, 9));
        firstFormLabel.setBounds(60, 190, 80, 30);
        addFrame.add(firstFormLabel);

        middleFormField = new JTextField();
        middleFormField.setBounds(280, 170, 180, 30);
        addFrame.add(middleFormField);

        middleFormLabel = new JLabel();
        middleFormLabel.setText("Middle Name");
        middleFormLabel.setForeground(Color.LIGHT_GRAY);
        middleFormLabel.setFont(new Font("Century", Font.BOLD, 9));
        middleFormLabel.setBounds(280, 190, 80, 30);
        addFrame.add(middleFormLabel);

        lastFormField = new JTextField();
        lastFormField.setBounds(500, 170, 180, 30);
        addFrame.add(lastFormField);

        lastFormLabel = new JLabel();
        lastFormLabel.setText("Last Name");
        lastFormLabel.setForeground(Color.LIGHT_GRAY);
        lastFormLabel.setFont(new Font("Century", Font.BOLD, 9));
        lastFormLabel.setBounds(500, 190, 80, 30);
        addFrame.add(lastFormLabel);

        courseFormLabel = new JLabel();
        courseFormLabel.setText("Course");
        courseFormLabel.setForeground(Color.LIGHT_GRAY);
        courseFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        courseFormLabel.setBounds(80, 210, 130, 50);
        addFrame.add(courseFormLabel);

        courseFormField = new JTextField();
        courseFormField.setBounds(60, 250, 180, 30);
        addFrame.add(courseFormField);

        sectionFormField = new JTextField();
        sectionFormField.setBounds(280, 250, 180, 30);
        addFrame.add(sectionFormField);

        sectionFormLabel = new JLabel();
        sectionFormLabel.setText("Section");
        sectionFormLabel.setForeground(Color.LIGHT_GRAY);
        sectionFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        sectionFormLabel.setBounds(300, 210, 130, 50);
        addFrame.add(sectionFormLabel);

        yearFormLabel = new JLabel();
        yearFormLabel.setText("Year Level");
        yearFormLabel.setForeground(Color.LIGHT_GRAY);
        yearFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        yearFormLabel.setBounds(520, 210, 130, 50);
        addFrame.add(yearFormLabel);

        yearFormField = new JTextField();
        yearFormField.setBounds(500, 250, 180, 30);
        addFrame.add(yearFormField);

        birthFormLabel = new JLabel();
        birthFormLabel.setText("Birth of Date");
        birthFormLabel.setForeground(Color.LIGHT_GRAY);
        birthFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        birthFormLabel.setBounds(80, 300, 130, 50);
        addFrame.add(birthFormLabel);

        // Create SpinnerNumberModel for day selection
        dayModel = new SpinnerNumberModel(1, 1, 31, 1);
        daySpinner = new JSpinner(dayModel);
        daySpinner.setBounds(60, 340, 50, 30);
        addFrame.add(daySpinner);

        // Create SpinnerListModel for month selection
        String[] monthValues = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        monthModel = new SpinnerListModel(monthValues);
        monthSpinner = new JSpinner(monthModel);
        monthSpinner.setBounds(120, 340, 80, 30);
        addFrame.add(monthSpinner);

        // Create SpinnerNumberModel for year selection
        yearModel = new SpinnerNumberModel(2000, 1900, 2100, 1);
        yearSpinner = new JSpinner(yearModel);
        yearSpinner.setBounds(210, 340, 50, 30);
        addFrame.add(yearSpinner);

        emailFormLabel = new JLabel();
        emailFormLabel.setText("Student E - mail");
        emailFormLabel.setForeground(Color.LIGHT_GRAY);
        emailFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        emailFormLabel.setBounds(300, 300, 180, 50);
        addFrame.add(emailFormLabel);

        emailFormField = new JTextField();
        emailFormField.setBounds(280, 340, 180, 30);
        addFrame.add(emailFormField);

        exampleFormLabel = new JLabel();
        exampleFormLabel.setText("myname@example.com");
        exampleFormLabel.setForeground(Color.LIGHT_GRAY);
        exampleFormLabel.setFont(new Font("Century", Font.BOLD, 9));
        exampleFormLabel.setBounds(300, 360, 120, 30);
        addFrame.add(exampleFormLabel);

        phoneFormLabel = new JLabel();
        phoneFormLabel.setText("Phone Number");
        phoneFormLabel.setForeground(Color.LIGHT_GRAY);
        phoneFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        phoneFormLabel.setBounds(520, 300, 180, 50);
        addFrame.add(phoneFormLabel);

        phoneFormField = new JTextField();
        phoneFormField.setBounds(500, 340, 180, 30);
        addFrame.add(phoneFormField);

        validFormLabel = new JLabel();
        validFormLabel.setText("please enter a valid phone number");
        validFormLabel.setForeground(Color.LIGHT_GRAY);
        validFormLabel.setFont(new Font("Century", Font.BOLD, 9));
        validFormLabel.setBounds(510, 360, 180, 30);
        addFrame.add(validFormLabel);

        addressFormLabel = new JLabel();
        addressFormLabel.setText("Address");
        addressFormLabel.setForeground(Color.LIGHT_GRAY);
        addressFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        addressFormLabel.setBounds(80, 370, 180, 50);
        addFrame.add(addressFormLabel);

        addressFormField = new JTextField();
        addressFormField.setBounds(80, 410, 300, 30);
        addFrame.add(addressFormField);

        zipFormLabel = new JLabel();
        zipFormLabel.setText("Zip Code");
        zipFormLabel.setForeground(Color.LIGHT_GRAY);
        zipFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        zipFormLabel.setBounds(450, 370, 180, 50);
        addFrame.add(zipFormLabel);

        zipFormField = new JTextField();
        zipFormField.setBounds(430, 410, 200, 30);
        addFrame.add(zipFormField);

        // Create a JLabel for the image
        imageLabel = new JLabel();
        imageLabel.setBounds(750, 70, 200, 200);
        addFrame.add(imageLabel);

        // Create a border for the image label
        Border buttonBorder = BorderFactory.createLineBorder(Color.GREEN, 1);

        // Set the border for the image label
        imageLabel.setBorder(buttonBorder);

        // Handle the "Upload" button click event
        uploadButton = new JButton("Upload");
        uploadButton.setBackground(Color.LIGHT_GRAY);
        uploadButton.setForeground(Color.GREEN);
        uploadButton.setFocusable(false);
        uploadButton.setBounds(750, 280, 200, 30);
        uploadButton.setBorder(buttonBorder);
        addFrame.add(uploadButton);

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(addFrame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getPath();
                    // Code to handle the selected file path

                    // Create an ImageIcon from the selected file
                    ImageIcon imageIcon = new ImageIcon(filePath);
                    // Scale the ImageIcon to fit the imageLabel
                    Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                    // Create a new ImageIcon with the scaled image
                    ImageIcon scaledImageIcon = new ImageIcon(image);
                    // Set the scaled ImageIcon to the imageLabel
                    imageLabel.setIcon(scaledImageIcon);
                }
            }
        });

        // Create the gender form label
        genderFormLabel = new JLabel();
        genderFormLabel.setText("Gender : ");
        genderFormLabel.setForeground(Color.LIGHT_GRAY);
        genderFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        genderFormLabel.setBounds(720, 360, 180, 50);
        addFrame.add(genderFormLabel);

        // Create male and female radio buttons for gender selection
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setFocusable(false);
        maleRadioButton.setBounds(800, 370, 80, 30);
        addFrame.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setFocusable(false);
        femaleRadioButton.setBounds(880, 370, 80, 30);
        addFrame.add(femaleRadioButton);

        // Group the radio buttons together
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        // Create the age form label
        ageFormLabel = new JLabel();
        ageFormLabel.setText("Age : ");
        ageFormLabel.setForeground(Color.LIGHT_GRAY);
        ageFormLabel.setFont(new Font("Century", Font.BOLD, 15));
        ageFormLabel.setBounds(740, 320, 180, 50);
        addFrame.add(ageFormLabel);

        // Create the age text field
        ageFormField = new JTextField();
        ageFormField.setBounds(780, 330, 50, 30);
        addFrame.add(ageFormField);

        // Create the "Add" button
        addButton = new JButton("Add");
        addButton.setBackground(Color.GREEN);
        addButton.setForeground(Color.BLACK);
        addButton.setFocusable(false);
        addButton.setBounds(200, 510, 200, 30);
        addButton.setBorder(buttonBorder);
        addFrame.add(addButton);
        addButton.addActionListener(this);

        // Create the "Clear" button
        clearButton = new JButton("Clear");
        clearButton.setBackground(Color.ORANGE);
        clearButton.setForeground(Color.BLACK);
        clearButton.setFocusable(false);
        clearButton.setBounds(450, 510, 200, 30);
        clearButton.setBorder(buttonBorder);
        addFrame.add(clearButton);
        clearButton.addActionListener(this);

        // Create the "Clear" button
        logoutButton = new JButton("Logout");
        logoutButton.setBackground(Color.ORANGE);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.setFocusable(false);
        logoutButton.setBounds(10, 585, 100, 30);
        logoutButton.setBorder(buttonBorder);
        addFrame.add(logoutButton);
        logoutButton.addActionListener(this);

        // Create the "Exit" button
        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.white);
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Dialogue", Font.BOLD, 18));
        exitButton.setBounds(450, 510, 200, 30);
        exitButton.setBorder(buttonBorder);
        addFrame.add(exitButton);
        exitButton.addActionListener(this);

        // Create a table to display the form data
        String[] columnNames = {"Id Number", "FirstName", "Middle", "LastName", "Age", "Gender", "Course",
            "Section", "YearLevel", "Birth of Date", "E-mail", "Number", "Address", "Zipcode"};

        model = new DefaultTableModel(columnNames, 5);
        tblForms = new JTable(model);

        addFrame.add(new JScrollPane(tblForms), BorderLayout.SOUTH);

        // Create a panel to hold the "Exit" button
        JPanel clearPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        clearPanel.setBackground(Color.LIGHT_GRAY);
        clearPanel.add(exitButton);
        addFrame.add(clearPanel, BorderLayout.SOUTH);

    }

    private void clearAll() {
        idFormField.setText("");
        firstFormField.setText("");
        middleFormField.setText("");
        lastFormField.setText("");
        ageFormField.setText("");
        courseFormField.setText("");
        sectionFormField.setText("");
        yearFormField.setText("");
        daySpinner.setValue(1);
        monthSpinner.setValue("January");
        yearSpinner.setValue(2000);
        emailFormField.setText("");
        phoneFormField.setText("");
        addressFormField.setText("");
        zipFormField.setText("");
        genderButtonGroup.clearSelection();

    }

    // This method is called when the "Add" button is clicked. It adds a new row of data to the table model.
    private void addForm() {
        model.addRow(new Object[]{
            idFormField.getText(),
            firstFormField.getText(),
            middleFormField.getText(),
            lastFormField.getText(),
            ageFormField.getText(),
            (maleRadioButton.isSelected() ? "Male" : "Female"),
            courseFormField.getText(),
            sectionFormField.getText(),
            yearFormField.getText(),
            daySpinner.getValue() + " " + monthSpinner.getValue() + " " + yearSpinner.getValue(),
            emailFormField.getText(),
            phoneFormField.getText(),
            addressFormField.getText(),
            zipFormField.getText(),});

    }

    // This method is called when an action event occurs (e.g., a button is clicked).
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addForm();
            JOptionPane.showMessageDialog(null, "Successfully Added New Student");
            DisplayTableFrame displayFrame = new DisplayTableFrame(model); // Create an instance of DisplayTableFrame
            displayFrame.setVisible(true);
        } else if (e.getSource() == clearButton) {
            JOptionPane.showMessageDialog(null, "Form fields cleared");
            clearAll();         // Clear all form fields

        } else if (e.getSource() == logoutButton) {
            addFrame.dispose();
            LoginGui login = new LoginGui();
        } else if (e.getSource() == exitButton) {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);  // Exit the application

            }
        }
    }
}
