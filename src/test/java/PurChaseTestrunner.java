import org.testng.annotations.Test;
import pages.PurChase;

public class PurChaseTestrunner extends setup {
    PurChase objPurChase;
    Utils utils;
    @Test(enabled = true,priority = 1,description = "User One purchase")
    public void PurChase_for_User_One() throws Exception {
        driver.get("http://automationpractice.com");
        objPurChase = new PurChase(driver);
        utils =new Utils(driver);
        utils.readJSONArray(0 );
        String user=objPurChase.PurChase_for_User_One(utils.getEmail(), utils.getPassword());

    }

    @Test(enabled = true,priority = 2,description = "User Two purchase")
    public void PurChase_for_User_Two() throws Exception {
        driver.get("http://automationpractice.com");
        objPurChase = new PurChase(driver);
        utils =new Utils(driver);
        utils.readJSONArray(1 );
        String user=objPurChase.PurChase_for_User_One(utils.getEmail(), utils.getPassword());

    }

}
