package ActionItemTestCases;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import org.testng.annotations.Test;

public class FidelisCareTestCases extends TestParent {

    @Test(priority = 1)
    public void medicareSearch() throws InterruptedException {
        driver.navigate().to("https://www.fideliscare.org/");
        //Click plan details button on Medicare Advantage Plans - Signature (PPO)
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@id='root-3']","Shop Button");
        Thread.sleep(1500);
        //click on Medicaid button
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = 'Medicaid Managed Care']","Medicaid Button");
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = 'Medicaid FAQ']","Medicaid FAQ Button");
        Thread.sleep(1500);
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = '1. What Is NY Medicaid?']","Medicaid Explanation Button");
        Thread.sleep(1500);
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = '4. How Much is Medicaid in New York']","Medicaid NY Button");
        Thread.sleep(1500);

    }//end of main

    @Test(dependsOnMethods = "medicareSearch")
    public void medicaidAdvantage() throws InterruptedException {
        //Click plan details button on Medicare Advantage Plans - Signature (PPO)
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@id='root-3']","Shop Button");
        Thread.sleep(1500);
        //click on Medicaid button
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = 'Medicaid Managed Care']","Medicaid Button");
        Thread.sleep(1500);

        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = 'Medicaid Advantage Plus (MAP)']","Medicade Advantage Button");
        Thread.sleep(3000);
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@class='btn btn-primary btn-external link-external']","Contact Button");
        Thread.sleep(1500);

    }//end of main

    @Test(dependsOnMethods = "medicaidAdvantage")
    public void contactInfo() throws InterruptedException {
        //Click plan details button on Medicare Advantage Plans - Signature (PPO)
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id='firstName']", "Angelique", "First Name Field");
        Thread.sleep(1500);
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id='lastName']", "Paravalos", "Last Name Field");
        Thread.sleep(1500);
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id='zipCode']", "11209", "ZipCode Field");
         Thread.sleep(1500);
         ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@id = 'county']","County Button");
         Thread.sleep(1500);
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id='phoneNumber']", "7182384486", "Phone Number Field");
        Thread.sleep(1500);
        ReusableMethods_Loggers.sendKeysMethod(driver, logger, "//*[@id='email']", "angeliquepara3@gmail.com", "Email Field");
        Thread.sleep(1500);
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[@id = 'contactMe']","Contact Button");
        Thread.sleep(1500);
        ReusableMethods_Loggers.clickMethod(driver,logger,"//*[text() = 'Contact Me']","Contact Me Button");
        Thread.sleep(1500);

    }//end of main
}//end of class