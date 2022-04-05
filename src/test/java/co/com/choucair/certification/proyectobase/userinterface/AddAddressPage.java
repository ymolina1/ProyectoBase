package co.com.choucair.certification.proyectobase.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddAddressPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("Where do we write the City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Where do we write the zip")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Where do we write the City")
            .located(By.xpath("//*[contains(text(),'Select a country')]"));
    public static final Target INPUT_COUNTRY = Target.the("Where do we write the City")
            .located(By.xpath("//*[contains(text(),'Colombia')]"));
    public static final Target NEXT_BUTTON = Target.the("Where do we continue")
            .located(By.xpath("//*[contains(text(),'Next: Devices')]"));
}
