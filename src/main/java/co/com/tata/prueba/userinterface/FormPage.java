package co.com.tata.prueba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormPage extends PageObject {
    public static final Target BUTTON_CONTACT=Target.the("Click in contact option")
            .located(By.xpath("//a[contains(text(),'Contact')]"));

    public static final Target INPUT_CONTACTEMAIL=Target.the("Enter a contact email")
            .located(By.xpath("//input[@id='recipient-email']"));

    public static final Target INPUT_CONTACTNAME=Target.the("Enter a contact name")
            .located(By.xpath("//input[@id='recipient-name']"));

    public static final Target INPUT_MESSAGE=Target.the("Enter a message")
            .located(By.xpath("//textarea[@id='message-text']"));

    public static final Target BUTTON_SENDMESSAGE=Target.the("Click in contact button")
            .located(By.xpath("//button[contains(text(),'Send message')]"));
}
