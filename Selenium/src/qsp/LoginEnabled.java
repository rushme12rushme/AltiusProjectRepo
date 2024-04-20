package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			boolean res = driver.findElement(By.name("login")).isEnabled();
			if(res==true)
			{
				System.out.println("Login button is enabled");
			}
				else
					System.out.println("Login button is disabled");

					
			
	driver.quit();
	}
}
