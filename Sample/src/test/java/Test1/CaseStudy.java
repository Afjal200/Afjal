package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\Practice\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();    //open Chromebrowser
		 driver.manage().window().maximize();    // maximize the window
		 driver.get("https://www.facebook.com/");  // open URL
		 Thread.sleep(3000);                       //wait for 3 seconds
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("afjal.fb@123"); // enter username
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password@123");  // enter password
		 driver.findElement(By.xpath("//button[@name='login']")).click();     //click on login button
		 Thread.sleep(6000); // wait for 6 seconds
		 driver.close();     // close the window
		 

	}

}
