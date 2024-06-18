package pageobjects.LWC;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="helloConditionalRendering"                                
               , summary=""
               , connection="LWC"
               , lightningWebComponent="helloConditionalRendering"
               , namespacePrefix=""
     )             
public class helloConditionalRendering {

	@BooleanType()
	@FindBy(xpath = ".//c-hello-conditional-rendering//label[normalize-space(.)='Show details']/span[1]")
	public WebElement showDetails;
	
}
