package ActionItem3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1_and_2 {
    public static void main(String[] args) throws InterruptedException {
        //define webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to bing.com
        driver.navigate().to("https://www.bing.com");
        //pause the code for 2 seconds
        Thread.sleep(2000);
        //type cars in the search box
        driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");
        //press enter
        driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();
        //pause the code for 3 seconds
        Thread.sleep(3000);
        //capture search results into a string variable
        String searchResultVariable = driver.findElement(By.xpath("//*[@id = 'b_tween']")).getText();
        System.out.println("Search number for cars is  " + searchResultVariable);
        //click on more
        driver.findElement(By.xpath("//*[@id = 'b-scopeListItem-menu']")).click();
        //click on MYBING
        driver.findElement(By.xpath("//*[@id = 'b-scopeListItem-bingpages']")).click();
        //pause the code for 3 seconds
        Thread.sleep(3000);
        //capture profile section message
        String profileMessage = driver.findElement(By.xpath("//*[@class = 'myprofile-see-profile']")).getText();
        String[] profileMessageArray = profileMessage.split("");
        System.out.println(profileMessageArray[0]);
        //quit the chrome browser
        driver.quit();
    }//end of main
}//end of class
