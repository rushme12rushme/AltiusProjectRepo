package qsp;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOtherThanSpBrowser {
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Which browser not to close");
		String CloseBrowser = s.nextLine();
		String lowercaseBrowser=CloseBrowser.toLowerCase();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allHandles = driver.getWindowHandles();	
		for(String handle:allHandles)
		{
			String title=driver.switchTo().window(handle).getTitle();
			String lowertitle=title.toLowerCase();

			if(lowertitle.contains(lowercaseBrowser)==false)
			{
				System.out.println("closing browser:  "+lowertitle);
				Thread.sleep(2000);
				driver.close();
			}				
		}
	}



}


