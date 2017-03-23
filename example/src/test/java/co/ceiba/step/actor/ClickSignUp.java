package co.ceiba.step.actor;

import co.ceiba.ui.actor.ButtonSignUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClickSignUp implements Task {

    @Step("click in sign up button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ButtonSignUp.BUTTON_SIGN_UP)
        );
    }
}
