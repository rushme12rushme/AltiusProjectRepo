package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvAlphabetical {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/rushm/Desktop/hotel.html");
		WebElement slvList = driver.findElement(By.id("slv"));
		Select s =new Select(slvList);
		List<WebElement> options = s.getOptions();
		int count=options.size();
		ArrayList<String> sortedList = new ArrayList<>(); 
		for(int i=0;i<count;i++)
		{
			
			
			sortedList.add(options.get(i).getText());
			
		}
		//sortedList.sort(null);
		Collections.sort(sortedList);
		System.out.println(sortedList);
		
		//without duplicates
		
		TreeSet t = new TreeSet(sortedList);
		System.out.println(t);
		
		
		
		
		
		
		}	
		
	}
	


