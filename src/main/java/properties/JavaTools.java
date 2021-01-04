package properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class JavaTools {

    private Properties properties = new Properties();

    public JavaTools() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("properties/javatools.properties")))){
            properties.load(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    public String getUrl(String urlName) {
        return properties.getProperty(urlName + ".url");
    }

    public String getName(String keyName) {
        return properties.getProperty(keyName + ".name");
    }

    public Set<String> getToolKeys() {
        Set<String> names = new HashSet<>();
        for (String key: properties.stringPropertyNames()) {
            names.add(key.substring(0, key.indexOf('.')));
            /* ez miért nem működik?
            names.add(key.split(".")[0]);
            String[] namess = key.split(".");
            */
        }
        return names;
    }

    public Set<String> getTools() {
        Set<String> names = new HashSet<>();
        for (String key: properties.stringPropertyNames()) {
            if (key.contains("name")) {
                names.add(properties.getProperty(key));
            }
        }
        return names;
    }
}
