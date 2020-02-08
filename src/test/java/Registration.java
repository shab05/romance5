import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Registration extends BaseUI {

    @Test

    public void testSignInPage() {
        driver.findElement(Locators.LINK_SignIn).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.Link_Email).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.Link_Password)));
        driver.findElement(Locators.Link_Password).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.Link_Push));
        driver.findElement(Locators.Link_Push).click();

    }

}
