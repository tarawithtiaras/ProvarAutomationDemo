package pageobjects.LWC;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="hello"                                
               , summary=""
               , connection="LWC"
               , lightningWebComponent="hello"
               , namespacePrefix=""
     )             
public class hello {

	@TextType()
	@FindBy(xpath = ".//c-hello//span")
	public WebElement Title;
	
}
