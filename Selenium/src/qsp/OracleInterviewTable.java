package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OracleInterviewTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gyrocode.com/projects/jquery-datatables-checkboxes/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement nxtbtn = driver.findElement(By.xpath("//a[text()='Next']"));
		
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Next']")));
		  
		 
		ArrayList<String> al=new ArrayList<> ();
		
		String st;
		 nxtbtn = driver.findElement(By.xpath("//a[text()='Next']"));

		st = nxtbtn.getAttribute("class");
		do
				{
			
			List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[2]"));
			System.out.println(names.size());
			for(int i=0;i<names.size();i++)
			{
				al.add(names.get(i).getText());
				
			}
			
			 nxtbtn = driver.findElement(By.xpath("//a[text()='Next']"));
			 nxtbtn.click();
			 nxtbtn = driver.findElement(By.xpath("//a[text()='Next']"));

			st = nxtbtn.getAttribute("class");
			
			}while(st.equals("paginate_button next"));
		
		List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		System.out.println(names.size());
		for(int i=0;i<names.size();i++)
		{
			al.add(names.get(i).getText());
			
		}
		System.out.println(al);
		
		
	}
}
