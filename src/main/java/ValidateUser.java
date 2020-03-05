import java.util.regex.Pattern;

public class ValidateUser {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Using JUnit");
    }

    //FUNCTION TO VALIDATE FIRST NAME
    public static boolean isValidFirstName(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(firstNamePattern, firstName);
    }

    //FUNCTION TO VALIDATE LAST NAME
    public static boolean isValidLastName(String firstName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(lastNamePattern, firstName);
    }

    //FUNCTION TO VALIDATE EMAIL
    public boolean isValidEmail(String Email) {
        String emailPattern = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        return Pattern.matches(emailPattern, Email);
    }

    //FUNCTION TO VALIDATE MOBILE NUMBER
    public boolean isValidNumber(String number) {
        String numberPattern = "^[0-9]{2}[ ][0-9]{10}$";
        return Pattern.matches(numberPattern, number);
    }

    //FUNCTION TO VALIDATE PASSWORD
    public boolean isValidPassword(String password) {
        String passwordPattern = "(?=.*[A-Z])(?=.*[0-9]).{8,}";
        return Pattern.matches(passwordPattern,password);
    }
}
