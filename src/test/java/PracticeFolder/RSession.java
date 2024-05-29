package PracticeFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RSession {
    public static void main(String[] args) {
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //declare incognito options
        options.addArguments("incognito");
        //define webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to website
        driver.navigate().to("https://www.uhc.com/");
        //click on search bar
        // driver.findElement(By.xpath("//*[@name = 'search']")).click();
        //clear search bar
        // driver.findElement(By.xpath("//*[@name ='search']")).clear();
        //type doctor in search bar
        // driver.findElement(By.xpath("//*[@name = 'search']")).sendKeys("doctor");
        //define web element
        WebElement searchBar = driver.findElement(By.xpath("//*[@name ='search']"));
        searchBar.click();
        searchBar.clear();
        searchBar.sendKeys("Doctor");
    }//end of main
}//end of class
