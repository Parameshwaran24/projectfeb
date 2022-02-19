package org.dropdown;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jega\\eclipse-workspace\\SeleniumDropdown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php");
		
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("Guestuser");
		
		// WE CAN USE SHORTCUT KEYS BY USING {kEYS VALUE}  EX[KEYS.ENTER]
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("Barath.n2022",Keys.ENTER);
		
		//WebElement btnlogin = driver.findElement(By.id("login"));
		//btnlogin.click();
		
		Thread.sleep(2000);
		
		WebElement location = driver.findElement(By.id("location"));
	    Select Select = new Select(location);
		
	    // TO SELECT THE OPTIONS IN DROPDOWN BOX IN WEB
		Select.selectByIndex(2);
		
		WebElement hotellist = driver.findElement(By.id("hotels"));
		Select hotel = new Select(hotellist);
		hotel.selectByIndex(3);
		
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select roomlist = new Select(room);
		roomlist.selectByIndex(1);
		
		
		WebElement plpno = driver.findElement(By.name("room_nos"));
		Select countplp = new Select(plpno);
		countplp.selectByIndex(4);
		
		
		WebElement clickSubmit = driver.findElement(By.id("Submit"));
		clickSubmit.click();
		
		WebElement check = driver.findElement(By.name("radiobutton_0"));
		check.click();
		
		WebElement con = driver.findElement(By.xpath("//input[@value='Continue']"));
		con.click();
		
		

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//List<WebElement> opt = Select.getOptions();
		
		// TO GET THE SIZE OF OPTIONS
		//int size = opt.size();
		//System.out.println(size);
		
		// TO PRINT THE PARTICULAR VALUE OF OPTIONS
		//WebElement t = opt.get(2);
		//String text = t.getText(); 
		//System.out.println(text);
		
		
		
		// TO CALL ALL OPTIONS TEXT BY USING WEBELEMENT
		//String loc = location.getText();
		//System.out.println(loc);
		
	
		
		
		
		
	
	}

}
