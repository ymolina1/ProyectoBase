package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.JoinTodayPage;
import co.com.choucair.certification.proyectobase.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UTestPage uTestPage;
    public static OpenUp thePage() {//Era Perfomable y se cambia a OpenUp que es la clase
        return Tasks.instrumented (OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Se ejecutan acciones de clics, ingreso, las selecciones , etc
        actor.attemptsTo(Open.browserOn(uTestPage), Click.on(UTestPage.JOIN_TODAY));

    }
}
