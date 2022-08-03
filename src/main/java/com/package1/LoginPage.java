package com.package1;

import com.Base.BaseClass;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.TestUtil;

import javax.naming.Name;

public class LoginPage extends BaseClass {

    //page Factory

    @FindBy(xpath="//input[@name=\"email\"]")
    WebElement username;

    @FindBy(xpath ="//input[@name=\"password\"]")
WebElement Password;

    @FindBy(id="login_submit")
    WebElement Login_submit;

    @FindBy(xpath = "//a[@href=\"#\"]")
    WebElement LoginButton;

    @FindBy(xpath = "//a[text()=\" Register Now!\"]")
    WebElement Registor;

    @FindBy(xpath = "//img[@class=\"pb-2 pr-4\"]")
    WebElement websitename;


    //initializing the page object

    public void loginpage(){
        PageFactory.initElements(driver ,this);
    }
public String validate_tile(){
    return driver.getTitle();

}
    public boolean validimage(){
      return   websitename.isDisplayed();
    }

    public void lognclick(){
        LoginButton.click();
    }
    public void SubmitClick(){
        Login_submit.click();
    }

    public HomePage loin(String un , String pss){

        username.sendKeys(TestUtil.un);
    Password.sendKeys(TestUtil.pass);
        Login_submit.click();
    return new  HomePage();
    }


}
