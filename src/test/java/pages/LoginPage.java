package pages;

import Utils.DataShare;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement txtUserName;
    @FindBy(id = "password")
    WebElement txtPassWord;
    @FindBy(css = "input.btn_action")
    WebElement btnLogin;
    @FindBy(css = ".login-box > form > h3")
    WebElement labelError;

    public void openHomePage() {
        driver.get(DataShare.HompageUrl);
    }

    public LoginPage inputUserName(String username) {
        txtUserName.sendKeys(username);
        return this;
    }

    public LoginPage inputPassWord(String password) {
        txtPassWord.sendKeys(password);
        return this;
    }

    public void clickBtnLogin() {
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void seeErrorMessage(String message) {
        Assert.assertEquals(message, labelError.getText());
    }
}
