package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	public WebDriver driver1;
	public void LoginPage1(WebDriver driver2){
		
		driver1=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	//store the web elements
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement clickbtn;
	
	
	//we want to create associated methods
	
	
	public void setUsername(String usern){
		
		txtusername.sendKeys(usern);
	}
	
	public void setPassword(String pass){
		txtpassword.sendKeys(pass);
	}
	
	public void clickLogin(){
		clickbtn.click();
	}
	
	



}
