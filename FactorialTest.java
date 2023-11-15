import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testWithNumber5(){
        Factorial f= new Factorial();
        Assert.assertEquals(f.factorial(5),120);
    }

    @Test
    public void testWithNumber4(){
        Factorial f= new Factorial();
        Assert.assertEquals(f.factorial(4),25);
    }
}
