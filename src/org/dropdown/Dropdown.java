package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jega\\eclipse-workspace\\SeleniumDropdown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement ddl = driver.findElement(By.id("Skills"));
		
		Select Select = new Select(ddl);
		
		// TO CALL ALL OPTIONS FROM DROPDOWN BOX
		List<WebElement> options = Select.getOptions();
		
		// TO GET THE COUNT OF OPTIONS
		int size = options.size();
		System.out.println(size);
		
		// TO CALL ALL OPTIONS TEXT BY USING WEBELEMENT
		String text = ddl.getText();
		System.out.println(text);
		
		
		// TO PRINT THE VALUE IN OPTIONS
		Select.selectByIndex(10);
		
		
		
		// TO CALL THE PARTICULER VALUE IS OPTIONS
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		WebElement data = options.get(10);
		String text2 = data.getText();
		System.out.println(text2);
		
		
		// GET ALL OPTIONS IN DROPDOWN
		
		// ITERATE ALL OPTIONS
		
		for (int i = 0; i < options.size(); i++) {
			
			//2.1 GET THE EACH WEBELEMENT
			WebElement element = options.get(i);
			
			//2.2 GET THE TEXT BY USING STRING
			String text3 = element.getText();
			System.out.println(text3);
		}
		
	
	}

}
