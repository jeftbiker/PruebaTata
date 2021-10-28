package co.com.tata.prueba.taks;

import co.com.tata.prueba.model.DemoblaeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.tata.prueba.userinterface.AuthUserPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AuthUser implements Task {
    private List<DemoblaeData> demoblaeData;

    public AuthUser(List<DemoblaeData> demoblaeData) {
        this.demoblaeData = demoblaeData;
    }

    public static AuthUser is(List<DemoblaeData> demoblaeData){
        return Tasks.instrumented(AuthUser.class,demoblaeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> user = new HashMap<>();

        actor.attemptsTo(
                WaitUntil.the(BUTTON_LOGIN, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_LOGIN),
                Enter.theValue(demoblaeData.get(0).getStrname()).into(INPUT_USERNAME),
                Enter.theValue(demoblaeData.get(0).getStrpass()).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN));
        user.put("USERNAME",demoblaeData.get(0).getStrname());
        DemoblaeData.setResponseUser(user);


    }


}
