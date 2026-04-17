import java.util.*;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Invalid username!");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 4) {
            throw new IllegalArgumentException("Password must be at least 4 characters!");
        }
        this.password = password;
    }
}

class AuthSystem {
    private Map<String, User> users = new HashMap<>();
    public void register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists!");
            return;
        }

        User user = new User(username, password);
        users.put(username, user);
        System.out.println("Registration Successful!");
    }

    public void login(String username, String password) {
        if (!users.containsKey(username)) {
            System.out.println("User not found!");
            return;
        }

        User user = users.get(username);
        if (user.getPassword().equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Password!");
        }
    }
    public void showUsers() {
        System.out.println("\nRegistered Users:");
        for (String key : users.keySet()) {
            System.out.println("- " + key);
        }
    }
}
public class AuthApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthSystem auth = new AuthSystem();

        while (true) {
            System.out.println("\n--- Authentication System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show Users");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String regUser = sc.nextLine();

                        System.out.print("Enter password: ");
                        String regPass = sc.nextLine();

                        auth.register(regUser, regPass);
                        break;

                    case 2:
                        System.out.print("Enter username: ");
                        String logUser = sc.nextLine();

                        System.out.print("Enter password: ");
                        String logPass = sc.nextLine();

                        auth.login(logUser, logPass);
                        break;

                    case 3:
                        auth.showUsers();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}