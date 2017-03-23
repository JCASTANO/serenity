package co.ceiba.story.sync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.ceiba.step.sync.SignUpStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SignUpStory {

    @Steps
    SignUpStep signUpStep;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToClickToTheOptionSignUp() {
        // Given
    	signUpStep.isOnTheSignUpPage(); 

        // When
    	signUpStep.clickButtonSignUp();

        // Then
    	signUpStep.titleWillBe("Join GitHub · GitHub");
    }
}
