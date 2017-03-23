package co.ceiba.step.actor;

import co.ceiba.ui.actor.SyncPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheApplication implements Task {

	SyncPage syncPage;

    @Step("Open the application")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
                Open.browserOn().the(syncPage)
        );
	}
}
