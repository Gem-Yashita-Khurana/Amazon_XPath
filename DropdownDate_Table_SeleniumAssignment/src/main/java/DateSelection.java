import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class DateSelection {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yashita\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\yashita\\Downloads\\Dropdown.html");

        WebElement day = driver.findElement(By.xpath("//*[@id=\"dob-day\"]"));
        Select dayDrop = new Select(day);
        dayDrop.selectByIndex(6);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"dob-month\"]"));
        Select monthDrop = new Select(month);
        monthDrop.selectByIndex(6);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"dob-year\"]"));
        Select yearDrop = new Select(year);
        yearDrop.selectByIndex(9);

        List<WebElement> list=yearDrop.getOptions();

        boolean flag =true;

        for(int i=2;i<list.size()-1;i++)
        {
            if(Integer.parseInt(list.get(i).getText()) - Integer.parseInt(list.get(i+1).getText())>0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("not in Descending");
        else
            System.out.println("not in Ascending");
    }
}
