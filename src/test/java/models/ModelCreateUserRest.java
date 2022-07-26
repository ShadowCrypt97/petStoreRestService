package models;

import io.cucumber.java.DataTableType;
import lombok.Data;

import java.util.Map;

@Data
public class ModelCreateUserRest {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

    public ModelCreateUserRest(String id, String username, String firstName, String lastName, String email, String password, String phone) {
        this.id = Integer.parseInt(id);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"username\":\"" + username +'\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"email\":\"" + email + '\"' +
                ", \"password\":\"" + password + '\"' +
                ", \"phone\":\"" + phone + '\"' +
                '}';
    }

}
