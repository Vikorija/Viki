import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Hw16 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

               driver.findElement(By.id("searchbox")).sendKeys("ноутбук");
        driver.findElement(By.id("doSearch")).click();
        WebDriverWait wait = new WebDriverWait(driver);
        driver.findElement(By.xpath("//*[@id='page-catalog']/div[1]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/ul/li[4]/label")).click();

        String titleOfThePage = driver.getTitle();
        System.out.println( "Title of the page:" + titleOfThePage);

    }



}
