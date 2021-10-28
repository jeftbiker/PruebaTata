package co.com.tata.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SingUpPage extends PageObject {
    public static final Target BUTTON_SINGUP = Target.the("Select singup option")
            .located(By.xpath("//li[@class='nav-item']//a[@id='signin2']"));

    public static final Target INPUT_USER = Target.the("Enter user name")
            .located(By.xpath("//div[@class='form-group']//input[@id='sign-username']"));

    public static final Target INPUT_PASSWORD = Target.the("Enter password")
            .located(By.xpath("//div[@class='form-group']//input[@id='sign-password']"));

    public static final Target BUTTON_SINGUP2 = Target.the("click on singup button")
            .located(By.xpath("//div[@class='modal-content']//div[@class='modal-footer']" +
                    "//button[@class='btn btn-primary']"));
}
