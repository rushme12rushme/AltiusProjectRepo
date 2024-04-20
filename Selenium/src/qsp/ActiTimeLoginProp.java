package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginProp {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/CommonData.property");
		Properties p = new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("pwd");		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		String title=driver.getTitle();
		if(title.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Login is Successful");
		}
		driver.quit();
		
	}

}
