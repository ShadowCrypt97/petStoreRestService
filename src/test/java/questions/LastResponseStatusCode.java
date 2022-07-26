package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseStatusCode implements Question<Boolean>{
    private int value;
    public LastResponseStatusCode(int value) {
        this.value = value;
    }

    public static LastResponseStatusCode is(int value) {
        return new LastResponseStatusCode(value);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int response = lastResponse().getStatusCode();
        return response == value;
    }
}
