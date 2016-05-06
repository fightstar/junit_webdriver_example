import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

/**
 * Created by vshevchenko on 21/04/2016.
 */
public class AboutUsTest extends TestBase {

    OurTeamPage ourTeamPage;
    HomePage homePage;
    BlogPage blogPage;


    @Test
    public void teacherNameTest() {
        String teacher2Name = "Александр Галковский";
        homePage = PageFactory.initElements(super.driver, HomePage.class);
        homePage.open();
        homePage.goToOurTeamPage();
        ourTeamPage = PageFactory.initElements(super.driver, OurTeamPage.class);
        Assert.assertTrue("Name " + teacher2Name + " doesn't match ", ourTeamPage.verifyTeacherName(teacher2Name));
    }

    @Test
    public void aboutUsMenuTest() {
        homePage = PageFactory.initElements(super.driver, HomePage.class);
        homePage.open();
        List<String> actualMenuItems = homePage.getElementsFromAboutUs();
        Assert.assertEquals("Errir", OurTeamMenu.getNodeNameList(), actualMenuItems);
    }

    @Test
    public void blogTest() {
        homePage = PageFactory.initElements(super.driver, HomePage.class);
        homePage.open();
        blogPage = PageFactory.initElements(super.driver, BlogPage.class);
        blogPage.open();
        blogPage.clickOnPage("");
        System.out.println("asdasdasd");

    }

}
