package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T3_Tabs {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.fideliscare.org");
        //wait few seconds for the browser session to load up
        Thread.sleep(3000);
        //click on shop for a plan
        driver.findElement(By.xpath("//*[text()='Shop For a Plan']")).click();
        //click on second shop for a plan again
        Thread.sleep(1500);
        driver.findElements(By.xpath("//*[text()='Shop for a Plan']")).get(0).click();
        Thread.sleep(2500);
        //click on find a doctor
        driver.findElement(By.xpath("//*[@href='/Find-A-Doctor']")).click();
        //store your tabs arraylist to switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the second tab
        driver.switchTo().window(tabs.get(1));
        //simply enter a zipcode on the search location field
        driver.findElement(By.xpath("//*[@id='searchLocation']")).sendKeys("11218");
        //wait
        Thread.sleep(2000);
        //switch to back to default/first tab
        driver.switchTo().window(tabs.get(0));
        //click on member tab
        driver.findElement(By.xpath("//*[text()='Member']")).click();
    }//end of class
}//end of main
