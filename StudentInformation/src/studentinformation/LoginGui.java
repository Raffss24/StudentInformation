package studentinformation;

/**
 *
 * @author Administrator
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui extends JFrame implements ActionListener {
    //in this class we will set up out gui

    //declare variables here
    JFrame loginFrame;
    JLabel backgroundLabel, loginTitleLabel, loginUsernameLabel, loginPasswordLabel;
    JTextField loginUsernameField;
    JPasswordField loginPasswordField;
    JButton loginButton;

    //create a constructor of the class
    //this is where you initialize the variables
    public LoginGui() {
        loginFrame = new JFrame();
        loginTitleLabel = new JLabel();
        loginUsernameLabel = new JLabel();
        loginPasswordLabel = new JLabel();
        loginUsernameField = new JTextField();
        loginPasswordField = new JPasswordField();
        loginButton = new JButton();
        
        

       
        // Set up the background image
        ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\StudentInformation\\src\\studentinformation\\80.jpg");
        Image backgroundImage = backgroundImageIcon.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        backgroundImageIcon = new ImageIcon(backgroundImage);
        backgroundLabel = new JLabel(backgroundImageIcon);
        backgroundLabel.setBounds(0, 0, 500, 300);

        // Add the background label to loginFrame as the bottommost component
        loginFrame.getLayeredPane().add(backgroundLabel, Integer.valueOf(Integer.MIN_VALUE));
        
        
          //Labels
        loginTitleLabel.setText("WELCOME TO STUDENT INFORMATION");
        loginTitleLabel.setForeground(Color.white);
        loginTitleLabel.setFont(new Font("Dialogue", Font.BOLD, 20));
        loginTitleLabel.setBounds(50, 15, 500, 50);


        //to make coding faster you can just copy the properties then rename the variable
        //then adjust properties
        loginUsernameLabel.setText("USERNAME");
        loginUsernameLabel.setForeground(Color.white);
        loginUsernameLabel.setFont(new Font("Dialogue", Font.BOLD, 15));
        loginUsernameLabel.setBounds(100, 75, 300, 50);

        loginPasswordLabel.setText("PASSWORD");
        loginPasswordLabel.setForeground(Color.white);
        loginPasswordLabel.setFont(new Font("Dialogue", Font.BOLD, 15));
        loginPasswordLabel.setBounds(100, 125, 300, 50);

        //textfields
        loginUsernameField.setBounds(200, 90, 200, 25);

        //passwordfields
        loginPasswordField.setBounds(200, 135, 200, 25);
        //loginPasswordField.setEchoChar('*');

        //buttons
        loginButton.setText("LOGIN");
        loginButton.setBackground(Color.ORANGE);
        loginButton.setForeground(Color.white);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Dialogue", Font.BOLD, 18));
        loginButton.setBounds(100, 170, 300, 40);
        loginButton.addActionListener(this);

      

        //adding components to JFrame
        loginFrame.add(loginTitleLabel);
        loginFrame.add(loginUsernameLabel);
        loginFrame.add(loginPasswordLabel);
        loginFrame.add(loginUsernameField);
        loginFrame.add(loginPasswordField);
        loginFrame.add(loginButton);
        loginFrame.add(backgroundLabel);

        //frame
        loginFrame.setTitle("Student Information System");
        loginFrame.setSize(500, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String enteredUsername = loginUsernameField.getText();
            String enteredPassword = new String(loginPasswordField.getPassword());

            if (enteredUsername.isBlank() || enteredPassword.isBlank()) {
                JOptionPane.showMessageDialog(loginFrame, "Please Enter A Username And Password",
                        "Empty Fields", 0);
            } else {
                Validator validator = new Validator(enteredUsername, enteredPassword);
                if (validator.validate()) {
                    JOptionPane.showMessageDialog(loginFrame, "Login Success!!!");
                    MyAddButton myAdd = new MyAddButton();

                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Incorrect Username Or Password",
                            "Invalid Login Credentials", 0);
                }
            }
        }
    }
}
