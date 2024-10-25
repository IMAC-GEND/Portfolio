import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginSystem {
    private static final String DATABASE_FILE = "database.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Login System!");

        // Prompt the user to choose an action
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Choose an action: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                registerUser(scanner);
                break;
            case 2:
                loginUser(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting the program.");
        }

        scanner.close();
    }

    private static void registerUser(Scanner scanner) {
        System.out.println("--- Registration ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username already exists in the database
        if (checkUsernameExists(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Save the login information to the database
        saveLoginInfo(username, password);

        System.out.println("Registration successful.");
    }

    private static boolean checkUsernameExists(String username) {
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

    private static void saveLoginInfo(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            writer.write(username + "," + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loginUser(Scanner scanner) {
        System.out.println("--- Login ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username exists in the database
        if (!checkUsernameExists(username)) {
            System.out.println("Username does not exist. Please register first.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate the login credentials
        if (validateCredentials(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static boolean validateCredentials(String username, String password) {
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
}
