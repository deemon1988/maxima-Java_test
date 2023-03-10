package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    private String firstName;
    private String lastName;
    private String alias;
    private int age;
    @JsonProperty("isMale")
    private boolean isMale;
    private Address address;

    @Override
    public String toString() {
        return "Person[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", address=" + address +
                ']';
    }
}
