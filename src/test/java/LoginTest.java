import com.Base.BaseClass;
import com.package1.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.TestUtil;

public class LoginTest extends BaseClass {
    LoginPage loginPage;

    @BeforeMethod
   public void setup(){
        BaseClas1();
        loginPage=new LoginPage();
    }

 /*   @Test
    public void Login_page_titlepage(){
      String title=  lo
      ginPage.validate_tile();
        Assert.assertEquals(title,"NGK Farrier Supplies");
    }
@Test
public void comlogo(){
   boolean flag=loginPage.validimage();
    Assert.assertTrue(flag);
    }

  */
    @Test(priority = 1)
    public void loginclick(){
        loginPage.lognclick();
    }
    @Test(priority = 2)
    public void login1(){
        loginPage.loin(TestUtil.un,TestUtil.pass);
        loginPage.SubmitClick();
    }

    @AfterMethod
    public void teamdowm(){
        driver.close();
    }
}
