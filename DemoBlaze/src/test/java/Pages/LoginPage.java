package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class LoginPage  extends TestBase {
	
	   @FindBy(id = "login2")
	   WebElement loginbutton;

	   @FindBy(id = "loginusername")
	   WebElement username;

	   @FindBy(id = "loginpassword")
	   WebElement password;
	   
	   @FindBy(css = "div.modal.fade.show › button.btn btn-primary " )
	   WebElement log; 
	   
	   public LoginPage() {

		      PageFactory.initElements(driver, this);
		}
	   
	  

//	   public void loginbutt() {
//		   loginbutton.click();
//	   }

	   


public void login(String struser ,String  strpassword) {
	
	loginbutton.click();
	username.sendKeys(struser) ;
	password.sendKeys(strpassword);
	log.click();
	
}
	
}
