import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vshevchenko on 21/04/2016.
 */
abstract public class TestBase extends Assert {
    WebDriver driver;

    @Before
    public void initWebDriver(){
        System.out.println("web driver initialize");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser() {
        driver.quit();
        System.out.println("web driver closed");
    }

}
