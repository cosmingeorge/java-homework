import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class TestFirefox {

    public static void main (String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\cosmin.muntean\\GeckoDriver\\geckodriver.exe");
        File pathBinary = new File("C:\\Program Files\\Firefox Nightly\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
        WebDriver driverFirefox = new FirefoxDriver(options);


        driverFirefox.get("http://automationpractice.com");
        //System.out.println("test");

        WebElement SignIn = driverFirefox.findElement(new By.ByClassName("login"));
        //System.out.println(SignIn.getText());
        SignIn.click();

        driverFirefox.getCurrentUrl();

        WebElement email = driverFirefox.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement password = driverFirefox.findElement(By.xpath("//*[@id=\"passwd\"]"));

        email.sendKeys("qaworkshopsv@mailinator.com");
        password.sendKeys("QAWorkshopSV1!");

        WebElement login = driverFirefox.findElement(By.id("SubmitLogin"));
        login.click();

        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", driverFirefox.getCurrentUrl());
        System.out.println("The login is successfully made and the correct page is loaded");






    }
}
