package co.com.tata.prueba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddProductPage extends PageObject {
    public static final Target BUTTON_LOGIN=Target.the("Click in log in option")
            .located(By.xpath("//a[contains(text(),'Log in')]"));

    public static final Target INPUT_USERNAME=Target.the("Enter user name")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target INPUT_PASSWORD=Target.the("Enter password")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BTN_LOGIN=Target.the("Click in Button log in")
            .located(By.xpath("//button[contains(text(),'Log in')]"));

    public static final Target BUTTON_LAPTOPS =Target.the("Click in Laptops options")
            .located(By.xpath("//a[@id='itemc'][2]"));

    public static final Target BUTTON_MACBOOK =Target.the("Click in Macbook Pro option")
            .located(By.xpath("//a[contains(text(),'MacBook Pro')]"));

    public static final Target BUTTON_ADDCART =Target.the("Click add product to cart")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));

    public static final Target BUTTON_CART =Target.the("Click product to cart")
            .located(By.xpath("//a[contains(text(),'Cart')]"));

    public static final Target QUESTIONS_CART =Target.the("Question product to cart")
            .located(By.xpath("//td[contains(text(),'MacBook Pro')]"));

    public static final Target DELETE_PRODUCT =Target.the("Delete product of cart")
            .located(By.xpath("//a[contains(text(),'Delete')]"));


}
