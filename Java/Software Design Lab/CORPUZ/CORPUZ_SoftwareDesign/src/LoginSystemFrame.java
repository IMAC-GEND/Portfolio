import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoginSystemFrame extends JFrame {
    private static final String DATABASE_FILE = "database.txt";
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSystemFrame() {
        super("Login System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 500));
        setResizable(false);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Login System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(titleLabel, constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(usernameLabel, constraints);

        constraints.gridx = 1;
        panel.add(usernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        panel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        constraints.gridy = 4;
        panel.add(registerButton, constraints);

        add(panel);
        pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
    }

    private void loginUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if the username exists in the database
        if (!checkUsernameExists(username)) {
            showMessageDialog("Username does not exist. Please register first.");
            return;
        }

        // Validate the login credentials
        if (validateCredentials(username, password)) {
            showMessageDialog("Login successful. Welcome, " + username + "!");
        } else {
            showMessageDialog("Invalid username or password.");
        }
    }

    private void registerUser() {
        String username = usernameField.getText();

        // Check if the username already exists in the database
        if (checkUsernameExists(username)) {
            showMessageDialog("Username already exists. Please choose a different username.");
            return;
        }

        String password = new String(passwordField.getPassword());

        // Save the login information to the database
        saveLoginInfo(username, password);

        showMessageDialog("Registration successful.");
    }

    private boolean checkUsernameExists(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATABASE_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void saveLoginInfo(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            writer.write(username + "," + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean validateCredentials(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATABASE_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new LoginSystemFrame().setVisible(true);
            }
        });
    }
}
