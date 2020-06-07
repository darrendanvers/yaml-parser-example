package dev.codestijl.yaml.config;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a product that can be placed on an invoice.
 *
 * @author darren
 * @since 1.0.0
 */
@Getter
@Setter
public class Product {

    private String sku;
    private int quantity;
    private String description;
    private BigDecimal price;

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
