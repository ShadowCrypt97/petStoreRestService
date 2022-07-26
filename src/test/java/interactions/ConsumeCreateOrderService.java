package interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeCreateOrderService {

    public ConsumeCreateOrderService() {
    }

    public static WhitPostOrder withPost(String body) {
        return Tasks.instrumented(WhitPostOrder.class,body);
    }
}
