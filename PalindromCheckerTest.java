import org.example.PalindromChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromCheckerTest {
    @Test
    public void palindromCheckerTest(){
        PalindromChecker p= new PalindromChecker();
        Assert.assertTrue(p.isPalindrome("MOM"));
        Assert.assertTrue(p.isPalindrome("CIVIC"));
        Assert.assertFalse(p.isPalindrome("RAHAT"));
    }
}
