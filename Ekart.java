package week6.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ekart {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://buythevalue.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='grid-image']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("602023");
	driver.findElement(By.xpath("//input[@value='Check']")).click();
	driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='View Cart']")).click();
	driver.findElement(By.xpath("//input[@value='Check Out']")).click();
	Alert purchase = driver.switchTo().alert();
	Thread.sleep(1000);
	purchase.accept();
	driver.close();
	
	
}
}
