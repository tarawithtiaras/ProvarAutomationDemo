package pageobjects.LWC;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="helloExpressions"                                
               , summary=""
               , connection="LWC"
               , lightningWebComponent="helloExpressions"
               , namespacePrefix=""
     )             
public class helloExpressions {

	@TextType()
	@FindBy(xpath = ".//c-hello-expressions//input[@name='firstName']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = ".//c-hello-expressions//input[@name='lastName']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = ".//c-hello-expressions//p[contains(@class,'slds-m-top_medium')]")
	public WebElement FullName;
	
}
