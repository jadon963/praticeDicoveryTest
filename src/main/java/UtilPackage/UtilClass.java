package UtilPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {

  public void scrollPage(WebDriver driver, WebDriverWait wait,String xpathHolder){
      JavascriptExecutor je = (JavascriptExecutor) driver;
      WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathHolder)));
      je.executeScript("arguments[0].scrollIntoView(true);",element);

  }

  public void mouseHover(WebDriver driver,WebElement element) {
      Actions actions = new Actions(driver);
      actions.moveToElement(element).build().perform();
  }

  public  String subString(String expectedTitle){
      int numericIndex = expectedTitle.indexOf("9");
      String subString= "";
      if (numericIndex != -1)
      {
          subString= expectedTitle.substring(0 , numericIndex); //this will give abc
      }
      return subString;
  }

}
