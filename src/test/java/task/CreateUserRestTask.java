package task;

import interactions.ConsumeCreateUserService;
import models.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateUserRestTask implements Task {
    private List<ModelCreateUserRest> modelCreateUserRestList;

    public CreateUserRestTask(List<ModelCreateUserRest> modelCreateUserRestList) {
        this.modelCreateUserRestList = modelCreateUserRestList;
    }

    public static CreateUserRestTask with(List<ModelCreateUserRest> modelCreateUserRestList) {
        return Tasks.instrumented(CreateUserRestTask.class,modelCreateUserRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeCreateUserService.whitPost(modelCreateUserRestList.get(0).toString()));
    }
}
