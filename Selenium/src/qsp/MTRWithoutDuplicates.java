package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRWithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rushm/Desktop/hotel.html");
		WebElement listbox=driver.findElement(By.id("slv"));
		Select s=new Select(listbox);
		List <WebElement> alloptions= s.getOptions();
		HashSet <String> hs=new HashSet<> ();
		System.out.println("All options");
		for(int i=0;i<alloptions.size();i++)
		{
			String option=alloptions.get(i).getText();
			System.out.println(option);
		}
		
		//for printing only duplicates
		System.out.println("ONLY DUPLICATES");
		for(int i=0;i<alloptions.size();i++)
		{
			String option=alloptions.get(i).getText();
			boolean res=hs.add(option);
			if(res==false)
				{
					System.out.println(option);
				}
		}
		
		//without duplicates
		System.out.println("without duplicates");
		System.out.println(hs);
		
		//printing in alphabetical order
		ArrayList<String> al=new ArrayList <> ();
		for(int i=0;i<alloptions.size();i++)
		{
			String option=alloptions.get(i).getText();
			al.add(option);
			
		}
		Collections.sort(al);
		System.out.println("In Alphabetical order");
		System.out.println(al);
		
		

	}

}
