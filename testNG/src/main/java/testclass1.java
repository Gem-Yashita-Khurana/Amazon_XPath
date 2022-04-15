import org.testng.annotations.Test;

public class testclass1 {

    @Test (groups = {"Regression"})
    public void TestCase_A()
    {
        System.out.println("Function A");
    }

    @Test (groups = {"SmokeR","Regression"})
    public void TestCase_B()
    {
        System.out.println("Function B");
    }

    @Test
    public void TestCase_C()
    {
        System.out.println("Function C");
    }

}
