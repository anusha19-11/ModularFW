package com.hrms.LIB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.objects.ObjectsInfo;

public class General extends ObjectsInfo{
	
public void setUp() {
		
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
			//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("Application opened");
	}

	public void tearDown() {
		driver.quit();
		System.out.println("Application and Browser are closed");
	}
	
	public void adminLogin() throws InterruptedException {
		driver.findElement(By.name(txt_username)).sendKeys(uid);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		driver.findElement(By.xpath(btnlogin_type)).click();
		
		Thread.sleep(5000);
		System.out.println("Admin login operation successful");

	}

	public void adminLogout() throws InterruptedException {
		driver.findElement(By.xpath(alt_profile)).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Admin logout");
	}
	
	public void addEmp() {
		System.out.println("Added new Employee");
	}
	
	public void delEmp() {
		System.out.println("Deleted employee");
	}

}
