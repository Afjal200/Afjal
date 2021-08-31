package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fibo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium1\\Practice\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();    //open Chromebrowser
		 driver.manage().window().maximize();    // maximize the window
		 driver.get("https://www.facebook.com/");  // open URL
		
	}

}
