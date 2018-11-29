package pagefactory.pages.test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactory.pages.PageFactoryLogin;

public class TestPageFactoryLogin 
{
	
  @Test
  public void verifyPageFactoryLogin() throws Exception
  {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://ndafile:8081/OnlineBankingProjectSpring/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PageFactoryLogin pf1 = PageFactory.initElements(driver, PageFactoryLogin.class);
	  
	  String pattern = "^[A-Z]{1}[a-z]{2,}$";
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Online Banking System";
	  if(expectedTitle.contentEquals(actualTitle))
	  {
		  System.out.println("Title matches");
	  }
	  else
	  {
		  System.out.println("Title does not match");
	  }
	  Thread.sleep(1000);
	  
	  driver.findElement(By.linkText("Admin Login")).click();
	  Thread.sleep(1000);
	  
	  pf1.setUname("Admin");
	  //Pattern p = Pattern.compile(pattern);
	  //Matcher m = p.matcher(arg0);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("http/body/div/div[2]/form/table/tbody/tr[3]/td[2]/input")).click();
	  
	  actualTitle = driver.getTitle();
	  expectedTitle = "Home Page";
	  if(expectedTitle.contentEquals(actualTitle))
	  {
		  System.out.println("Title matches");
	  }
	  else
	  {
		  System.out.println("Title does not match");
	  }
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String link = driver.findElement(By.linkText("Add new account")).getText();
	  if(link.matches("Add new account"))
	  {
		  System.out.println("Link is available");
	  }
	  else
	  {
		  System.out.println("Link is not available");
	  }
	  
	  driver.findElement(By.linkText("Add new account")).click();
	  String heading = driver.findElement(By.tagName("h2")).getText();
	  System.out.println(heading);
	  
	  Thread.sleep(1000);
	  
	  pf1.setCname("Mona");
	  Thread.sleep(1000);
	  
	  pf1.setCaddress("Paris");
	  Thread.sleep(1000);
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Pancard number:");
	  String pancard = sc.next();
	  
	  pf1.setPancard(pancard);
	  Thread.sleep(1000);
	  
	  pf1.setEmail("mona@yahoo.com");
	  Thread.sleep(1000);
	  
	  pf1.setAccbal("2000");
	  Thread.sleep(1000);
	  
	  driver.close();
	  
  }
  
}
