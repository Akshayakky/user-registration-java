import org.junit.Assert;
import org.junit.Test;

public class UserValidationTestCases {
    ValidateUser user = new ValidateUser();

    String[] validEmails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    };

    String[] invalidEmails = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au",
    };

    //JUNIT TESTING FOR FIRSTNAME
    @Test
    public void givenFirstName_WhenValidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValidFirstName("Akshay");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValidFirstName("akshay");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenValidLength_ThenReturn() {
        boolean result = user.isValidFirstName("Aks");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalidLength_ThenReturn() {
        boolean result = user.isValidFirstName("Ak");
        Assert.assertFalse(result);
    }

    //JUNIT TESTING FOR LASTNAME
    @Test
    public void givenLastName_WhenValidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValidFirstName("Kharade");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValidFirstName("kharade");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValidLength_ThenReturn() {
        boolean result = user.isValidFirstName("Kha");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInvalidLength_ThenReturn() {
        boolean result = user.isValidFirstName("Kh");
        Assert.assertFalse(result);
    }

    //JUNIT TESTING FOR EMAIL
    @Test
    public void givenEmail_WhenValid_ThenReturn() {
        for (int i = 0; i < validEmails.length; i++) {
            boolean result = user.isValidEmail(validEmails[i]);
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenEmail_WhenInvalid_ThenReturn() {
        for (int i = 0; i < validEmails.length; i++) {
            boolean result = user.isValidEmail(invalidEmails[i]);
            Assert.assertFalse(result);
        }
    }

    //JUNIT TESTING FOR MOBILE NUMBER
    @Test
    public void givenNumber_WhenValidLength_ThenReturn() {
        boolean result = user.isValidNumber("91 7989879873");
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumber_WhenInvalidLength_ThenReturn() {
        boolean result = user.isValidNumber("91 79898798733");
        Assert.assertFalse(result);
        result = user.isValidNumber("7989879873");
        Assert.assertFalse(result);
    }

    @Test
    public void givenNumber_WhenValidSpace_ThenReturn() {
        boolean result = user.isValidNumber("91 7989879873");
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumber_WhenInvalidSpace_ThenReturn() {
        boolean result = user.isValidNumber("917989879873");
        Assert.assertFalse(result);
        result = user.isValidNumber("913 798987987");
        Assert.assertFalse(result);
    }

    //JUNIT TESTING FOR PASSWORD
    @Test
    public void givenPassword_WhenValidLength_ThenReturn() {
        boolean result = user.isValidPassword("Akshay12");
        Assert.assertTrue(result);
        result = user.isValidPassword("Akshay123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalidLength_ThenReturn() {
        boolean result = user.isValidPassword("Akshay1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValidUppercase_ThenReturn() {
        boolean result = user.isValidPassword("Akshay123");
        Assert.assertTrue(result);
        result = user.isValidPassword("AKSHAY123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalidUppercase_ThenReturn() {
        boolean result = user.isValidPassword("akshay123");
        Assert.assertFalse(result);
        result = user.isValidPassword("akshayakshay12");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValidNumericCase_ThenReturn() {
        boolean result = user.isValidPassword("Akshay123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenInvalidNumericCase_ThenReturn() {
        boolean result = user.isValidPassword("Akshayakshay");
        Assert.assertFalse(result);
    }
}
