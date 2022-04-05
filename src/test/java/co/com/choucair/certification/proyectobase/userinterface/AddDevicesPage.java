package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddDevicesPage extends PageObject {
    public static final Target INPUT_MOBILE = Target.the("Where do we write the mobile")
            .located(By.xpath("//*[contains(text(),'Select Brand')]"));
    public static final Target INPUT_MOBIL = Target.the("Where do we write the mobile")
            .located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse open\n']"));
    public static final Target NEXT_BUTTON = Target.the("Where do we continue")
            .located(By.xpath("//*[contains(text(),'Next: Last Step')]"));
}
