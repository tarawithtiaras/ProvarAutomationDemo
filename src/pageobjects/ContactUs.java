package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ContactUs"                                
     , summary=""
     , relativeUrl=""
     , connection="ProvarContactUs"
     )             
public class ContactUs {

	@TextType()
	@FindByLabel(label = "First name")
	public WebElement firstName;
	@TextType()
	@FindByLabel(label = "Last name")
	public WebElement lastName;
	@TextType()
	@FindByLabel(label = "Company")
	public WebElement company;
	@TextType()
	@FindByLabel(label = "Work email")
	public WebElement workEmail;
	@TextType()
	@FindByLabel(label = "What can we help you with?")
	public WebElement whatCanWeHelpYouWith;
	@ButtonType()
	@FindBy(name = "w2lsubmit")
	public WebElement Submit;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:button[@aura:id= 'convertedGoToLeads']")
	public WebElement goToLeads;
	@TextType()
	@FindBy(xpath = "//input[@id='sf_first_name' and @name='first_name']")
	public WebElement firstName1;
			
}
