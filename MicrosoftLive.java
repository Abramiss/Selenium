import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

public class MicrosoftLive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Microsoft\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        // launch Chrome and redirect it to the Base URL
        try {
            driver.get("https://outlook.live.com/owa/");
            //Maximizes the browser window
            driver.manage().window().maximize();
            WebElement ZalogujButton = driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
            ZalogujButton.click();
            WebElement sendLogin = driver.findElement(By.id("i0116"));
            sendLogin.clear();
            sendLogin.sendKeys("SparkBrighterThinking@outlook.com");
            WebElement dalejButton = driver.findElement(By.id("idSIButton9"));
            dalejButton.click();

            WebElement sendPassword = driver.findElement(By.id("i0118"));
            sendPassword.clear();
            sendPassword.sendKeys("Spark12w");
            sleep(2000L);
            WebElement dalejButtonPassword = driver.findElement(By.id("idSIButton9"));
            dalejButtonPassword.click();

            WebElement logoutButtonFromMenu = driver.findElement(By.className("_14ggU2yZvNol5U91gfmYQA"));
            logoutButtonFromMenu.click();
            WebElement logauyButton = driver.findElement(By.id("meControlSignoutLink"));
            logauyButton.click();
            driver.close();
            System.out.println("Test results: Success");
        }
        catch(NoSuchElementException e){
            driver.quit();
            System.out.println("Test results: Something goes wrong");
        }

    }
}
