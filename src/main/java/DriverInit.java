import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vshevchenko on 21/04/2016.
 */
final class DriverInit {

    private static WebDriver driver;

    private static WebDriver driverInit() {
        System.out.println("web driver initialize");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebDriver getDriver() {
        if(driver == null){
            return driver = driverInit();
        }
        return driver;
    }
}
