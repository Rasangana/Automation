import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","D:\\New folder (4)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
    }
}
