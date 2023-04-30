package selenium.creation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//launch the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter username and password using Id locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click Contacts Tab
		driver.findElement(By.partialLinkText("Contacts")).click();
		//Click Create Contact
		driver.findElement(By.partialLinkText("Create Contact")).click();
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Santhosh Kumar");
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Muniyan");
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
	
		//Print the browser title 
		System.out.println("The title is"+driver.getTitle());
		//Print the first name
		String fname=driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(fname);
		
		
	}

}
