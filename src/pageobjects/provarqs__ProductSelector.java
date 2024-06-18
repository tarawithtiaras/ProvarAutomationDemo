package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Provarqs__ Product Selector"                                
               , summary=""
               , page="ProductSelector"
               , namespacePrefix="ProvarQS"
               , object="Opportunity"
               , connection="DemoOrg"
     )             
public class provarqs__ProductSelector {

	@TextType()
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancel}']")
	public WebElement cancel;
	
}
