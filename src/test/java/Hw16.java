import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Hw16 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        driver.findElement(By.id("searchbox")).sendKeys("ноутбук");
        driver.findElement(By.id("doSearch")).click();


        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id=\"page-catalog\"]/div[1]/div[1]/div[2]/aside/div/div[3]/div[1]/div[2]/div[2]/ul/li[4]/label/i")).click();

        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page:" + titleOfThePage);

    }


}
