package ActionItem4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class ActionItemCase {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized","incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to Weight Watchers website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //wait for 2 seconds
            Thread.sleep(2000);
            //click on the Find a Workshop button in the top right hand corner using xpath text
            driver.findElement(By.xpath("//*[text() = 'Find a Workshop']")).click();
            //click on In Person button using xpath text
            driver.findElement(By.xpath("//*[text() = 'In-Person']")).click();
            //wait for 2 seconds
            Thread.sleep(2000);



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



        driver.findElement(By.xpath("//*[@class='ww button primary cta-DyoKt']")).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //click on specific studio link
        ArrayList<WebElement> links = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@class= 'wrapperLink-rmsRn']"));
        links.get(0).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //print out address
        String address = driver.findElement(By.xpath("//*[@class = 'address-FnT8k']")).getText();
        //print out address in console
        System.out.println("Address is " + address);
        //define the javascriptexecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //scroll into the webelement
        WebElement studioWorkshop = driver.findElement(By.xpath("//*[@class = 'title-UbUc9']"));
        //print out schedule
        String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-ps6Rm']")).getText();
        //print out schedule in console
        System.out.println(schedule);
        //wait for 2 seconds
        Thread.sleep(2000);
        //quit browser
        driver.quit();
    }//end of main
}//end of class
