package co.ceiba.sincronizar.steps;

import static org.assertj.core.api.Assertions.assertThat;

import co.ceiba.sincronizar.ui.SyncPage;
import net.thucydides.core.annotations.Step;

public class NavigatingSync {

	SyncPage syncPage;

    @Step("Given a user is in sync page")
    public void isOnTheSyncPage() {
    	syncPage.open();
    }
    
    @Step("When click in sync button")
    public void clickButtonSync() {
    	syncPage.clickButtonSync();
    }
    
    @Step("Then the title will be")
    public void titleWillBe(String title) {
        assertThat(syncPage.getTitle()).containsIgnoringCase(title);
    }
}
