package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PurChase {

    WebDriver driver;
    @FindBy(className="login")
    WebElement linkLogin;
    @FindBy(id="email")
    WebElement TextEmail;
    @FindBy(id="passwd")
    WebElement TextPass;
    @FindBy(xpath="//span[contains(.,'Sign in')]")
    WebElement singIn;
    @FindBy(xpath = "(//a[contains(@title,'Dresses')])[5]")
    WebElement Drsbtm;
    @FindBy(xpath = "(//a[contains(.,'Casual Dresses')])[3]")
    WebElement casualDrsbtm;
    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
    WebElement casualDrsclick;
    @FindBy(xpath = "//span[contains(.,'Add to cart')]")
    WebElement Addcartbtm;
    @FindBy(xpath = "//h2[contains(.,'Product successfully added to your shopping cart')]")
    WebElement Assertaaddcartbtm;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement clswintbtm;
    @FindBy(xpath = "(//a[contains(@title,'T-shirts')])[2]")
    WebElement tshirtbtm;
    @FindBy(id = "layered_id_attribute_group_14")
    WebElement blueclrbtm;
    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")
    WebElement bluedrs;
    @FindBy(id = "color_14")
    WebElement colorbtmselect;
    @FindBy(xpath = "//span[contains(.,'Add to cart')]")
    WebElement bluecoloradd;
    @FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
    WebElement proceedceckOne;
    @FindBy(xpath = "(//span[contains(.,'Proceed to checkout')])[2]")
    WebElement proceedceckTwo;
    @FindBy(xpath = "(//span[contains(.,'Proceed to checkout')])[2]")
    WebElement proceedceckThree;
    @FindBy(id = "cgv")
    WebElement TermsService;
    @FindBy(xpath = "(//span[contains(.,'Proceed to checkout')])[2]")
    WebElement proceedceckfour;
    @FindBy(xpath = "(//span[contains(.,'(order processing will be longer)')])[2]")
    WebElement chkbtm;
    @FindBy(xpath = "//strong[@class='dark'][contains(.,'You have chosen to pay by check. Here is a short summary of your order:')]")
    WebElement assertchkbtm;
    @FindBy(className = "logout")
    WebElement logoutbtmexit;

    public PurChase(WebDriver driver){
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String PurChase_for_User_One (String email, String password ) throws InterruptedException {
        linkLogin.click();
        TextEmail.sendKeys(email);
        TextPass.sendKeys(password);
        singIn.click();
        Thread.sleep(2000);
        Drsbtm.click();
        Thread.sleep(5000);
        casualDrsbtm.click();
        Thread.sleep(5000);
        casualDrsclick.click();
        Addcartbtm.click();
        Thread.sleep(5000);
        Assert.assertEquals(Assertaaddcartbtm.getText(),"Product successfully added to your shopping cart");
        clswintbtm.click();

        tshirtbtm.click();
        Thread.sleep(4000);
        blueclrbtm.click();
        Thread.sleep(4000);
        bluedrs.click();
        Thread.sleep(4000);
        colorbtmselect.click();
        bluecoloradd.click();
        proceedceckOne.click();
        proceedceckTwo.click();
        proceedceckThree.click();
        Thread.sleep(4000);
        TermsService.click();
        proceedceckfour.click();
        chkbtm.click();
        Thread.sleep(4000);
        Assert.assertEquals(assertchkbtm.getText(),"You have chosen to pay by check. Here is a short summary of your order:");
        Thread.sleep(4000);
        logoutbtmexit.click();
        return email;
    }
    public String PurChase_for_User_Two (String email, String password ) throws InterruptedException {
        linkLogin.click();
        TextEmail.sendKeys(email);
        TextPass.sendKeys(password);
        singIn.click();
        Thread.sleep(2000);
        Drsbtm.click();
        Thread.sleep(5000);
        casualDrsbtm.click();
        Thread.sleep(5000);
        casualDrsclick.click();
        Addcartbtm.click();
        Thread.sleep(5000);
        Assert.assertEquals(Assertaaddcartbtm.getText(),"Product successfully added to your shopping cart");
        clswintbtm.click();

        tshirtbtm.click();
        Thread.sleep(4000);
        blueclrbtm.click();
        Thread.sleep(4000);
        bluedrs.click();
        Thread.sleep(4000);
        colorbtmselect.click();
        bluecoloradd.click();
        proceedceckOne.click();
        proceedceckTwo.click();
        proceedceckThree.click();
        Thread.sleep(4000);
        TermsService.click();
        proceedceckfour.click();
        chkbtm.click();
        Thread.sleep(4000);
        Assert.assertEquals(assertchkbtm.getText(),"You have chosen to pay by check. Here is a short summary of your order:");
        Thread.sleep(4000);
        logoutbtmexit.click();
        return email;
    }
}
