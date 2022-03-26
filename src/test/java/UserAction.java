import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.Browser.CHROME;

public class UserAction {

    DesiredCapabilities cap = new DesiredCapabilities();

    RemoteWebDriver driver;

    {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createUserAccount(){
        cap.setBrowserName(String.valueOf(CHROME));
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
