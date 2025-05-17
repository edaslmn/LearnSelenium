package day04_locators_xpath_casSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath {
    public static void main(String[] args) {

       /*
            Su ana kadar 6 locator gorduk
            1- By.id()
            2- By.name()
            3- By.className()
            4- By.tagName()
            5- By.linkText()
            6- By.partialLinkText()

            bu locator'lar kendi alanlarinda uzmanlasmistir
            ama bir HTML element de id attribute'u yoksa By.id() Kullanilamaz
            ayni sekilde HTML element link degilse By.linkText() veya By.partialLinkText() kullanilamaz

            Bize her turlu elemani locate edebilecek
            guclu bir LOCATOR lazim

            xpath ve cssSelecetor her turlu webelement'i locate etmek icin tasarlanmistir

         */
    }
}
