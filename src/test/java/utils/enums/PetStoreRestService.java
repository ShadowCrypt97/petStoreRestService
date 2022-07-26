package utils.enums;

public enum PetStoreRestService {
    BASE_URL("https://petstore.swagger.io/v2"),
    CREATE_USER("/user"),
    CREATE_ORDER("/store/order");

    private String uri;
    PetStoreRestService(String uri) {
        this.uri = uri;
    }
    @Override
    public String toString() {
        return uri;
    }
}
