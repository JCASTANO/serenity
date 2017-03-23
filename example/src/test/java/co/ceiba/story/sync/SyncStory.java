package co.ceiba.story.sync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.ceiba.step.sync.SyncStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SyncStory {

    @Steps
    SyncStep navigatingSync;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToClickToTheOptionSync() {
        // Given
    	navigatingSync.isOnTheSyncPage();

        // When
    	navigatingSync.clickButtonSync();

        // Then
    	navigatingSync.titleWillBe("Familia");
    }
}
