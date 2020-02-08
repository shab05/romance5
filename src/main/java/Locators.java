import org.openqa.selenium.By;

public class Locators {

    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://marryukrainianlady.org/content/view/blog']");

    //Registration page
    public static final By LINK_SignIn = By.xpath("//button[@class='btn.btn-primary']");
    public static final By Link_Email = By.cssSelector("input#email");
    public static final By Link_Password = By.cssSelector("input#password");
    public static final By Link_Push = By.xpath("//button[@class='btn.btn-primary']");

    //Search page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://marryukrainianlady.org/content/view/how-it-works']");

    // ContactUs page
    public static final By Link_ContactUs = By.xpath("//div[@class='breadcrumbs']");

    //Groupon page
    public static final By Link_Groupon = By.xpath("//iframe[@src='https://www.youtube.com/embed/fJmi8VFDOUE?rel=0&showinfo=0&enablejsapi=1&origin=https%3A%2F%2Fwww.groupon.com&widgetid=2']");
    public static final By Link_Button = By.cssSelector("button.ytp-play-button.ytp-button");




}
