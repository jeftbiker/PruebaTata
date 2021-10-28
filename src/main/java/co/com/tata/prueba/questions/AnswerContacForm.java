package co.com.tata.prueba.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerContacForm implements Question<Boolean> {
    private String strWord;

    public AnswerContacForm(String strWord) {
        this.strWord = strWord;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String question="Thanks for the message!!";
        result = strWord.contains(question);

        return result;
    }

    public static AnswerContacForm is(String strWord){
        return new AnswerContacForm(strWord);
    }
}
