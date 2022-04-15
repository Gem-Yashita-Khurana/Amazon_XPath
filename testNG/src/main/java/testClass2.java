import org.testng.annotations.Test;
public class testClass2 {

    @Test (groups = {"SmokeR"})
    public void TestCase_D()
    {
        System.out.println("Function D");
    }
    @Test
    public void TestCase_E()
    {
        System.out.println("Function E");
    }
    @Test (groups = {"SmokeR"})
    public void TestCase_F()
    {
        System.out.println("Function F");
    }

}
