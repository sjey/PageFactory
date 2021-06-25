package pages;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

        public HomePage()
        {
            PageFactory.initElements(driver, this);
        }

        public String verifyTitle()
        {
            return driver.getTitle();
        }

}
