
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



    public class MainPage {
    String mainUrl = "https://marryukrainianlady.org/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlKharkov;
    String currentUrlNews;
    String currentUrlBlog;
    String currentUrlFactors;
    String expectedUrlSearch ="https://marryukrainianlady.org/content/view/how-it-works";
    String expectedUrlKharkov = "https://marryukrainianlady.org/content/view/kharkov-dating-agency";
    String expectedUrlNews ="https://marryukrainianlady.org/news";
    String expectedUrlBlog ="https://marryukrainianlady.org/content/view/blog";
    String expectedUrlFactors ="https://marryukrainianlady.org/content/view/9-factors-to-keep-in-mind-when-dating-a-ukrainian";
    By LINK_KHARKOV = By.xpath("//div[@class='info-content-block wysiwyg']");
    By LINK_SEARCH = By.xpath("//a[@href='https://marryukrainianlady.org/content/view/how-it-works']");
    By LINK_NEWS = By.xpath("//a[@href='https://marryukrainianlady.org/news/'][@id='footer_footer-menu-about-item_footer-menu-news-item']");
    By LINK_BLOG = By.xpath("//a[@href='https://marryukrainianlady.org/content/view/blog']");
    By LINK_FACTORS = By.xpath("//a[@href='https://marryukrainianlady.org/content/view/9-factors-to-keep-in-mind-when-dating-a-ukrainian']");
    By LINK_JOIN_NOW = By.xpath("//button[@class='btn btn-primary']");
    By LINK_SignIn = By.xpath("//button[@class='btn btn-primary']");
    int indexLinkJoinNow = 1;
    By Link_Email = By.cssSelector("input#email");
    By Link_Password = By.cssSelector("input#password");
    By Link_Push = By.xpath("//button[@class='btn btn-primary']");


    







    @BeforeMethod
        public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);

    }

    @Test

    public void testSearchPage() {

      driver.findElement(LINK_SEARCH).click();
      currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);

    }

    @Test

        public void testKharkovPage() {

        driver.findElement(LINK_KHARKOV).click();
        currentUrlKharkov = driver.getCurrentUrl();
        System.out.println(currentUrlKharkov);
        Assert.assertEquals(currentUrlKharkov, expectedUrlKharkov);
    }


    @Test

        public void testNewsPage() {

        driver.findElement(LINK_NEWS).click();
        currentUrlNews = driver.getCurrentUrl();
        System.out.println(currentUrlNews);
        Assert.assertEquals(currentUrlNews, expectedUrlNews);
    }

    @Test

        public void testBlogPage() {

        driver.findElement(LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);

    }
    @Test

        public void testFactorsPage() {

        driver.findElement(LINK_FACTORS).click();
        currentUrlFactors = driver.getCurrentUrl();
        System.out.println(currentUrlFactors);
        Assert.assertEquals(currentUrlFactors, expectedUrlFactors);

    }

    @Test

        public void testSignInPage() {
        driver.findElement(LINK_SignIn).click();
        driver.findElement(Link_Email).sendKeys("@yahoo.com");
        driver.findElement(Link_Password).sendKeys("@yahoo.com");
        driver.findElement(Link_Push).click();

    }







    @Test

        public void testJoinNowPage() {
        WebElement linkJoinNow = driver.findElement(LINK_JOIN_NOW);
        linkJoinNow.click();

    }




    @AfterMethod

        public void afterActions() {

        // driver.quit();
    }



}
