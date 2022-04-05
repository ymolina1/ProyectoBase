package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LastStepPage extends PageObject {
    public static final Target INPUT_PASS = Target.the("Where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM = Target.the("Where do we write the password confirmation")
            .located(By.id("confirmPassword"));
    public static final Target NEXT_BUTTON = Target.the("Where do we continue")
            .located(By.id("laddaBtn"));


}
