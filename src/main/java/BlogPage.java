import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vshevchenko on 26/04/2016.
 */
public class BlogPage extends Page {


    @FindBy(xpath = ".//*[@id='ContentPlaceHolderDefault_content_skillsup.content.blog.list_2_BlogListRepeater_BlogDataPager']/a[1]")
    private WebElement page2;


    public void clickOnPage(String number){
        page2.click();
    }
    public BlogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getUrl() {
        return "http://skillsup.ua/about/blog.aspx";
    }
}
