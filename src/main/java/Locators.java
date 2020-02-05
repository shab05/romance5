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
    public static final By Link_Name = By.xpath("//input[@type='text'][@name='user_name']");
    public static final By Link_EmailUs = By.xpath("//input[@type='text'][@name='user_email']");
    public static final By Link_Subject = By.xpath("//input[@type='text'][@name='subject']");
    public static final By Link_Message = By.xpath("//div//textarea[@class='form-control']");
    public static final By Link_Security = By.xpath("//input[@class='captcha.form-control']");
    public static final By Link_Button = By.xpath("//input[@class='btn.btn-primary']");
    public static final By Link_Reason = By.xpath("//select[@name='id_reason']");



}
