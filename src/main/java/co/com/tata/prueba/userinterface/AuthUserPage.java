package co.com.tata.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthUserPage extends PageObject {
    public static final  Target BUTTON_LOGIN = Target.the("Click on Login option")
            .located(By.xpath("//a[contains(text(),'Log in')]"));

    public static final Target INPUT_USERNAME=Target.the("Enter user name")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target INPUT_PASSWORD=Target.the("Enter password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN=Target.the("Click on Button log in")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target QUESTION=Target.the("Question for user in the authentication")
            .located(By.xpath("//a[@id='nameofuser']"));
}
