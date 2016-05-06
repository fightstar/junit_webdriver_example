import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.UserSteps;

/**
 * Created by vshevchenko on 27/04/2016.
 */
@RunWith(SerenityRunner.class)
public class GoogleTest {

    String expected = "Google";

    @Managed
    public WebDriver webDriver;


    @ManagedPages
    public Pages pages;

    @Steps
    public UserSteps userSteps;

    @Test
    public void checkGoogleTitle() {
        userSteps.openGooglePage();
        userSteps.checkPageTitle(expected);
    }


}
