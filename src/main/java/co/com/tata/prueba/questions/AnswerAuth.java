package co.com.tata.prueba.questions;

import co.com.tata.prueba.model.DemoblaeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tata.prueba.userinterface.AuthUserPage.QUESTION;

public class AnswerAuth implements Question<Boolean> {
    boolean result=false;

    @Override
    public Boolean answeredBy(Actor actor) {
        String user_name= "Welcome "+ DemoblaeData.getResponseUser().toString().substring(10).replace("}","");
        String question= Text.of(QUESTION).viewedBy(actor).asString();
        result=user_name.contains(question);



        return result;
    }

    public static AnswerAuth is(){
        return new AnswerAuth();
    }
}
