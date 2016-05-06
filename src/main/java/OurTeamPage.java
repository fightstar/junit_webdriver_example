import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vshevchenko on 21/04/2016.
 */
public class OurTeamPage extends Page {

    @FindBy(xpath = ".//*[@id='page_position_content']//div[@class = 'team-list clearfix'][1]//div[2]/a/span[@class = 'name']")
    private WebElement teacher2Name;

    @FindBy(className = "name")
    private WebElement nameFieldInsideCard;

    public boolean verifyTeacherName (String name){
        if (teacher2Name.getText().equals(name)){
            return true;
        }  else return false;
    }

//    private List<String> getAllCoachNames() {
//        return driver.findElements(By.className("name")).stream().map(WebElement::getText).collect(Collectors.toList());
//    }

    public OurTeamPage(WebDriver driver) {
        super(driver);
    }



    @Override
    public String getUrl() {
        return "http://skillsup.ua/about/our-team.aspx";
    }


}
