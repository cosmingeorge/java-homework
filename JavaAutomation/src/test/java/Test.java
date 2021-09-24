import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.File;

public class Test {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cosmin.muntean\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        //System.out.println("test");

        WebElement SignIn = driver.findElement(new By.ByClassName("login"));
        //System.out.println(SignIn.getText());
        SignIn.click();

        driver.getCurrentUrl();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));

        email.sendKeys("qaworkshopsv@mailinator.com");
        password.sendKeys("QAWorkshopSV1!");

        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();

        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", driver.getCurrentUrl());
        System.out.println("The login is successfully made and the correct page is loaded");



        //Firefox
      //  File pathToBinary = new File("C:\\user\\Programme\\FirefoxPortable\\App\\Firefox\\firefox.exe");
      //  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
      //  FirefoxProfile firefoxProfile = new FirefoxProfile();
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\cosmin.muntean\\GeckoDriver\\geckodriver.exe");
       // WebDriver driverFirefox = new FirefoxDriver();
       // driverFirefox.get("http://automationpractice.com");

    }
}
