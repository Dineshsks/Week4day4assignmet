package week4day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sks@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//a[text()='DINESH']")).click();
	driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	String text = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	driver.close();
}
	

}
