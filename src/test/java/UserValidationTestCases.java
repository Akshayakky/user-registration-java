import org.junit.Assert;
import org.junit.Test;

public class UserValidationTestCases {
    ValidateUser user = new ValidateUser();

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
}
