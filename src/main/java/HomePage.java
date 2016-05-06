import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vshevchenko on 21/04/2016.
 */
public class HomePage extends Page {

    @Override
    public String getUrl() {
        return "http://skillsup.ua/";
    }

    @FindBy(xpath = "//div[@id='menu3039']/ul")
    private WebElement aboutUs;

    @FindBy(linkText = "Наша команда")
    private WebElement ourTeam;

    @FindBy(linkText = "Блог")
    private WebElement blog;



    public List<String> getElementsFromAboutUs() {
        List<String> list = new ArrayList<String>();
        for (WebElement element : aboutUs.findElements(By.xpath("./li/a"))){
            list.add(element.getAttribute("text"));
        }
        return list;
    }
    public void goToOurTeamPage() {
        ourTeam.click();
    }

    public void goToBlogPage() {
        blog.click();
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
