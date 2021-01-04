package properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DatabaseConfiguration {

    private String host;
    private int port;
    private String schema;
    private final String fileEncoding = "UTF-8";
    private Properties properties = new Properties();

    public DatabaseConfiguration() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("properties/db.properties")))){
            properties.load(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file, ");
        }
    }

    public DatabaseConfiguration(File file) {
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(file.toPath()))){
            properties.load(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    public String getHost() {
        return properties.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(properties.getProperty("db.port"));
    }

    public String getSchema() {
        return properties.getProperty("db.schema");
    }
}
