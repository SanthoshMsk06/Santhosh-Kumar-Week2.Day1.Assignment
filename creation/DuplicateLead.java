package selenium.creation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		// Click on Leads Button
        driver.findElement(By.linkText("Leads")).click();
        //Click on Create Lead 
        driver.findElement(By.linkText("Create Lead")).click();
        // Enter CompanyName Field Using id Locator
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
       //Enter FirstName Field Using id Locator
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh Kumar");
       //Enter LastName Field Using id Locator
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muniyan");
       //Enter FirstName(Local) Field Using id Locator
       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Santhosh Msk");
       // Enter Department Field Using any Locator of Your Choice
       driver.findElement(By.name("departmentName")).sendKeys("Automation Testing");
       //Enter your email in the E-mail address Field using the locator of your choice
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhoshmsk06@gmail.com");
       //Click on Create Button
       driver.findElement(By.name("submitButton")).click();
       //Get the Title of Resulting Page. 
      System.out.println("The title is"+driver.getTitle());
      Thread.sleep(1000);
      //Click on Duplicate button
      driver.findElement(By.partialLinkText("Duplicate Lead")).click();
      //Clear the CompanyName Field using .clear()
      driver.findElement(By.id("createLeadForm_companyName")).clear();
      //Enter new CompanyName
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
      //Clear the FirstName Field 
      driver.findElement(By.id("createLeadForm_firstName")).clear();
      //Enter new FirstName
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prem Kumar");
      //Click on Create Lead Button
      driver.findElement(By.name("submitButton")).click();
      //Get the Title of Resulting Page using driver.getTitle()
      System.out.println("The title is"+driver.getTitle());
      
      //close the browser
     //driver.close();
      
	}

}
