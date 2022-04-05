package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com")
public class UTestPage extends PageObject {
    public static final Target JOIN_TODAY = Target.the("Button that shows us the form to register")
            .located(By.xpath("//*[contains(text(),'Join Today')]"));


}
