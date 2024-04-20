package qsp;

// TODO Auto-generated method stub

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XyActiTime 
{

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		int xaxis=driver.findElement(By.id("loginButton")).getLocation().getX();
		int yaxis=driver.findElement(By.id("loginButton")).getLocation().getY();
		System.out.println("Xaxis value is "+xaxis);
		System.out.println("Yaxis value is "+yaxis);
		driver.quit();




	}





}


