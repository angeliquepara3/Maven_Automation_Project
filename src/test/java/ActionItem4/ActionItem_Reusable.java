package ActionItem4;

import Day11_05072024.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ActionItem_Reusable {
    public static void main(String[] args) {
        //define the webdriver variable and set up chromedriver
        WebDriver driver = new ChromeDriver();
        //go to Weight Watcher website
        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
        //click on the Find a Workshop button in the top right hand corner
        ReusableMethods.clickMethod(driver,"//*[text() = 'Find a Workshop']","Workshop Button");
        //click on In Person button using xpath text
        ReusableMethods.clickMethod(driver,"//*[text() = 'In-Person']","In-Person Button");
        //zipcode ArrayList
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11209");
        zipCode.add("11228");
        zipCode.add("11201");
        for (int i = 0; i < zipCode.size(); i++) {
            //define WebElement
            WebElement searchBar = driver.findElement(By.xpath("//*[@id ='location-search']"));
            searchBar.click();
            searchBar.clear();
            searchBar.sendKeys(zipCode.get(0));
        }//end of for loop
        // submit button
        ReusableMethods.submitMethod(driver, "//*[@class='ww button primary cta-DyoKt']", "Submit Button");
        //click on specific studio link
       // ReusableMethods.clickByIndex(driver,"//*[@class= 'wrapperLink-rmsRn']","Links Button");
        //print out address
        String address = ReusableMethods.captureText(driver,"//*[@class = 'address-FnT8k']", "Address Result" );
        //print out address in console
        System.out.println("Address is " + address);
        //define the javascriptexecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //scroll into the webelement
        ReusableMethods.scrollByView(driver,"//*[@class = 'title-UbUc9']","Scroll Button");
        //print out schedule
        String schedule = ReusableMethods.captureText(driver,"//*[@class='scheduleContainerMobile-ps6Rm']", "Schedule Result" );
        //print out schedule in console
        System.out.println(schedule);
        //quit the chrome browser
        driver.quit();
    }//end of main
}//end of class