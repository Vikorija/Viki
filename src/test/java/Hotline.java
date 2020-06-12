import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hotline {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://hotline.ua/");

        driver.findElement(By.id("searchbox")).sendKeys("ноутбук");
        driver.findElement(By.id("doSearch")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='type-checkbox plus']/a[@data-eventlabel='SSD накопичувач[385943]']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='type-checkbox plus']/a[@data-eventlabel='Intel Core i7-10xxx[620918]']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Xiaomi RedmiBook 14 i7 10th 8/512Gb/MX250 Silver (JYU4163CN)')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-id='prices']/span[@class='inline']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='cell-7 cell-md']/*[@href='/go/price/12154995494/']"))).click();

        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page:" + titleOfThePage);
    }
}
