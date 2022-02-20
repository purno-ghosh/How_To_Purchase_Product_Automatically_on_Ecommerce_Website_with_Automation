package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class createAccount {

    WebDriver driver;

    @FindBy(className="login")
    WebElement loginBtn;

    @FindBy(id="email_create")
    WebElement emailBtn;

    @FindBy(xpath = "//span[contains(.,'Create an account')]")
    WebElement crtACBtn;

    @FindBy(id = "id_gender1")
    WebElement TitleBtn;

    @FindBy(id = "customer_firstname")
    WebElement fstnameBtn;

    @FindBy(id = "customer_lastname")
    WebElement lstnameBtn;

    @FindBy(id = "passwd")
    WebElement passwdBtn;

    @FindBy(id = "days")
    WebElement daysBtn;

    @FindBy(id = "months")
    WebElement monthsBtn;

    @FindBy(id = "years")
    WebElement yearsBtn;

    @FindBy(id = "address1")
    WebElement address1Btn;

    @FindBy(id = "city")
    WebElement cityBtn;

    @FindBy(id = "id_state")
    WebElement stateBtn;

    @FindBy(id = "postcode")
    WebElement postcodeBtn;

    @FindBy(id = "phone_mobile")
    WebElement phone_mobileBtn;

    @FindBy(xpath = "//span[contains(.,'Register')]")
    WebElement RegisterBtn;

    @FindBy(className = "page-heading")
    WebElement pageheadingBtn;

    @FindBy(className = "logout")
    WebElement logoutBtn;

    @FindBy(id = "email")
    WebElement emaileBtn;

    @FindBy(id = "passwd")
    WebElement passwdBtn2;

    @FindBy(xpath = "//span[contains(.,'Sign in')]")
    WebElement singindBtn;
    @FindBy(xpath = "//h1[contains(.,'My account')]")
    WebElement AssertBtn;

    public createAccount(WebDriver driver){
    this.driver = driver;
    PageFactory pageFactory;
    PageFactory.initElements(driver, this);
}

public void create_user_one() throws Exception{
    loginBtn.click();
    emailBtn.sendKeys("bs23_atomation_user_One_4000@gamil.com");
    crtACBtn.click();
    Thread.sleep(3000);
    TitleBtn.click();
    fstnameBtn.sendKeys("User");
    lstnameBtn.sendKeys("One");
    passwdBtn.sendKeys("SQALOVER");
    daysBtn.sendKeys("12");
    monthsBtn.sendKeys("February ");
    yearsBtn.sendKeys("2000");
    address1Btn.sendKeys("savar");
    cityBtn.sendKeys("dhaka");
    stateBtn.sendKeys("Alabama");
    postcodeBtn.sendKeys("35242");
    phone_mobileBtn.sendKeys("01720542733");
    RegisterBtn.click();
    Thread.sleep(3000);
    logoutBtn.click();
    Thread.sleep(3000);
    emaileBtn.sendKeys("bs23_atomation_user_One_4000@gamil.com");
    passwdBtn2.sendKeys("SQALOVER");
    singindBtn.click();
    Thread.sleep(3000);
    Assert.assertEquals(AssertBtn.getText(),"MY ACCOUNT");
    logoutBtn.click();

}
    public void create_user_two() throws Exception{
        loginBtn.click();
        emailBtn.sendKeys("bs23_atomation_user_two_4000@gamil.com");
        crtACBtn.click();
        Thread.sleep(3000);
        TitleBtn.click();
        fstnameBtn.sendKeys("User");
        lstnameBtn.sendKeys("Two");
        passwdBtn.sendKeys("SQALOVER");
        daysBtn.sendKeys("12");
        monthsBtn.sendKeys("February ");
        yearsBtn.sendKeys("2000");
        address1Btn.sendKeys("savar");
        cityBtn.sendKeys("dhaka");
        stateBtn.sendKeys("Alabama");
        postcodeBtn.sendKeys("35242");
        phone_mobileBtn.sendKeys("01720542733");
        RegisterBtn.click();
        Thread.sleep(3000);
        logoutBtn.click();
        Thread.sleep(3000);
        emaileBtn.sendKeys("bs23_atomation_user_two_4000@gamil.com");
        passwdBtn2.sendKeys("SQALOVER");
        singindBtn.click();
        Thread.sleep(3000);
        Assert.assertEquals(AssertBtn.getText(),"MY ACCOUNT");
        Thread.sleep(3000);
        logoutBtn.click();

    }


}
