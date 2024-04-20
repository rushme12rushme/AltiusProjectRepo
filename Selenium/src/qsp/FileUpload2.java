package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("before finding the file upload button");
	driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\rushm\\Desktop\\SelfIntroduction.docx");
	}

}
