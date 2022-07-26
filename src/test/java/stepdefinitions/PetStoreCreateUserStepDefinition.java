package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ModelCreateUserRest;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.LastResponseBody;
import questions.LastResponseStatusCode;
import task.CreateUserRestTask;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.Constants.CREATED;
import static utils.Constants.OK;

public class PetStoreCreateUserStepDefinition {

    @DataTableType
    public ModelCreateUserRest modelCreateUserRest(Map<String, String> entry) {
        return new ModelCreateUserRest(
                entry.get("id"),
                entry.get("username"),
                entry.get("firstName"),
                entry.get("lastname"),
                entry.get("email"),
                entry.get("password"),
                entry.get("phone")
        );
    }
    @When("Registre un usuario")
    public void registreUnUsuario(List<ModelCreateUserRest> modelCreateUserRestList) {
        theActorInTheSpotlight().attemptsTo(CreateUserRestTask.with(modelCreateUserRestList));
    }

    @Then("Valida que el codigo de status sea ok")
    public void deboVerElUsuarioCreadoExitosamente() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(OK)));
    }
    @And("Valido que la llave {string} contenga {int}")
    public void validoQueLaLlaveStatusContenga(String llave, int value) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave,value)));
    }

    @And("Valido que la llave type {string} contenga {string}")
    public void validoQueLaLlaveTypeContenga(String llave, String value) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave,value)));
    }

    @And("Valido que la llave message {string} contenga {string}")
    public void validoQueLaLlaveMessageContenga(String llave, String value) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave,value)));
    }


}
