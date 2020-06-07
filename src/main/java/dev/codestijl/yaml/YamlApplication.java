package dev.codestijl.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dev.codestijl.yaml.config.Invoice;

import java.io.IOException;
import java.io.InputStream;

/**
 * Application driver class.
 *
 * @since 1.0.0
 * @author darren
 */
// This is a sample application I want to print the out put to the command line
// and get a stacktrace of any errors.
@SuppressWarnings({"PMD.SystemPrintln", "PMD.AvoidPrintStackTrace"})
public final class YamlApplication {

    /**
     * Executes the application.
     *
     * @param args Command line arguments.
     */
    public static void main(final String...args) {

        final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        // You need this for LocalDate.
        objectMapper.registerModule(new JavaTimeModule());

        try {
            final InputStream inputStream = YamlApplication.class.getResourceAsStream("/invoice.yaml");
            final Invoice invoice = objectMapper.readValue(inputStream, Invoice.class);
            System.out.println(invoice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private YamlApplication() {
        // Intentionally empty.
    }
}
