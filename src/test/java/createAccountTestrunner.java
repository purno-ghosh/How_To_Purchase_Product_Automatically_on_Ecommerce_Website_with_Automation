import org.testng.annotations.Test;
import pages.createAccount;

public class createAccountTestrunner extends setup {
    createAccount objcreateAccount;

    @Test(enabled = true,priority = 1)
    public void create_user_one() throws Exception{
        driver.get("http://automationpractice.com");
        objcreateAccount = new createAccount(driver);
        objcreateAccount.create_user_one();


    }

    @Test(enabled = true,priority = 2)
    public void create_user_two() throws Exception{
        driver.get("http://automationpractice.com");
        objcreateAccount = new createAccount(driver);
        objcreateAccount.create_user_two();

    }
}
