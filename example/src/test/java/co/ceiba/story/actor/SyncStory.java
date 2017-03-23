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

import co.ceiba.step.actor.ClickSync;
import co.ceiba.step.actor.OpenTheApplication;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SyncStory {
	
	Actor juan = Actor.named("Juan");

    @Steps
    OpenTheApplication openTheApplication;
    
    @Steps
    ClickSync clickSync;

    @Managed(driver="chrome")
    WebDriver browser;
    
    @Before
    public void annaCanBrowseTheWeb() {
        juan.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void shouldBeAbleToClickToTheOptionSync() {
    	 givenThat(juan).wasAbleTo(openTheApplication);
    	 when(juan).attemptsTo(clickSync);
    	 then(juan).should(eventually(seeThat(TheWebPage.title(), containsString("Familia"))));
    }
}
