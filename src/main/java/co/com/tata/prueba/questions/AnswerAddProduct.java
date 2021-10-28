package co.com.tata.prueba.questions;

import co.com.tata.prueba.model.DemoblaeData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerAddProduct implements Question<Boolean> {
    private String strAns;

    public AnswerAddProduct(String strAns) {
        this.strAns = strAns;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        String question = DemoblaeData.getResponseCart().toString().substring(9).replace("}", "");
        result= strAns.contains(question);

        return result;
    }

    public static AnswerAddProduct is(String strAns){
        return new AnswerAddProduct(strAns);
    }
}
