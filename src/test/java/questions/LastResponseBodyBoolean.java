package questions;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matchers;

import java.util.Objects;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseBodyBoolean implements Question<ValidatableResponse> {

    private String llave;
    private Boolean valueBoolean;

    public LastResponseBodyBoolean(String llave, Boolean valueBoolean) {
        this.llave = llave;
        this.valueBoolean = valueBoolean;
    }

    public static LastResponseBodyBoolean has(String llave, boolean valueBoolean) {
        return new LastResponseBodyBoolean(llave,valueBoolean);
    }

    @Override
    public ValidatableResponse answeredBy(Actor actor) {
        return lastResponse().then().body(llave, Matchers.equalTo(valueBoolean));
    }
}
