package steps;


import Utils.DataShare;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static WebElement activityElement;
    @Before
    public void BeforeScenario(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    @After
    public void AfterScenario(Scenario scenario){
        if(true)
        {

//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", this.activityElement, "color: yellow; border: 2px solid red;");
//            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png");
            String path = "RQ665.docx";
            try{
                byte[] encoded = Files.readAllBytes(Paths.get(path));
                scenario.embed(encoded,"application/vnd.openxmlformats-officedocument.wordprocessingml.document");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
