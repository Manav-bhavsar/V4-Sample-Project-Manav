package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.testBaseClass;

public class homePageObjects extends testBaseClass {

    @FindBy(id = "form-email")
    WebElement loginEmail;

    @FindBy(id = "form-password")
    WebElement loginPassword;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement loginButton;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement userModule;

    @FindBy(xpath = "//button[@class='btn round ng-star-inserted']//img[@alt='button image']")
    WebElement createUserButton;

    @FindBy(xpath = "//body/app-custom-overlay/div[@class='overlay']/div[@class='user-creation ng-tns-c140-3 ng-star-inserted']/div[@class='user-creation-wizard ng-tns-c140-3 ng-star-inserted']/app-wizard-create-select[@class='ng-tns-c140-3']/div[@class='card-layout slide-from-bottom ng-star-inserted']/div[1]")
    WebElement adminUserOption;

    @FindBy(xpath = "//div[@class='user-container ng-tns-c140-3 ng-star-inserted']//div[@class='form-wrapper ng-untouched ng-pristine ng-invalid ng-star-inserted']//div[1]//div[2]//app-input[1]//div[1]//input[1]")
    WebElement fullName;

    @FindBy(xpath = "//div[@class='contact-info-form mx-auto']//div[@class='form-wrapper__form-fields']//input[@id='null']")
    WebElement phoneNumber;

    @FindBy(xpath = "//div[@class='contact-info-form mx-auto']//app-input[@class='ng-untouched ng-pristine ng-invalid']//input[@id='null']")
    WebElement adminEmailAddress;

    @FindBy(xpath = "//app-input[@formcontrolname='passwordC']//input[@id='null']")
    WebElement adminPassword;

    @FindBy(xpath = "//app-input[@class='ng-untouched ng-pristine ng-invalid']//input[@id='null']")
    WebElement confirmAdminPassword;

    @FindBy(xpath = "/html[1]/body[1]/app-custom-overlay[1]/div[1]/div[1]/div[1]/i[1]")
    WebElement backToWork;

    @FindBy(xpath = "//div[@class='card__title'][normalize-space()='Client']")
    WebElement clientUserOption;

    @FindBy(xpath = "//span[normalize-space()='Client is not a student.']")
    WebElement clientIsNotAStudent;

    @FindBy(xpath = "//app-input[@formcontrolname='businessC']//input[@id='null']")
    WebElement businessName;

    @FindBy(xpath = "//app-input[@class='ng-untouched ng-pristine ng-invalid']//input[@id='null']")
    WebElement titleName;

    @FindBy(xpath = "//div[@class='client-page__client-wrapper height-100']//div[@class='form-wrapper__form-fields']//input[@id='null']")
    WebElement clientPhoneNumber;


    @FindBy(xpath = "//div[@class='form-wrapper ng-touched ng-dirty ng-invalid ng-star-inserted']//div[@class='form-group']//input[@id='null']")
    WebElement clientEmailAddress;

    @FindBy(xpath = "//body/app-custom-overlay[1]/div[1]/div[1]/div[2]/app-wizard-create-select[1]/div[1]/div[3]")
    WebElement printerUserOption;

    @FindBy(xpath = "//app-input[@formcontrolname='companyNameC']//input[@id='null']")
    WebElement printerCompany;

    @FindBy(xpath = "//div[@class='form-wrapper ng-touched ng-dirty ng-invalid ng-star-inserted']//div[@class='form-wrapper__form-fields']//input[@id='null']")
    WebElement printerPhoneNumber;

    @FindBy(xpath = "//app-input[@class='ng-untouched ng-pristine ng-invalid']//input[@id='null']")
    WebElement printerShippingName;

    @FindBy(xpath = "//div[@class='form-wrapper__form-fields address-form__field ng-star-inserted']//input[@id='null']")
    WebElement printerStreetName;

    @FindBy(xpath = "//app-input[@formcontrolname='cityC']//input[@id='null']")
    WebElement printerCityName;

    @FindBy(xpath = "//app-input[@formcontrolname='zipCodeC']//input[@id='null']")
    WebElement printerZipCode;

    @FindBy(xpath = "//div[normalize-space()='EST']")
    WebElement printerTimeZone;

    @FindBy(xpath = "//button[@class='btn gradient-purple-bliss ng-star-inserted']//span[contains(text(),'Create Account')]")
    WebElement printerCreateAccountButton;

    @FindBy(xpath = "//button[normalize-space()='Yes']")
    WebElement overrideUPS;

    @FindBy(xpath = "//div[@class='form-wrapper ng-touched ng-dirty ng-invalid ng-star-inserted']//div[@class='form-wrapper__form-fields ng-star-inserted']//input[@id='null']")
    WebElement printerEmailAddress;

    @FindBy(xpath = "//div[@class='card__title'][normalize-space()='Fulfillment Center']")
    WebElement fcUserOption;

    @FindBy(xpath = "//div[@class='card__title'][normalize-space()='Campus Manager']")
    WebElement cmUserOption;

    @FindBy(xpath = "//div[@class='contact-info-form mx-auto ng-star-inserted']//button[@type='button']")
    WebElement cmSetPasswordButton;

    @FindBy(xpath = "//div[@class='card__title'][normalize-space()='FP Team']")
    WebElement fpTeamUserOption;

    @FindBy(xpath = "//span[normalize-space()='Set Email & Password']")
    WebElement fpUserSetEmailAndPassword;

    @FindBy(xpath = "//button[@class='btn gradient-purple-bliss ng-star-inserted']//span[contains(text(),'Create Account')]")
    WebElement fpUserCreateAccountButton;

    @FindBy(xpath = "//app-contact-info[@id='contact-fields']//div[@class='form-wrapper__form-fields']//input[@id='null']")
    WebElement fpTeamPhoneNumber;

    @FindBy(xpath = "//div[@class='form-wrapper ng-touched ng-dirty ng-invalid ng-star-inserted']//div[@class='form-wrapper__form-fields ng-star-inserted']//input[@id='null']")
    WebElement fcUserEmailAddress;

    @FindBy(xpath = "//div[@class='form-wrapper ng-touched ng-dirty ng-invalid ng-star-inserted']//div[@class='form-group']//input[@id='null']")
    WebElement fpTeamEmailAddress;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer customer-pill']")
    WebElement clientUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer printer-pill']")
    WebElement printerUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer fulfillment-pill']")
    WebElement fcUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer manager-pill']")
    WebElement cmUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer admin-pill']")
    WebElement adminUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer fpteam-pill']")
    WebElement fpTeamUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer inactive-pill']")
    WebElement inactiveUserPill;

    @FindBy(xpath = "//div[@class='tabs__tab cursor-pointer all-users']")
    WebElement allActiveUserPill;

    @FindBy(xpath = "//div[@class='navbar__proof']")
    WebElement requestProofButton;

    @FindBy(xpath = "//div[@class='navbar__order']")
    WebElement requestOrderButton;

    @FindBy(xpath = "//span[@id='userdropdown-info']")
    WebElement profileDropdown;

    @FindBy(xpath = "//*[@id=\"userDropdownMenu\"]/a/div")
    WebElement logoutButton;

    @FindBy(xpath = "//i[@class='ft-x']")
    WebElement cancelRequestButton;


    public homePageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void login(String emailAddressAttribute, String passwordAttribute){

        loginEmail.sendKeys(emailAddressAttribute);
        loginPassword.sendKeys(passwordAttribute);
        loginButton.click();
        userModule.click();
    }

    public void createNewAdminUser(String fullNameAttribute, String phoneNumberAttribute, String emailAddressAttribute, String passwordAttribute) throws InterruptedException {
        createUserButton.click();
        adminUserOption.click();
        fullName.sendKeys(fullNameAttribute);
        phoneNumber.sendKeys(phoneNumberAttribute);
        adminEmailAddress.sendKeys(emailAddressAttribute, Keys.ENTER);
        adminPassword.sendKeys(passwordAttribute);
        confirmAdminPassword.sendKeys(passwordAttribute, Keys.ENTER);
        Thread.sleep(7000);
        backToWork.click();

    }

    public void createNewClientUser(String fullNameAttribute, String phoneNumberAttribute, String emailAddressAttribute, String passwordAttribute, String businessNameAttribute, String titleNameAttribute) throws InterruptedException {
        createUserButton.click();
        clientUserOption.click();
        fullName.sendKeys(fullNameAttribute);
        clientPhoneNumber.sendKeys(phoneNumberAttribute, Keys.ENTER);
        clientEmailAddress.sendKeys(emailAddressAttribute);
        adminPassword.sendKeys(passwordAttribute);
        confirmAdminPassword.sendKeys(passwordAttribute, Keys.ENTER);
        clientIsNotAStudent.click();
        businessName.sendKeys(businessNameAttribute);
        titleName.sendKeys(titleNameAttribute, Keys.ENTER);
        Thread.sleep(7000);
        backToWork.click();
    }

    public void createNewPrinterUser(String fullNameAttribute, String companyNameAttribute, String phoneNumberAttribute, String emailAddressAttribute, String passwordAttribute) throws InterruptedException{
        createUserButton.click();
        printerUserOption.click();
        fullName.sendKeys(fullNameAttribute);
        printerCompany.sendKeys(companyNameAttribute, Keys.ENTER);
        printerPhoneNumber.sendKeys(phoneNumberAttribute);
        printerEmailAddress.sendKeys(emailAddressAttribute, Keys.ENTER);
        adminPassword.sendKeys(passwordAttribute);
        confirmAdminPassword.sendKeys(passwordAttribute, Keys.ENTER);
        printerShippingName.sendKeys("shippingName", Keys.ENTER);
        printerStreetName.sendKeys("streetName");
        printerCityName.sendKeys("cityName", Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
        printerZipCode.sendKeys("55555");
        printerTimeZone.click();
        printerCreateAccountButton.click();
        overrideUPS.click();
        Thread.sleep(7000);
        backToWork.click();
    }

    public void createNewFcUser(String fullNameAttribute, String companyNameAttribute, String phoneNumberAttribute, String emailAddressAttribute, String passwordAttribute) throws InterruptedException{
        createUserButton.click();
        fcUserOption.click();
        fullName.sendKeys(fullNameAttribute);
        printerCompany.sendKeys(companyNameAttribute, Keys.ENTER);
        printerPhoneNumber.sendKeys(phoneNumberAttribute);
        fcUserEmailAddress.sendKeys(emailAddressAttribute, Keys.ENTER);
        adminPassword.sendKeys(passwordAttribute);
        confirmAdminPassword.sendKeys(passwordAttribute, Keys.ENTER);
        printerShippingName.sendKeys("shippingName", Keys.ENTER);
        printerStreetName.sendKeys("streetName");
        printerCityName.sendKeys("cityName", Keys.TAB, Keys.ARROW_DOWN, Keys.ENTER);
        printerZipCode.sendKeys("55555");
        printerTimeZone.click();
        printerCreateAccountButton.click();
        overrideUPS.click();
        Thread.sleep(7000);
        backToWork.click();
    }

//    public void createNewCmUser() throws InterruptedException{
//        createUserButton.click();
//        cmUserOption.click();
//        fullName.sendKeys("firstName lastName");
//        phoneNumber.sendKeys("9876543210");
//        adminEmailAddress.sendKeys("cm@user.create", Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//        cmSetPasswordButton.click();
//        adminPassword.sendKeys("userPassword");
//        confirmAdminPassword.sendKeys("userPassword", Keys.ENTER);
//
//    }

    public void createNewFpTeamUser(String fullNameAttribute, String phoneNumberAttribute, String emailAddressAttribute, String passwordAttribute) throws InterruptedException{
        createUserButton.click();
        fpTeamUserOption.click();
        fullName.sendKeys(fullNameAttribute);
        fpTeamPhoneNumber.sendKeys(phoneNumberAttribute, Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        fpUserSetEmailAndPassword.click();
        fpTeamEmailAddress.sendKeys(emailAddressAttribute);
        adminPassword.sendKeys(passwordAttribute);
        confirmAdminPassword.sendKeys(passwordAttribute, Keys.ENTER);
        fpUserCreateAccountButton.click();
        Thread.sleep(7000);
        backToWork.click();
    }

    public void checkUserPills(){
        clientUserPill.click();
        printerUserPill.click();
        fcUserPill.click();
        cmUserPill.click();
        adminUserPill.click();
        fpTeamUserPill.click();
        inactiveUserPill.click();
        allActiveUserPill.click();
    }
//
    public  void proofRequest() throws InterruptedException {
        requestProofButton.click();
        Thread.sleep(5000);
        cancelRequestButton.click();
    }

    public void orderRequest() throws InterruptedException{
        requestOrderButton.click();
        Thread.sleep(5000);
        cancelRequestButton.click();
    }

    public void logout(){
        profileDropdown.click();
        logoutButton.click();
    }






}
