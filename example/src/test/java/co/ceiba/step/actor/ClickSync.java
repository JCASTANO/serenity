package co.ceiba.step.actor;

import co.ceiba.ui.actor.ButtonSync;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClickSync implements Task {

    @Step("click in sync button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonSync.BUTTON_SYNC)
        );
    }
}
