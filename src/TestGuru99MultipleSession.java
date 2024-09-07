package kitty;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
public class TestGuru99MultipleSession {
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
        System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	 System.setProperty("webdriver.gecko.driver","./WebDrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        DesiredCapabilities dc= new DesiredCapabilities();
        
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
        System.setProperty("webdriver.gecko.driver","./WebDrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        
        }        
}