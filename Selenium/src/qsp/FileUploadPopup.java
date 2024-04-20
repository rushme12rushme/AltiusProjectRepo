package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//Using absolute path which will not work in others systems
driver.get("file:///C:/Users/rushm/Desktop/naukri.html");
//driver.findElement(By.id("cv")).sendKeys("C:/Users/rushm/Desktop/naukri.html");

// using relative path
//File f = new File("./data/SelfIntroduction.docx");
//String str = f.getAbsolutePath();
//driver.findElement(By.id("cv")).sendKeys(str);
driver.findElement(By.id("cv")).click();

//using absolute path of data folder
//File f1 = new File("C:\\Users\\rushm\\eclipse-workspace\\Selenium\\data\\SelfIntroduction.docx");
//String str1 = f1.getAbsolutePath();
//driver.findElement(By.id("cv")).sendKeys(str1);
	}

}
