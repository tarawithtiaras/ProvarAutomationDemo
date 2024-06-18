package pageobjects.HealthCloud;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="HealthCloudGA__HcSimpleTableActionCell"                                
               , summary=""
               , connection="HealthCloudAdmin"
               , auraComponent="HcSimpleTableActionCell"
               , namespacePrefix="HealthCloudGA"
     )             
public class HealthCloudGA__HcSimpleTableActionCell {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@AuraBy(componentXPath = "//lightning:menuItem[@label= 'Apply Care Plan Templates']")
	public WebElement applyCarePlanTemplates;
	
	@PageRow()
	public static class expandCarePlanTable
	{
	@FindBy(xpath="//td//header[@class='careplancard__mainheader']//a")
	public WebElement icon;
	
	@FindBy(xpath="td//header[@class='careplancard__mainheader']//h2")
	public WebElement header;
	
	}
	@FindBy(xpath="//table[contains(@class,'slds-table hc-carePlanTable')]/tbody/tr")
	@PageTable(firstRowContainsHeaders=false,row=expandCarePlanTable.class)
	public List<expandCarePlanTable> expandCarePlanTable;
	
	@ButtonType()
	@FindBy(xpath = "(//*[text()='New Goal'])[1]/following::button[1]//*[name()='svg']")
	public WebElement moreOptions;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//td//div[3]//button[normalize-space(.)='More options']")
	public WebElement moreOptions1;

	@LinkType()
	@FindBy(linkText = "Apply Care Plan Templates")
	public WebElement applyCarePlanTemplates1;

	
}
