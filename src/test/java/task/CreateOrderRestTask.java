package task;

import interactions.ConsumeCreateOrderService;
import models.ModelCreateOrderRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateOrderRestTask implements Task {

    private List<ModelCreateOrderRest> modelCreateOrderRestList;

    public CreateOrderRestTask(List<ModelCreateOrderRest> modelCreateOrderRestList) {
        this.modelCreateOrderRestList = modelCreateOrderRestList;
    }

    public static CreateOrderRestTask with(List<ModelCreateOrderRest> modelCreateOrderRestList) {
        return Tasks.instrumented(CreateOrderRestTask.class,modelCreateOrderRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeCreateOrderService.withPost(modelCreateOrderRestList.get(0).toString()));
    }
}
