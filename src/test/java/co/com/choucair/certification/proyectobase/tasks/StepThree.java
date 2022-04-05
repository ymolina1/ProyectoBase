package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddAddressPage;
import co.com.choucair.certification.proyectobase.userinterface.AddDevicesPage;
import co.com.choucair.certification.proyectobase.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class StepThree implements Task {
    public static StepThree AddDevices() {
        return Tasks.instrumented(StepThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//Enter.theValue("Alcatel").into(AddDevicesPage.INPUT_MOBILE),
                //Enter.theValue("Alcatel").into(AddDevicesPage.INPUT_MOBILE),
                //Click.on(AddDevicesPage.INPUT_MOBILE),
                //Enter.theValue("Alcatel").into(AddDevicesPage.INPUT_MOBIL).thenHit(Keys.ENTER),

                Click.on(AddDevicesPage.NEXT_BUTTON));
    }
}
