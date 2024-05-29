package Day10_05062024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.Zip;

public class T1_MouseAction {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it incognito
        options.addArguments("Incognito");
        //add option to start it maximized
        options.addArguments("Incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.usps.com");
        //define Action command
        Actions mouseAction = new Actions (driver);
        //hover over the Send Tab to open the drop-down list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch (Exception e){
            System.out.println("Unable to hover over Sent Tab" + e);
        }//end of exception
        //Click on Look Up a Zip Code from the drop down list
        try{
            WebElement zipCodeLookUp = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookUp).click().perform();
        } catch (Exception e){
            System.out.println("Unable to click on Look up a Zip Code" +e);
        }//end of exception
        //Click on find cities by Zip Code
        try{
            WebElement findCitiesByZipCode = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCitiesByZipCode).click().perform();
        }catch (Exception e){
            System.out.println("Unable to click on Find Cities by Zip code "+e);
        }//end of exception
        //enter a zip code
        try{
            WebElement ZipCode = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(ZipCode).sendKeys("11221").perform();
        }catch (Exception e){
            System.out.println("Unable to enter Zip Code "+e);
        }//end of exception
    }//end of main
}//end of class
