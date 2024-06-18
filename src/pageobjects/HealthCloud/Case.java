package pageobjects.HealthCloud;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Case"                                
     , summary=""
     , relativeUrl=""
     , connection="HealthCloudAdmin"
     )             
public class Case {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(linkText = "Add Member")
	public WebElement addMember;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@AuraBy(componentXPath = "//ui:autocomplete[@aura:id= 'autocomplete']")
	public WebElement SearchPeople;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindBy(xpath = "//button[@name='save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Related']")
	public WebElement related;
			
}
