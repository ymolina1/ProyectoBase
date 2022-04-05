package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepOne implements Task {
    private JoinTodayPage joinTodayPage;

    private String strName;
    private String strLastN;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;




    public static StepOne Tellus() {
        return Tasks.instrumented(StepOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Se llama a la interfaz donde esta el boton
        actor.attemptsTo(Click.on(JoinTodayPage.NEXT_BUTTON),
                Enter.theValue("Yehiner").into(JoinTodayPage.INPUT_NAME),
                Enter.theValue("Molina").into(JoinTodayPage.INPUT_LASTN),
                Enter.theValue("ymailm@gmail.com").into(JoinTodayPage.INPUT_MAIL),
                Click.on(JoinTodayPage.INPUT_MONTH),
                Click.on(JoinTodayPage.INPUT_DAY),
                Click.on(JoinTodayPage.INPUT_YEAR),
                //Click.on(JoinTodayPage.INPUT_YEAR),
                //Enter.theValue("IngresaLenguage").into(JoinTodayPage.INPUT_LANGUAGE),
                Click.on(JoinTodayPage.NEXT_BUTTON)
                );

    }
}
