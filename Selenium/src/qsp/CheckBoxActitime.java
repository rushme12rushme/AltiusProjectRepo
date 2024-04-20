package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxActitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
			driver.get("http://localhost/login.do");
			boolean res = driver.findElement(By.id("keepLoggedInCheckBox")).
					isSelected();
			if(res==true)
			{
				System.out.println("CheckBox  is Selected");
			}
				else
					System.out.println("CheckBox  is  notSelected");

			driver.quit();	
			}

}

