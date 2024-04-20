package com.actiTime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
TakesScreenshot t=(TakesScreenshot)driver;
File src=t.getScreenshotAs(OutputType.FILE);
double rand = Math.random();
File dest=new File("./Screenshot/"+rand+".png");
FileUtils.copyFile(src, dest);
driver.quit();



	}

}
