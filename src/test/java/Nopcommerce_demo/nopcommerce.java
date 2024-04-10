package Nopcommerce_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class nopcommerce {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass
	
	public void setup() {
		  
	report = new ExtentReports(System.getProperty("user.dir")+"/TestNgSelenium_nopcommerce/nop.html");
		
	test = report.startTest("nop");
	}
	
	@BeforeTest
	public void openwindow(){
		
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.manage().window().maximize();
	
	
	
	driver.get("https://demo.nopcommerce.com/register");  // paste the URL of nopcommerce
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	
	}
	
	
	
	@Test  ( priority = 0)
	public void Registration() {
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
    wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	WebElement gender = driver.findElement(By.id("gender-male"));  
		            
    gender.click();
     
    test.log(LogStatus.PASS,"Male radiobutton is clicked");
		
		
		             
		             
	WebElement firstname = driver.findElement(By.id("FirstName"));
		 
	firstname.sendKeys("Rahul");
	
	test.log(LogStatus.PASS,"first name is entered");
		  
		            
	WebElement lastname = driver.findElement(By.name("LastName")); 
		             
	lastname.sendKeys("Raj");
	test.log(LogStatus.PASS,"last name is entered");
		             
		             
		             
	WebElement dateofbirth = driver.findElement(By.name("DateOfBirthDay"));
		   
    // create an object of select to access the webelement of dropdown
		   
    Select s1 = new Select(dateofbirth);
		   
    s1.selectByIndex(14);    // select using index 
		           
    WebElement birthmonth = driver.findElement(By.name("DateOfBirthMonth"));
		          
    Select s2 = new Select(birthmonth);
		   
    s2.selectByValue("5");     // select using value 
    
    test.log(LogStatus.PASS,"Date of birthmonth is selected");
		          
		          
		        
	 WebElement birthyear = driver.findElement(By.name("DateOfBirthYear"));
		             
	 Select s3 = new Select(birthyear);
	 
	 s3.selectByVisibleText("2001");
	 test.log(LogStatus.PASS,"Birth year is selected");
		           
		           
		           
      WebElement email = driver.findElement(By.name("Email"));
		               
	  email.sendKeys("rahulraj008@gmail.com");
	  
	  test.log(LogStatus.PASS,"email is entered");
		        
		              
		     
	  WebElement companyname = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	  companyname.sendKeys("Masai School");
	  test.log(LogStatus.PASS,"company name is entered");          
		          
      WebElement newsletter = driver.findElement(By.id("Newsletter"));
		  
      newsletter.click();
	  newsletter.click();
	  test.log(LogStatus.PASS,"news letter button is clicked");         
		         
		         
	  WebElement password = driver.findElement(By.name("Password"));
		   
      password.sendKeys("Rahul@9005363");
      
      test.log(LogStatus.PASS,"password is entered");
		   
		   
	  WebElement confirm_password = driver.findElement(By.id("ConfirmPassword"));
	  
      confirm_password.sendKeys("Rahul@905363");
      
      test.log(LogStatus.PASS,"confirm password is entered");
		   
		         
      WebElement clickon_registration = driver.findElement(By.id("register-button"));
      
      wait.until(ExpectedConditions.elementToBeClickable(clickon_registration));
		    
	  clickon_registration.click();
	  
	  test.log(LogStatus.PASS,"registration button is clicked");
	  
	  
	  
	}
	
	
	
	@Test (priority = 1)
	public void bookorder() {
		
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		
	  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		  
		
	  WebElement book = driver.findElement(By.xpath("(//*[.='Books '])[1]"));
		 
	  wait.until(ExpectedConditions.elementToBeClickable(book));
		 
	  book.click();
	  
	  test.log(LogStatus.PASS,"book button is clicked");
		 
		 
		 
		 
	  WebElement addtocart = driver.findElement(By.xpath("(//*[.='Add to cart'])[1]"));
		  
	  wait.until(ExpectedConditions.elementToBeClickable(addtocart));
	  addtocart.click();
	  
	  test.log(LogStatus.PASS,"add to cart button is clicked");
		              
		              
		              
		              
	   WebElement shoppingcart = driver.findElement(By.className("cart-label"));
		          
	   wait.until(ExpectedConditions.elementToBeClickable(shoppingcart));
		          
	   shoppingcart.click();
	   
	   test.log(LogStatus.PASS,"shoppong cart  button is clicked");
		              
		              
		              
	   WebElement termcondition = driver.findElement(By.id("termsofservice"));
		        
	   termcondition.click();
	   test.log(LogStatus.PASS,"term and condition checkbox is clicked");
		              
		              
		              
		              
		WebElement checkout = driver.findElement(By.id("checkout"));
	    wait.until(ExpectedConditions.elementToBeClickable(checkout));
		    
		    
		 checkout.click();
		 
		 test.log(LogStatus.PASS,"checkout button is clicked");
		            
		            
		            
		            
		 WebElement checkout_guest = driver.findElement(By.xpath("//*[.='Checkout as Guest']"));
		 wait.until(ExpectedConditions.elementToBeClickable(checkout_guest));
		     
		     
		  checkout_guest.click();
		  
		  test.log(LogStatus.PASS,"check out guest button is clicked");
		              
		              
		              
		              
		  
		              
		             
		              
	}
	
	
	@Test (priority = 2)
	
	public void bilingaddress() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	    driver.findElement(By.id("ShipToSameAddress")).click();
		
	    WebElement firstname = driver.findElement(By.id("BillingNewAddress_FirstName"));
		      
		      
	     firstname.sendKeys("Rahul");
	     
	     test.log(LogStatus.PASS,"billing first name is entered");
		            
		            
		            
		 WebElement lastname = driver.findElement(By.id("BillingNewAddress_LastName"));
		     
		 lastname.sendKeys("Raj");
		 
		 test.log(LogStatus.PASS,"billing last name is entered");
		             
		             
		             
		             
		  WebElement email = driver.findElement(By.id("BillingNewAddress_Email"));
		      
		  email.sendKeys("rahulraj13@gmail.com");
		  
		  test.log(LogStatus.PASS,"billing email is entered");
		      
		      
		      
		   WebElement companyname = driver.findElement(By.name("BillingNewAddress.Company"));
		     
		     
		   companyname.sendKeys("MasaiSchool");
		   
		   test.log(LogStatus.PASS,"billing company name is entered");
		     
		     
		     
		     
		    WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		    
		           
		    Select s1 = new Select(country);
		    
		    s1.selectByValue("133");
		    
		    test.log(LogStatus.PASS,"country name is entered");
		    
		    
		     WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
		   
		   
		      city.sendKeys("Gurgaon");
		      
		      test.log(LogStatus.PASS,"billing city name is entered");
		            
		            
		            
		            
		    WebElement Address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
		    
		    Address1.sendKeys("Sec. 14 , near huda city centre");
		    
		    test.log(LogStatus.PASS,"billing proper address is entered");
		            
		            
		            
		    WebElement postalcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		    
		     postalcode.sendKeys("103122");
		     
		     test.log(LogStatus.PASS,"billing postal code is entered");
		          
		          
		          
		    WebElement phonenumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		   
		    phonenumber.sendKeys("1234567899");
		    
		    test.log(LogStatus.PASS," phone number is entered");
		            
		            
		            
		            
		     WebElement clickon_continue = driver.findElement(By.name("save"));
		         
		     wait.until(ExpectedConditions.elementToBeClickable(clickon_continue));
		     
		      clickon_continue.click();
		      
		      test.log(LogStatus.PASS,"continue button is clicked");
		              
		              
		              
		              
		              
						
		           
		
		
		              
	}
	
	@Test (priority = 3)
	
	public void payment() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement clickon_continue2 = driver.findElement(By.xpath("(//*[.='Continue'])[2]"));
		 
		wait.until(ExpectedConditions.elementToBeClickable(clickon_continue2));
	     
	     
         clickon_continue2.click();
         
         test.log(LogStatus.PASS,"continue button is clicked");
         
         
         
        WebElement clickon_continue3 = driver.findElement(By.xpath("(//*[.='Continue'])[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(clickon_continue3));
        clickon_continue3.click();
        
        test.log(LogStatus.PASS,"continue button is clicked");
            
            
            
            
        WebElement clickon_continue4 = driver.findElement(By.xpath("(//*[.='Continue'])[4]"));

        wait.until(ExpectedConditions.elementToBeClickable(clickon_continue4));
          
        clickon_continue4.click();
        
        test.log(LogStatus.PASS,"continue button is clicked");
          
          
          
          
          
        WebElement clickon_continue5 = driver.findElement(By.xpath("(//*[.='Continue'])[5]"));
 
 
        wait.until(ExpectedConditions.elementToBeClickable(clickon_continue5));
 
 
        clickon_continue5.click();
        
        test.log(LogStatus.PASS,"continue button is clicked");
          
         
         
         
         
       WebElement confirm = driver.findElement(By.xpath("//*[.='Confirm']"));
       
       wait.until(ExpectedConditions.elementToBeClickable(confirm));
       
       confirm.click();
       
       test.log(LogStatus.PASS,"continue button is clicked");
       
       
		
		
	}
	

	@Test ( priority = 4)
	public void print() {
		System.out.println("Your order has been successfully processed ");
		
		 test.log(LogStatus.PASS,"order is successfully processed");
	}
	
	@AfterTest
	public void windowclose() {
		driver.close();
		 test.log(LogStatus.PASS,"window is closed");
	}
	
	
	@AfterClass
	
	public void end() {
		
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	
	
	
	
	
	
	

}
