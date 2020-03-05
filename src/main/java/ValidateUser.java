import java.util.regex.Pattern;

public class ValidateUser {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Using JUnit");
    }

    public static boolean isValidFirstName(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(firstNamePattern, firstName);
    }

    public static boolean isValidLastName(String firstName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(lastNamePattern, firstName);
    }

    public boolean isValidEmail(String Email) {
        String emailPattern = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        return Pattern.matches(emailPattern, Email);
    }

    public boolean isValidNumber(String number) {
        String numberPattern = "^[0-9]{2}[ ][0-9]{10}$";
        return Pattern.matches(numberPattern, number);
    }

    public boolean isValidPassword(String password) {
        if (password.length() >= 8)
            return true;
        else
            return false;
    }
}
