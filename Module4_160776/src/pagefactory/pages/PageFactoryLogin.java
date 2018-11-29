package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryLogin {

	WebDriver driver;
	
	@FindBy(name="uname")
	@CacheLookup
	WebElement uname;
	
	@FindBy(how = How.NAME, using = "pass")
	@CacheLookup
	WebElement pass;
	
	@FindBy(how = How.ID, using = "customer.customerName")
	@CacheLookup
	WebElement cname;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='customer.customerAddress']")
	@CacheLookup
	WebElement caddress;
	
	@FindBy(how = How.ID, using = "customer.customerPancard")
	@CacheLookup
	WebElement pancard;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='customer.customerEmail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(how = How.ID, using = "account.accountBalance")
	@CacheLookup
	WebElement accbal;
	
	@FindBy(how = How.NAME, using = ".//*[@id='account.accountOpenDate']")
	@CacheLookup
	WebElement date;
	
	@FindBy(how = How.NAME, using = "user.userTransPassword']")
	@CacheLookup
	WebElement ans;
	
	public PageFactoryLogin(WebDriver driver)
	{
		this.driver = driver;
	}

	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}

	public void setPass(String pass) {
		this.pass.sendKeys(pass);
	}

	public void setCname(String cname) {
		this.cname.sendKeys(cname);
	}

	public void setCaddress(String caddress) {
		this.caddress.sendKeys(caddress);
	}

	public void setPancard(String pancard) {
		this.pancard.sendKeys(pancard);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setAccbal(String accbal) {
		this.accbal.sendKeys(accbal);
	}

	public void setDate(String date) {
		this.date.sendKeys(date);
	}

	public void setAns(String ans) {
		this.ans.sendKeys(ans);
	}
	
	
	
}
