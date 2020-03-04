import java.util.regex.Pattern;

public class ValidateUser {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Using JUnit");
    }

    public static boolean isValid(String firstName)
    {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$",firstName);
    }
}
