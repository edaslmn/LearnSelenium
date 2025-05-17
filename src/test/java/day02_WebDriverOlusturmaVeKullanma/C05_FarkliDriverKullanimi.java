package day02_WebDriverOlusturmaVeKullanma;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_FarkliDriverKullanimi {
    public static void main(String[] args) throws InterruptedException {

        // Eğer çalıştığımız firma
        // Selenium WebDriver yerine kendi belirledikleri spesifik bir webdriver
        // kullanmamızı isterse bu webdriver'ı projemize eklemeliyiz.

        // WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:/www.testotomasyonu.com");
        Thread.sleep(3000);
        driver.quit();




    }
}
