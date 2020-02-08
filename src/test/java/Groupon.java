import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Groupon extends BaseUI {

    @Test

    public void test2() throws InterruptedException {

        Thread.sleep(5000);
        WebElement video = driver.findElement(Locators.Link_Groupon);
        driver.switchTo().frame(video);
        driver.findElement(Locators.Link_Button).click();


    }


}
