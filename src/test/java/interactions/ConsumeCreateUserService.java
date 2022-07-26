package interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeCreateUserService {
    public ConsumeCreateUserService(){

    }
    public static WhitPostUser whitPost(String body){
        return Tasks.instrumented(WhitPostUser.class,body);
    }
}
