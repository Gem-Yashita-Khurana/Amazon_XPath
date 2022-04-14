import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\yashita\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C:/Users/yashita/Downloads/Assignment.html");
        String start = "/html/body/table/tbody/tr[";
        String end = "]/td[1]";
        ArrayList<String> name=new ArrayList<>();
        for (int i = 2; i <= 18; i++) {
            String actualXpath = start + i + end;//nice
            WebElement element = driver.findElement(By.xpath(actualXpath));
            if(!name.contains(element.getText()))
                name.add(element.getText());
        }

        String aStart = "/html/body/table/tbody/tr[";
        String aEnd = "]/td[2]";
        ArrayList<String> age = new ArrayList<>();
        for (int i = 2; i <= 18; i++) {
            String xpath = aStart + i + aEnd;
            WebElement entry = driver.findElement(By.xpath(xpath));
            if(!age.contains(entry.getText()))
                age.add(entry.getText());
        }

        System.out.println(name);
        System.out.println(age);

    }
}
