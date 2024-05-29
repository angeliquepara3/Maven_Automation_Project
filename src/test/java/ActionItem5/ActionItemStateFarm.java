package ActionItem5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ActionItemStateFarm {
    public static void main(String[] args) throws InterruptedException {
//declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.statefarm.com/");
        //wait few seconds for the browser session to load up
        Thread.sleep(3000);

        //click on Get a Quote
        try{
            driver.findElement(By.xpath("//*[text()='Get a Quote']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on Get a Quote: " + e);

        }//end of get a quote options exception

        //select dropdown as homeowner
        try{
            WebElement homeOwners = driver.findElement(By.xpath("//*[@id='product-select1']"));
            Select dropdown = new Select(homeOwners);
            dropdown.selectByVisibleText("Homeowners");
        }catch (Exception e){
            System.out.println("Unable to select Homeowners " + e);
        }//end of dropdown

        //enter zipcode exception
        try{
            driver.findElement(By.xpath("//*[@id='quote-main-zip-code-input1']")).sendKeys("11209");
        }catch (Exception e){
            System.out.println("Unable to enter zip code " + e);
        }//end of zip code exception

        //click on Start a Quote exception
        try{
            driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on Start a Quote: " + e);

        }//end of get start a quote exception


        //wait few seconds for the browser session to load up
        Thread.sleep(3000);

        //enter policy start date exception
        try{
            WebElement pStart = driver.findElement(By.xpath("//*[@name='effectiveDate.effectiveDate']"));
            pStart.clear();
            pStart.sendKeys("05/05/2024");
        }catch (Exception e){
            System.out.println("Unable to enter policy start date " + e);
        }//end of policy start date exception

        //wait few seconds for the browser session to load up
        Thread.sleep(3000);

        //enter first name exception
        try{
            driver.findElement(By.xpath("//*[@name='primaryApplicant.client.firstName']")).sendKeys("Angelique");
        }catch (Exception e){
            System.out.println("Unable to enter first name: " + e);
        }//end of first name exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //enter last name exception
        try{
            driver.findElement(By.xpath("//*[@name='primaryApplicant.client.lastName']")).sendKeys("Paravalos");
        }catch (Exception e){
            System.out.println("Unable to enter last name: " + e);
        }//end of last name exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //enter street address exception
        try{
            driver.findElement(By.xpath("//*[@name='riskLocationAddress.street']")).sendKeys("528 74th Street");
        }catch (Exception e){
            System.out.println("Unable to enter street address: " + e);
        }//end of street address exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //enter date of birth exception
        try{
            driver.findElement(By.xpath("//*[@name='primaryApplicant.client.dateOfBirth']")).sendKeys("03/03/2001");
        }catch (Exception e){
            System.out.println("Unable to enter date of birth: " + e);
        }//end of date of birth exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //define the javascriptexecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,1500)");

        //click on Continue exception
        try{
            driver.findElement(By.xpath("//*[@name='continue']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click on continue button: " + e);
        }//end of continue exception

        //click on 2nd Continue exception
        try{
            driver.findElement(By.xpath("//*[@name='continue']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click on 2nd continue button: " + e);
        }//end of 2nd continue exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //select from dropdown exception
        try{
            WebElement fireProtection = driver.findElement(By.xpath("//*[@id='fireProtectionAreaNameSelectId']"));
            Select dropdown = new Select(fireProtection);
            dropdown.selectByVisibleText("BROOKLYN");
        }catch (Exception e){
            System.out.println("Unable to select from dropdown " + e);
        }//end of drop down exception

        //wait few seconds for the browser session to load up
        Thread.sleep(1500);

        //click on 2nd Continue exception
        try{
            driver.findElement(By.xpath("//*[@name='continue']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click on 2nd continue button: " + e);
        }//end of 2nd continue exception

        //print out email info message
        String emailText = driver.findElement(By.xpath("//*[@id='emailAddress']")).getText();
        //print out email info message in console
        System.out.println(emailText);

        //click on Add Applicant exception
        try{
            driver.findElement(By.xpath("//*[@id='addApplicantModuleNewAdd']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click add applicant button: " + e);
        }//end of Add Applicant  exception

        //enter new applicants first name exception
        try{
            driver.findElement(By.xpath("//*[@name='additionalApplicants[1].client.firstName']")).sendKeys("Aris");
        }catch (Exception e){
            System.out.println("Unable to enter new applicants first name: " + e);
        }//end of new applicants first name exception

        //enter new applicants last name exception
        try{
            driver.findElement(By.xpath("//*[@name='additionalApplicants[1].client.lastName']")).sendKeys("Papa");
        }catch (Exception e){
            System.out.println("Unable to enter new applicants last name: " + e);
        }//end of new applicants last name exception

        //click on Continue exception
        try{
            driver.findElement(By.xpath("//*[@name='continue']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click on continue button: " + e);
        }//end of continue exception

        //print out email info message
        String errorMessage = driver.findElement(By.xpath("//*[@class='span12']")).getText();
        //print out email info message in console
        System.out.println(errorMessage);

    }//end of main
}//end of class
