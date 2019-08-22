package stepDefinition;
import UtilPackage.UtilClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;
    public WebDriverWait wait;
    public  HomePageStepDef home;
    @Before
    public void beforeScenario(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://go.discovery.com/");
        wait = new WebDriverWait(driver,50);
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);

       // home = new HomePageStepDef(driver,wait);
    }
    public WebDriver getDriver(){
       return driver;
    }
    public  WebDriverWait getWait(){
        return wait;
    }

    @After
    public void afterScenario(){
       driver.quit();
    }
}
