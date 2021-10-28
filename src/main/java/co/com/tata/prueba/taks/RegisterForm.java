package co.com.tata.prueba.taks;


import co.com.tata.prueba.model.DemoblaeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.tata.prueba.userinterface.FormPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterForm implements Task {
    private List<DemoblaeData> demoblaeData;

    public RegisterForm(List<DemoblaeData> demoblaeData) {
        this.demoblaeData = demoblaeData;
    }

    public static RegisterForm ofContact(List<DemoblaeData> demoblaeData) {
        return Tasks.instrumented(RegisterForm.class, demoblaeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CONTACT),
                Enter.theValue(demoblaeData.get(0).getStrEmail()).into(INPUT_CONTACTEMAIL),
                Enter.theValue(demoblaeData.get(0).getStrContactName()).into(INPUT_CONTACTNAME),
                Enter.theValue(demoblaeData.get(0).getStrMessagw()).into(INPUT_MESSAGE),
                Click.on(BUTTON_SENDMESSAGE),
                WaitUntil.the(BUTTON_CONTACT, isVisible()).forNoMoreThan(30).seconds()
        );
    }


}
