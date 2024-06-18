package pageobjects.HealthCloud;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="HealthCloudGA__HcComponentWrapper"                                
               , summary=""
               , connection="HealthCloudAdmin"
               , lightningComponent="HcComponentWrapper"
               , namespacePrefix="HealthCloudGA"
     )             
public class HealthCloudGA__HcComponentWrapper {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//div[@id='MultipleCarePlanContainer']/h2")
	public WebElement HeaderAllCarePlans;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@aura:id= 'search-input']", qualifier = "search-input")
	public WebElement searchCareplantemplates;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Apply']")
	public WebElement apply;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:buttonMenu[@aura:id= 'careplanMenu']")
	public WebElement moreOptions;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:menuItem[@label= 'Expand All Care Plans']")
	public WebElement expandAllCarePlans;
}
