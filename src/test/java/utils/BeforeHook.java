package utils;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.enums.PetStoreRestService.BASE_URL;

public class BeforeHook {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Sergio").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
