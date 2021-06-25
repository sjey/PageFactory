package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
    WebElement loginBtn;

    @FindBy(xpath = "//a[contains(text(),'anusha@test123.com')]")
    WebElement userNameafterLogin;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutBtn;

    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String user, String pass)
    {
        loginLink.click();
        email.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
        return new HomePage();
    }

    public String validateUserlogin()
    {
        return userNameafterLogin.getText();
    }

    public HomePage logOut()
    {
        logoutBtn.click();
        return new HomePage();
    }
}
