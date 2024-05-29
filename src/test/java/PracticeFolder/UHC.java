package PracticeFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UHC {
    public static void main(String[] args) throws InterruptedException {
        //define the WebDriver
        WebDriver driver = new ChromeDriver();
        //Navigate to United Health Care Website
        driver.navigate().to("https://www.google.com");
        //Full Screen the page
        driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Brooklyn");

        driver.findElement(By.xpath("//*[@name='btnK']")).click();

        String message = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println(message);
        //wait time
        Thread.sleep(3000);
        driver.close();
    }//end of main
}//end of class
