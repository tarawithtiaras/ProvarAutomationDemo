package pageobjects.HealthCloud;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="HealthCloudGA__HcSimpleTableCell"                                
               , summary=""
               , connection="HealthCloudAdmin"
               , auraComponent="HcSimpleTableCell"
               , namespacePrefix="HealthCloudGA"
     )             
public class HealthCloudGA__HcSimpleTableCell {

	@PageRow()
	public static class templateTable
	{
	@BooleanType()
	@FindBy(xpath="//td[1]//input")
	public WebElement chkBox;
	@FindBy(xpath="//td[2]//span")
	public WebElement tempName;
	
	}
	@FindBy(xpath="//div[@id='CarePlanTemplateSelectTable']/table/tbody/tr")
	@PageTable(firstRowContainsHeaders=false,row=templateTable.class)
	public List<templateTable> templateTable;
	
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//label[normalize-space(.)='ProvarTemplate']/span[1]")
	public WebElement select_row;
	
	
	
	
}
