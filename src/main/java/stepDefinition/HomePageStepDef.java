package stepDefinition;
import UtilPackage.UtilClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class HomePageStepDef {
    WebDriver driver;
    WebDriverWait wait;
    public UtilClass scrollObject;
    public  String expectedtitle;
    Hooks hookObject;


    public HomePageStepDef(Hooks hookObject) {
        this.hookObject= hookObject;
    }

    @Given("^User is already on homePage$")
    public void user_is_already_on_homePage() throws Throwable {
        driver = hookObject.getDriver();
        wait = hookObject.getWait();
        scrollObject = new UtilClass();
        String titleHomePage = driver.getTitle();
        assertEquals("Discovery - Official Site",titleHomePage);
    }

    @When("^user scroll down upto recommended section$")
    public void user_scroll_down_upto_recommended_section() throws Throwable {
        scrollObject.scrollPage(driver,wait,"//div[contains(text(),'Recommended')]");
    }

    @Then("^user addVideos from recommended$")
    public void user_add_and_from_recommended() throws Throwable {
        List<WebElement> noVideos = driver.findElements(By.xpath("//body/div[@id='react-root']/div[@class='app-main app__main umbrella']/div[@class='page-wrapper app__pageWrapper']/section[8]/div[1]/div[1]/div[1]/div[1]/div"));
        WebElement firstVideo = noVideos.get(0);
        WebElement secondVideo = noVideos.get(1);
        scrollObject.mouseHover(driver,firstVideo);
        List<WebElement> favoritesButtons = driver.findElements(By.xpath("//div[@class='content carousel__content showCarousel__content']/div[@class='carousel-tile-wrapper carousel__tileWrapper']/section[@class='tile showTileSquare__main transition-in']/div[@class='content-box showTileSquare__contentBox']/a/div/div[2]/div"));
        favoritesButtons.get(0).click();
        scrollObject.mouseHover(driver,secondVideo);
        favoritesButtons.get(1).click();
        expectedtitle = ((JavascriptExecutor)driver).executeScript("return arguments[0].firstChild.textContent;", firstVideo).toString();
        expectedtitle  = scrollObject.subString(expectedtitle);
    }

    @And("^Navigate to MyVideos page$")
    public void Navigate_to_MyVideos_page () throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("window.open()");
        // To switch to the new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        // To navigate to new link/URL in 2nd new tab
        driver.get("https://www.discovery.com/my-videos");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
        }

    @Then("^Verify favorites added to My videos$")
    public void Verify_favorites_added_to_My_video(){
        scrollObject.scrollPage(driver,wait,"//h2[@class='localStorageCarousel__heading']");
        List<WebElement> ele= driver.findElements(By.xpath("//section[@class='layout-section FavoriteShowsCarousel layoutSection__main ']//div[@class='show-carousel showCarousel__main']//div[@class='carousel carousel__main showCarousel__carousel is-mouse-experience']//div//div[@class='content carousel__content showCarousel__content']//div[@class='carousel-tile-wrapper carousel__tileWrapper']"));
        String actualTitle = ((JavascriptExecutor)driver).executeScript("return arguments[0].firstChild.textContent;", ele.get(0)).toString();
        actualTitle  = scrollObject.subString(actualTitle);
        assertEquals(expectedtitle,actualTitle);
    }
}
