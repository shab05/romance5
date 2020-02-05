import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends BaseUI {
    String currentUrlContactUs;


    @Test

    public void ContactUsPage() {
        driver.findElement(Locators.Link_ContactUs).click();
        currentUrlContactUs = driver.getCurrentUrl();
        System.out.println(currentUrlContactUs);
        Assert.assertEquals(currentUrlContactUs, Data.expectedUrlContactUs);


    }


}
