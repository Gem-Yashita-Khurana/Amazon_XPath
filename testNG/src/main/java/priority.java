import org.testng.annotations.Test;
public class priority {

    @Test(priority = 6)
    public void TestCase_a()
    {  System.out.println("Function A"); }
    @Test (priority = 0)
    public void TestCase_b()
    {  System.out.println("Function B"); }
    @Test
    public void TestCase_c()
    {  System.out.println("Function C"); }
    @Test(priority = 5)
    public void TestCase_d()
    {  System.out.println("Function D"); }
    @Test(priority = 1)
    public void TestCase_e()
    {  System.out.println("Function E"); }

}
