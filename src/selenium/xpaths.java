package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpaths {
WebDriver driver;
	
	public void xpathdemo() {
		
		driver.findElement(By.xpath("//input[@id = 'search_query_top']")).sendKeys("casual dress");	
		driver.findElement(By.xpath("//input[@id = 'search_query_top'][@type = 'text']")).sendKeys("casual dress");	
		driver.findElement(By.xpath("//input[(@id = 'search_query_top')or (@type = 'text')]")).sendKeys("casual dress"); // and/or		
		driver.findElement(By.xpath("//input[not(@id = 'search_query_top')]")); // not having the attribute		
		driver.findElement(By.xpath("//input[not(@type = 'hidden']")); // input not hidden		
		driver.findElement(By.xpath("//input[@class = 'search_query form-control ac_input']")); // xpath by class		
		driver.findElement(By.xpath("//input[starts-with (@class,'search_query')]")); // starts with ...starts-with		
		driver.findElement(By.xpath("//input[contains (@class,'search_query')]")); // using contains -- using partial text		
		driver.findElement(By.xpath("//a[text()= 'Contact us']")).click(); // contact us link --- we can use text()		
		driver.findElement(By.xpath("//a[contains (text(), 'Sign in')]")).click(); // Sign-in Link --- need to use contains follows by parenthesis and text(),			
		driver.findElement(By.xpath("//form[@id = 'searchbox']/button")).click(); // search button .. parent-child			
		driver.findElement(By.xpath("//div[@id = 'search_block_top']/form/button")).click(); // grandparent/parent/child
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
