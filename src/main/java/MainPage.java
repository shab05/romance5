import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.LINK_SignIn).click();
    }

    public void completeFirstPart() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.Link_Email).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.Link_Password)));
        driver.findElement(Locators.Link_Password).sendKeys(Data.password);
    }

    public void completeSecondPart() {
        driver.findElement(By.cssSelector("#daySelect"));
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='5']"));
        driver.findElement(By.cssSelector("#monthSelect"));
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='Dec']"));
        driver.findElement(By.cssSelector("#yearSelect"));
        driver.findElement(By.xpath("//li[@data-handler='yearSelect']//a[text()='1988']"));
        WebElement checkboxConfirmation = driver.findElement(By.cssSelector("input#confirmation"));
        checkboxConfirmation.click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.Link_Push));
        driver.findElement(Locators.Link_Push).click();
    }
}
