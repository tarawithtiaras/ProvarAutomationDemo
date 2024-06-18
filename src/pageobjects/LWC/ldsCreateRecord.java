package pageobjects.LWC;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="ldsCreateRecord"                                
               , summary=""
               , connection="LWC"
               , lightningWebComponent="ldsCreateRecord"
               , namespacePrefix=""
     )             
public class ldsCreateRecord {

	@TextType()
	@FindBy(xpath = ".//c-lds-create-record//label[normalize-space(.)='Name']/following-sibling::div//input")
	public WebElement name;
	@ButtonType()
	@FindBy(xpath = ".//c-lds-create-record//button[normalize-space(.)='Create Account']")
	public WebElement createAccount;
	@TextType()
	@FindBy(xpath = ".//c-lds-create-record//label[normalize-space(.)='Id']/following-sibling::div//input")
	public WebElement id;
	
}
