package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="AccountAction"                                
               , summary=""
               , page="AccountAction"
               , namespacePrefix=""
               , object="Account"
               , connection="Admin"
     )             
public class AccountAction {

	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"action-label\")]")
	public WebElement account_action;
	
}
