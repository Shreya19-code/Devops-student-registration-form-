import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FormTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {

            driver.get("file:///C:/Users/YourName/Desktop/index.html");
            driver.manage().window().maximize();

            // VALID INPUT
            driver.findElement(By.id("name")).sendKeys("Shreya Sharma");
            driver.findElement(By.id("email")).sendKeys("shreya@gmail.com");
            driver.findElement(By.id("mobile")).sendKeys("9876543210");

            Select dept = new Select(driver.findElement(By.id("department")));
            dept.selectByVisibleText("CSE");

            driver.findElement(By.xpath("//input[@value='Female']")).click();

            driver.findElement(By.id("feedback"))
                    .sendKeys("This form is working properly and user interface is very good");

            driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

            System.out.println("✅ Valid submission done");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
