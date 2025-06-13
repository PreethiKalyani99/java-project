package org.example.properties;

import java.util.Iterator;
import java.util.Properties;

public class PropertiesTryOut {
    private final Properties properties;

    public PropertiesTryOut() {
        properties = new Properties();
    }

    public void setProperty (String key, String value) {
        properties.setProperty(key, value);
    }

    public String getProperty (String key) {
        return properties.getProperty(key);
    }

    public void removeProperty (String key) {
        properties.remove(key);
    }

    public void printProperties () {

        for (Object o : properties.keySet()) {
            String key = (String) o;
            String value = properties.getProperty(key);

            System.out.printf("%s : %s%n", key, value);
        }
    }
}
