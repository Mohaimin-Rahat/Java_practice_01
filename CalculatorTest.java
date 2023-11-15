import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test

    public void testAddNumber(){
        Calculator c = new Calculator();
        Assert.assertEquals(c.addNumber(5,6),11);
    }

    @Test
    public void testSubNumber(){
        Calculator c= new Calculator();
        Assert.assertEquals(c.subtractNumber(15,5),10);
    }
}
