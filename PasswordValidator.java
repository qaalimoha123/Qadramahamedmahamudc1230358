import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isValid = isLengthValid(password)
                && hasUppercase(password)
                && hasLowercase(password)
                && hasDigit(password)
                && hasSpecialChar(password);

        if (isValid) {
            System.out.println("Password is strong!");
        } else {
            System.out.println("Password is weak. Try again!");
        }
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    public static boolean hasUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    public static boolean hasLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    public static boolean hasSpecialChar(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return true;
        }
        return false;
    }
}



