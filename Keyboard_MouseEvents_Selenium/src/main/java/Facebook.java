import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yashita\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");

        WebElement firstName =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
        WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));

        Actions a = new Actions(driver);
        a.moveToElement(firstName).click().keyDown(Keys.SHIFT).sendKeys("yashita");
        a.keyUp(Keys.SHIFT).build().perform();

        a.keyDown(Keys.CONTROL).sendKeys("a");
        a.sendKeys("c");


//        a.moveToElement(lastName);
//        a.contextClick(lastName).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//        WebElement paste = driver.findElement(By.linkText("Paste"));
//        paste.click();

        a.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v");
        a.keyUp(Keys.CONTROL).build().perform();

        WebElement phn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        a.moveToElement(phn).click().sendKeys("987654321").build().perform();

        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
        a.moveToElement(password).click().sendKeys("pass@08K").build().perform();

        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        Select dayDrop = new Select(day);
        dayDrop.selectByIndex(6);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select monthDrop = new Select(month);
        monthDrop.selectByIndex(6);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        Select yearDrop = new Select(year);
        yearDrop.selectByIndex(14);


        WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input"));
        gender.click();

    }

}
