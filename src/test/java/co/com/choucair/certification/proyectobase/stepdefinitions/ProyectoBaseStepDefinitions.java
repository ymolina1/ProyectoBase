package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ProyectoBaseStepDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^than user wants to register$")
    public void thanUserWantsToRegister() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage());
    }

    @When("^he starts setting up his account$")
    public void heStartsSettingUpHisAccount()throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("user").attemptsTo(StepOne.Tellus());
        OnStage.theActorCalled("user").attemptsTo(StepTwo.AddAddress());
        OnStage.theActorCalled("user").attemptsTo(StepThree.AddDevices());

    }

    @Then("^he completed settup$")
    public void heCompletedSettup() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("user").wasAbleTo(LastStep.AddPass());
    }

}