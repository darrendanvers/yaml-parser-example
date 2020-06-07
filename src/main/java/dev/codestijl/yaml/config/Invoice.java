package dev.codestijl.yaml.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * An invoice meant to be read from a YAML file.
 *
 * @author darren
 * @since 1.0.0
 */
@Getter
@Setter
public final class Invoice {

    @JsonProperty("invoice")
    private int invoiceNumber;

    private LocalDate date;
    private BigDecimal tax;
    private BigDecimal total;
    private String comments;

    @JsonProperty("bill-to")
    private Person billTo;

    @JsonProperty("ship-to")
    private Person shipTo;

    @Setter(AccessLevel.NONE)
    @JsonProperty("product")
    private final List<Product> products = new LinkedList<>();

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", date=" + date +
                ", tax=" + tax +
                ", total=" + total +
                ", billTo=" + billTo +
                ", shipTo=" + shipTo +
                ", comments='" + comments + '\'' +
                ", products=" + listToString(products) +
                '}';
    }

    private static String listToString(final List<?> list) {

        final StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
        list.stream()
                .map(l -> String.format("'%s'", l))
                .forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
