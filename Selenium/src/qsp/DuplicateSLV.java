package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateSLV {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
System.out.println("enter a value");
String s1=s.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/rushm/Desktop/hotel.html");

WebElement slvList = driver.findElement(By.id("slv"));
Select l =new Select(slvList);
List<WebElement> options = l.getOptions();
int count=options.size();
ArrayList<String> sortedList = new ArrayList<>(); 
for(int i=0;i<count;i++)
{
	String str=options.get(i).getText();
	System.out.println(s);

	}
	}}


