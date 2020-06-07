package dev.codestijl.yaml.config;

import lombok.Getter;
import lombok.Setter;

/**
 * Holds an address on an invoice.
 *
 * @author darren
 * @since 1.0.0
 */
@Getter
@Setter
public class Address {

    private String lines;
    private String city;
    private String state;
    private int postal;

    @Override
    public String toString() {
        return "Address{" +
                "lines='" + lines + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postal=" + postal +
                '}';
    }
}
