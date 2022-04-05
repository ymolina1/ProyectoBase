package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddAddressPage;
import co.com.choucair.certification.proyectobase.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;


public class StepTwo implements Task {
    private AddAddressPage addAddress;

    public static StepTwo AddAddress() {
        return Tasks.instrumented(StepTwo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(//Click.on(AddAddressPage.SELECT_COUNTRY),
                //SelectFromOptions.byVisibleText("Cali").from(AddAddressPage.INPUT_CITY),
                //Enter.theValue("Cali").into(AddAddressPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                //SelectFromOptions.byVisibleText("Cali").from(AddAddressPage.INPUT_CITY),//se cierra
                //SelectFromOptions.byVisibleText("Colombia").from(AddAddressPage.INPUT_COUNTRY),
                //Enter.theValue("760001").into(AddAddressPage.INPUT_ZIP)
                Click.on(AddAddressPage.NEXT_BUTTON)
                );
    }
}
