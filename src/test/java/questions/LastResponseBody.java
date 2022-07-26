package questions;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matchers;

import java.util.Objects;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseBody implements Question<ValidatableResponse> {
    private String llave;
    private String stringValue;
    private int value;
    public LastResponseBody(String llave, int value) {
        this.llave = llave;
        this.value = value;
    }
    public LastResponseBody(String llave, String stringValue) {
        this.llave = llave;
        this.stringValue = stringValue;
    }
    public static LastResponseBody has(String llave, String stringValue) {
        return new LastResponseBody(llave,stringValue);
    }

    public static LastResponseBody has(String llave, int value) {
        return new LastResponseBody(llave,value);
    }

    @Override
    public ValidatableResponse answeredBy(Actor actor) {
        return lastResponse().then().body(llave, Matchers.equalTo(Objects.requireNonNullElseGet(stringValue, () -> value)));
    }
}
