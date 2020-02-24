import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://marryukrainianlady.org/";
    String mainUrlG = "https://www.groupon.com/";
    MainPage mainPage;
    SearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,20);
        mainPage = new MainPage(driver,wait);
        searchPage = new SearchPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
        driver.get(mainUrlG);

    }

        @AfterMethod
        public void afterActions () {
            //driver.quit();

        }

    }











