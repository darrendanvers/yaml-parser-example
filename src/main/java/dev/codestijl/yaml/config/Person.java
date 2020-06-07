package dev.codestijl.yaml.config;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a person who can be billed or shipped something.
 *
 * @author darren
 * @since 1.0.0
 */
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "personId")
public class Person {

    private String personId;
    private String given;
    private String family;
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", given='" + given + '\'' +
                ", family='" + family + '\'' +
                ", address=" + address +
                '}';
    }
}
