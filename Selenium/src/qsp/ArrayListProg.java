package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListProg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rushm/Desktop/hotel.html");
		WebElement slvList = driver.findElement(By.id("slv"));
		Select s =new Select(slvList);
		ArrayList<String> al=new ArrayList<>();
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			String text=options.get(i).getText();	
			al.add(text);
		}
		Collections.sort(al);
		for(String al1:al)
		{
			System.out.println(al1);
		}
	}
}
