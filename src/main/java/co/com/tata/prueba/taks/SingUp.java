package co.com.tata.prueba.taks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.tata.prueba.model.DemoblaeData;
import static co.com.tata.prueba.userinterface.SingUpPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;
import java.util.Random;

public class SingUp implements Task {
    private List<DemoblaeData> demoblaeDataList;

    public  SingUp (List<DemoblaeData> demoblaeDataList) {
         this.demoblaeDataList = demoblaeDataList;
    }

    public static SingUp data(List<DemoblaeData> demoblaeData) {
        return Tasks.instrumented(SingUp.class,demoblaeData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random rand = new Random();
        int userName= (int)(Math.random()*100);
        String strname = demoblaeDataList.get(0).getStrname()+String.valueOf(userName);
        actor.attemptsTo(
                Click.on(BUTTON_SINGUP),
                Enter.theValue(strname).into(INPUT_USER),
                Enter.theValue(demoblaeDataList.get(0).getStrpass()).into(INPUT_PASSWORD),
                Click.on(BUTTON_SINGUP2),
                WaitUntil.the(BUTTON_SINGUP2,isVisible()).forNoMoreThan(30).seconds());
    }


}
