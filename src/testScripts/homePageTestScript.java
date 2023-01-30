package testScripts;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.homePageObjects;
import testBase.testBaseClass;

public class homePageTestScript extends testBaseClass {

    homePageObjects page = null;
    @BeforeTest
    public void setup(){
        setupWebDriverForTesting(driver);
        launch();
        page = new homePageObjects(driver);
    }

    @Test(priority=1)
    public void checkLogin(){
        page.login("interns2022@freshprints.com", "interns2022");
    }

    @Test(priority=2)
    public void createNewAdminUserFlow() throws InterruptedException {
        page.createNewAdminUser("firstName lastName", "9876543210", "admin27@create.user", "userPassword");
    }

    @Test(priority=3)
    public void createNewClientUserFlow() throws InterruptedException{
        page.createNewClientUser("firstName lastName", "9876543210", "client27@create.user", "userPassword", "businessName", "titleName");
    }

    @Test(priority=4)
    public void createNewPrinterUserFlow() throws InterruptedException{
        page.createNewPrinterUser("firstName lastName", "companyName", "9876543210", "printer24@create.user", "userPassword");
    }

    @Test(priority=5)
    public void createNewFcUserFlow() throws InterruptedException{
        page.createNewFcUser("firstName lastName", "companyName", "9876543210", "fc25@create.user", "userPassword");
    }

    @Test(priority=6)
    public void createNewFpTeamUserFlow() throws InterruptedException{
        page.createNewFpTeamUser("firstName lastName", "9876543210", "fpteam23@create.user", "userPassword");
    }

    @Test(priority=7)
    public void checkUserPillsAreWorking(){
        page.checkUserPills();
    }

    @Test(priority=8)
    public void checkAddProofRequestButton() throws InterruptedException {
        page.proofRequest();
    }

    @Test(priority = 9)
    public void checkAddOrderRequestButton() throws InterruptedException{
        page.orderRequest();
    }

    @Test(priority=10)
    public void checkLogoutFunctionality(){
        page.logout();
    }

}
