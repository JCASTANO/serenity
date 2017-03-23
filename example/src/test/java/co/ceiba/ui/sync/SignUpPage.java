package co.ceiba.ui.sync;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://github.com")
public class SignUpPage extends PageObject {

	public void clickButtonSignUp() {
		find(By.cssSelector("*[class^='btn btn-primary btn-large f4 btn-block']")).click();
	}
}
