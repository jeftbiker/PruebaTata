package co.com.tata.prueba.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;



public class AnswerSingUp implements Question<Boolean> {
    boolean result=false;
    @Override
    public Boolean answeredBy(Actor actor) {
        String user_register="Sing Up succesfull.";
        String text_alert =BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        result=user_register.contains(text_alert);
        return result;
    }

    public static AnswerSingUp is(){
        return new AnswerSingUp() ;


    }
}
