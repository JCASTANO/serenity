package co.ceiba.story.actor;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import co.ceiba.step.actor.ClickSignUp;
import co.ceiba.step.actor.OpenTheApplication;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SignUpStory {
	
	Actor juan = Actor.named("Juan");

    @Steps
    OpenTheApplication openTheApplication;
    
    @Steps
    ClickSignUp clickSignUp;

    @Managed(driver="chrome")
    WebDriver browser;
    
    @Before
    public void juanCanBrowseTheWeb() {
        juan.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void shouldBeAbleToClickToTheOptionSignUp() {
    	 givenThat(juan).wasAbleTo(openTheApplication);
    	 when(juan).attemptsTo(clickSignUp);
    	 then(juan).should(eventually(seeThat(TheWebPage.title(), containsString("Join GitHub · GitHub"))));
    }
}
