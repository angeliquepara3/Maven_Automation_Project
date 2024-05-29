package PracticeFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReviewSession0425 {
    public static void main(String[] args) {
    //define web Driver
        ChromeOptions arguments=  new ChromeOptions();
        //add incognito options
        arguments.addArguments("incognito","start-maximized","headless");
        //define chrome driver
        WebDriver driver = new ChromeDriver(arguments);
        //navigate to Google.com
        driver.navigate().to("https://www.google.com/");
    }//end of main
}//end of class
