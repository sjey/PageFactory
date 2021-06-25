import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeTest
    public void setup()
    {
        Initialize();
        loginPage = new LoginPage();
    }

    /* @Test
    public void TestRegister() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sjey/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");

        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        WebElement gender = driver.findElement(By.name("Gender"));
        gender.click();
        driver.findElement(By.id("FirstName")).sendKeys("Jeyakumar");
        driver.findElement(By.id("LastName")).sendKeys("Soundararaj");
        driver.findElement(By.id("Email")).sendKeys("anusha@test123.com");
        driver.findElement(By.id("Password")).sendKeys("P@ssw0rd123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd123");
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(6000);
        driver.quit();
    } */

    @Test
    public void TestLogin() {
        homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
        Assert.assertEquals(properties.getProperty("username"), loginPage.validateUserlogin());
    }

    @Test
    public void TestLogout() {
        homePage = loginPage.logOut();
        Assert.assertEquals(homePage.verifyTitle(), "Demo Web Shop");
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
