import org.example.Greeter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreeterTest {

    @Test
    public void greetTest(){
        Greeter g = new Greeter();
        Assert.assertEquals(g.greet("Rahat"), "Hello, Rahat!");
    }
}
