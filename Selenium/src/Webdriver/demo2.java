package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demo2 {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","\"C:\\Users\\91798\\Desktop\\chrome\\chromedriver.exe\"")
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	WebElement username=driver.findElement(By.id("txtUsername"));
	if(username).isEnabled())
{
	username.clear();
	username.sendKeys("Admin");
	
}
if(username.isDisplayed())
{
	webElementpwd=driver.findElement(By.id("txtPassword"));
	pwd.clear();
	pwd.sendKeys("admin123");
	driver.findElement(By.id("btnlogin")).click();
	Thread.sleep(3000);
	List<WebElement>link=driver.findElement(By)
}
}
}
