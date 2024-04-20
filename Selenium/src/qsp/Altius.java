package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Altius {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("http://192.168.222.128:8080");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("j_username")).sendKeys("rashmi@dell.com");
driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@title='Sign In']")).click();

}
}