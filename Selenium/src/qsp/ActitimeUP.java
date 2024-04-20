package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitimeUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
			driver.get("http://localhost/login.do");
			int h1=driver.findElement(By.name("username")).getSize().getHeight();
			int w1=driver.findElement(By.name("username")).getSize().getWidth();
			int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
				
			int w2=driver.findElement(By.name("pwd")).getSize().getWidth();
			if(h1==h2 && w1==w2)
				System.out.println("Height and Weight of Actitime Username and Password are equal");
			else
				System.out.println("Height and Weight of Actitime Username and Password are not equal");

				
			driver.quit();

					
			}

}

