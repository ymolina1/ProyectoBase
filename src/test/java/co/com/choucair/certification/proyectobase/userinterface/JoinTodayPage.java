package co.com.choucair.certification.proyectobase.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("Where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTN = Target.the("Where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("Where do we write the email address")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Where do we write the birth month")
            .located(By.xpath("//*[contains(text(),'May')]"));
    public static final Target INPUT_DAY = Target.the("Where do we write the birth day")
            .located(By.xpath("//option[18]"));
    public static final Target INPUT_YEAR = Target.the("Where do we write the birth year")
            .located(By.cssSelector("select#birthYear option:nth-of-type(20)"));
    public static final Target NEXT_BUTTON = Target.the("Where do we continue")
            .located(By.xpath("//*[contains(text(),'Next: Location')]"));
}
