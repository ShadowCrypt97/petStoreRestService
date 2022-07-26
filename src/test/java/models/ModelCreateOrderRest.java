package models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ModelCreateOrderRest {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private Boolean complete;

    public ModelCreateOrderRest(String id, String petId, String quantity, String shipDate, String status, String complete) {
        this.id = Integer.parseInt(id);
        this.petId = Integer.parseInt(petId);
        this.quantity = Integer.parseInt(quantity);
        this.shipDate = shipDate;
        this.status = status;
        this.complete = Boolean.parseBoolean(complete);
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"petId\":" + petId  +
                ", \"quantity\":" + quantity  +
                ", \"shipDate\":\"" + shipDate + '\"' +
                ", \"status\":\"" + status + '\"' +
                ", \"complete\":\"" + complete + '\"' +
                '}';
    }
}
