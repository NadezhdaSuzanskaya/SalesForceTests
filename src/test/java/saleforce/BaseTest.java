package saleforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import steps.AccountsSteps;
import steps.DetailAccountStep;
import steps.DetailContactStep;
import steps.MainSteps;
import utils.TestListner;

import java.time.Duration;
@Listeners({TestListner.class})
public class BaseTest{

    protected WebDriver driver;
    protected MainSteps mainSteps;
    protected AccountsSteps accountsSteps;
    protected DetailAccountStep detailaccountsSteps;
    protected DetailContactStep detailContactSteps;
    public static String USERNAME;
    public static String PASSWORD ;
    @BeforeSuite( groups = "smoke")
    @Parameters({"user","passcode"})
        public void setupParams()  // задаем параметры через командную строку
    {
        USERNAME = System.getProperty("username");
        System.out.println(USERNAME+"1111");
        PASSWORD = System.getProperty("passcode");
        System.out.println(PASSWORD+"22222");
    }

    @BeforeClass(groups = "smoke")
    public void setup(ITestContext iTestContext) {
      //    setupParams();// задаем параметры через командную строку
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--ignore-popup-blocking");
//        chromeOptions.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        setContextAttr(iTestContext,"driver", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        mainSteps = new MainSteps(driver);
        accountsSteps = new AccountsSteps(driver);
        detailaccountsSteps = new DetailAccountStep(driver);
        detailContactSteps = new DetailContactStep(driver);
    }

    private void setContextAttr (ITestContext iTestContext, String attrKey, Object attrValue)
    {iTestContext.setAttribute(attrKey, attrValue);}

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
