import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vshevchenko on 21/04/2016.
 */
public abstract class Page{
    WebDriver driver;
    protected int pageOpenTimeout = 500;

    public Page(WebDriver driver) {
        this.driver = driver;
    }


    public void open(){
        driver.get(getUrl());
    };

    public void waitTitleForLoaded(String s) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleIs(s));
    }


    public String getTitle(){
        return driver.getTitle();
    };

    public abstract String getUrl();
}
