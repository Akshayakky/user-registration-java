import org.junit.Assert;
import org.junit.Test;

public class UserValidationTestCases {
    ValidateUser user = new ValidateUser();

    @Test
    public void givenFirstName_WhenValidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValid("Akshay");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalidFirstLetterUpperCase_ThenReturn() {
        boolean result = user.isValid("akshay");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenValidLength_ThenReturn() {
        boolean result = user.isValid("Aks");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInvalidLength_ThenReturn() {
        boolean result = user.isValid("Ak");
        Assert.assertFalse(result);
    }
}
