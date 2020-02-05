import org.testng.annotations.Test;


public class Registration extends BaseUI {

    @Test

    public void testSignInPage() {
        driver.findElement(Locators.LINK_SignIn).click();
        driver.findElement(Locators.Link_Email).sendKeys(Data.email);
        driver.findElement(Locators.Link_Password).sendKeys(Data.password);
        driver.findElement(Locators.Link_Push).click();

    }

}
