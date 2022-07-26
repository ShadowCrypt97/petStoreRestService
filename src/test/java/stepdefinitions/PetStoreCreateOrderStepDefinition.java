package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import models.ModelCreateOrderRest;
import models.ModelCreateUserRest;
import questions.LastResponseBody;
import questions.LastResponseBodyBoolean;
import task.CreateOrderRestTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetStoreCreateOrderStepDefinition {
    @DataTableType
    public ModelCreateOrderRest modelCreateOrderRest(Map<String, String> entry) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Date d = sdf.parse(entry.get("shipDate"));
        return new ModelCreateOrderRest(
                entry.get("id"),
                entry.get("petId"),
                entry.get("quantity"),
                output.format(d),
                entry.get("status"),
                entry.get("complete")
        );
    }
    @When("Registre una orden")
    public void registreUnaOrden(List<ModelCreateOrderRest> modelCreateOrderRestList) {
        theActorInTheSpotlight().attemptsTo(CreateOrderRestTask.with(modelCreateOrderRestList));
    }

    @And("Valido que la llave id {string} contenga {int}")
    public void validoQueLaLlaveContenga(String llave, int valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave, valor)));
    }

    @And("Valido que la llave petId {string} contenga {int}")
    public void validoQueLaLlavePetIdContenga(String llave, int valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave, valor)));

    }

    @And("Valido que la llave quantity {string} contenga {int}")
    public void validoQueLaLlaveQuantityContenga(String llave, int valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave, valor)));
    }

    @And("Valido que la llave shipDate {string} contenga {string}")
    public void validoQueLaLlaveShipDateContenga(String llave, String valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave, valor)));
    }

    @And("Valido que la llave status {string} contenga {string}")
    public void validoQueLaLlaveStatusContenga(String llave, String valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBody.has(llave, valor)));
    }

    @And("Valido que la llave complete {string} contenga {string}")
    public void validoQueLaLlaveCompleteContenga(String llave, String valor) {
        theActorInTheSpotlight().should(seeThat(LastResponseBodyBoolean.has(llave, Boolean.parseBoolean(valor))));
    }

}
