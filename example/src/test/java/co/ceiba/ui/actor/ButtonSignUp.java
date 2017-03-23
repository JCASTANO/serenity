package co.ceiba.ui.actor;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonSignUp {
	
	public static Target BUTTON_SIGN_UP = Target.the("button sign up").located(By.cssSelector("*[class^='btn btn-primary btn-large f4 btn-block']"));
}
