package co.ceiba.ui.sync;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://localhost:4200/#/sincronizar")
public class SyncPage extends PageObject {

	public void clickButtonSync() {
		find(By.id("btnSync")).click();
	}
}
