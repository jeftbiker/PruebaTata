package co.com.tata.prueba.stepdefinitions;


import co.com.tata.prueba.model.DemoblaeData;
import co.com.tata.prueba.questions.*;
import co.com.tata.prueba.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PortalDemoblazeStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than (.*) wants to register at Demoblaze portal$")
    public void thanGustavoWantsToRegisterAtDemoblazePortal(String Gustavo)  {
       theActorCalled(Gustavo).wasAbleTo(OpenUp.thePage());
                //SingUp.data(demoblaeData.get(0).getStrname(), demoblaeData.get(0).getStrpass()));
    }


    @When("^he complete all data for register$")
    public void heCompleteAllDataForRegister(List<DemoblaeData> demoblaeData) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(SingUp.data(demoblaeData));
    }

    @When("^the user all data for auth$")
    public void theUserAllDataForAuth(List<DemoblaeData> demoblaeData) {
        theActorInTheSpotlight().attemptsTo(AuthUser.is(demoblaeData));

    }
    @When("^the user selects the product$")
    public void theUserSelectsTheProduct(List<DemoblaeData> demoblaeData) {
        theActorInTheSpotlight().attemptsTo(AddProduct.macbook(demoblaeData));

    }

    @When("^the user register data in form$")
    public void theUserRegisterDataInForm(List<DemoblaeData> demoblaeData) {
            theActorInTheSpotlight().attemptsTo(RegisterForm.ofContact(demoblaeData));
    }

    @Then("^can see the message (.*)$")
    public void canSeeTheMessageThanksForTheMessage(String word) {
        theActorInTheSpotlight().should(seeThat(AnswerContacForm.is(word)));
    }

    @Then("^can see a succesfull registration message$")
    public void canSeeASuccesfullRegistrationMessage() {
        theActorInTheSpotlight().should(seeThat(AnswerSingUp.is()));

    }



    @Then("^can see the auth user$")
    public void canSeeTheAuthUser()  {
        theActorInTheSpotlight().should(seeThat(AnswerAuth.is()));

    }



    @Then("^can check the product MacBook Pro in the cart$")
    public void canCheckTheProductMacBookProInTheCart(String word) {
        theActorInTheSpotlight().should(seeThat(AnswerAddProduct.is(word)));

    }


}
