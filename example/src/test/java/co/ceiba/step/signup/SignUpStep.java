package co.ceiba.step.signup;

import static org.assertj.core.api.Assertions.assertThat;

import co.ceiba.ui.signup.SignUpPage;
import net.thucydides.core.annotations.Step;

public class SignUpStep {

	SignUpPage signUpPage;

    @Step("Given a user is in sign up page")
    public void isOnTheSignUpPage() {
    	signUpPage.open();
    }
    
    @Step("When click in sign up button")
    public void clickButtonSignUp() {
    	signUpPage.clickButtonSignUp();
    }
    
    @Step("Then the title will be")
    public void titleWillBe(String title) {
        assertThat(signUpPage.getTitle()).containsIgnoringCase(title);
    }
}
