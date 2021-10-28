package co.com.tata.prueba.taks;

import co.com.tata.prueba.model.DemoblaeData;
import co.com.tata.prueba.userinterface.AddProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tata.prueba.userinterface.AddProductPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProduct implements Task {
    private List<DemoblaeData> demoblaeData;

    public AddProduct(List<DemoblaeData> demoblaeData) {
        this.demoblaeData = demoblaeData;
    }

    public static AddProduct macbook(List<DemoblaeData> dataLists) {
        return Tasks.instrumented(AddProduct.class, dataLists);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> user = new HashMap<>();
        actor.attemptsTo(
                WaitUntil.the(BUTTON_LOGIN, isVisible()),
                Click.on(BUTTON_LOGIN),
                Enter.theValue(demoblaeData.get(0).getStrname()).into(INPUT_USERNAME),
                Enter.theValue(demoblaeData.get(0).getStrpass()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
        actor.attemptsTo(
                WaitUntil.the(BUTTON_LAPTOPS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_LAPTOPS),
                Scroll.to(BUTTON_MACBOOK),
                Click.on(BUTTON_MACBOOK),
                Click.on(BUTTON_ADDCART)
        );
        actor.attemptsTo(
                Click.on(BUTTON_CART)
        );
        user.put("PRODUCT", Text.of(QUESTIONS_CART).viewedBy(actor).asString());
        DemoblaeData.setResponseCart(user);

        actor.attemptsTo(
                Click.on(DELETE_PRODUCT)
        );

    }


}
