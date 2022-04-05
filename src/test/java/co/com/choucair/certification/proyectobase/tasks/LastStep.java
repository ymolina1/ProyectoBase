package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddAddressPage;
import co.com.choucair.certification.proyectobase.userinterface.JoinTodayPage;
import co.com.choucair.certification.proyectobase.userinterface.LastStepPage;
import co.com.choucair.certification.proyectobase.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastStep implements Task {
    public static LastStep AddPass() {
        return Tasks.instrumented(LastStep.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("FelizMente2011_").into(LastStepPage.INPUT_PASS),
                Enter.theValue("FelizMente2011_").into(LastStepPage.INPUT_CONFIRM),
                Click.on(LastStepPage.NEXT_BUTTON)
                );
    }
}
