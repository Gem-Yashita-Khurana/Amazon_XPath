import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\yashita\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL= "https://www.amazon.in/";
        driver.get(baseURL);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("books");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        WebElement firstBook = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[9]/div/div/div/div/div[2]/div[1]/h2/a/span"));
        String bookName = firstBook.getText();
        System.out.println("First Book's Name: " + bookName);

    }

}
