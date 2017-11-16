package ohtu;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:4567");

        // tulostetaan sivu konsoliin
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        //kirjauduOikeaTunnusVaaraSalasana(driver);
        //luoTuntematonTunnus(driver);
        //uusiToimivaTunnus(driver);
        uusiToimivaTunnusJaUlos(driver);

        // tulostetaan sivu konsoliin
        System.out.println(driver.getPageSource());

        // ...
        driver.quit();
    }

    private static void kirjauduOikeaTunnusVaaraSalasana(WebDriver driver) {
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("eimuutenole");
        element = driver.findElement(By.name("login"));
        element.click();
    }

    private static void luoTuntematonTunnus(WebDriver driver) {
        Random r = new Random();
        WebElement element = driver.findElement(By.linkText("register new user"));
        String tunnus = "Arto " + r.nextInt(10000);
        element.click();
        element = driver.findElement(By.name("username"));
        element.sendKeys(tunnus);
        element = driver.findElement(By.name("password"));
        element.sendKeys("eimuutenole");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("eimuutenole12");
        element = driver.findElement(By.name("signup"));
        element.click();
    }

    private static void uusiToimivaTunnus(WebDriver driver) {
        Random r = new Random();
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
        element = driver.findElement(By.name("username"));
        element.sendKeys("arto" + r.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("eimuutenole12");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("eimuutenole12");
        element = driver.findElement(By.name("signup"));
        element.click();
    }

    private static void uusiToimivaTunnusJaUlos(WebDriver driver) {
        Random r = new Random();
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
        element = driver.findElement(By.name("username"));
        element.sendKeys("arto" + r.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("eimuutenole12");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("eimuutenole12");
        element = driver.findElement(By.name("signup"));
        element.click();
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
    }

    private static void sleep(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (Exception e) {
        }
    }
}
