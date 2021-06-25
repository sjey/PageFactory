package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties;

    public BaseTest() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void Initialize()
    {
        String browser = properties.getProperty("browser");
        if ( browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/sjey/Downloads/chromedriver");
            driver = new ChromeDriver();
        }
        driver.get(properties.getProperty("url"));
    }

}
