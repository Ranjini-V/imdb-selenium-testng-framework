package com.imdb.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties properties = new Properties();

    private ConfigReader() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    static {
        try (InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (inputStream == null) {
                throw new RuntimeException("config.properties not found in classpath");
            }
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }

    }

    public static String getProperty(String key) {

        String value = properties.getProperty(key);

        if (value == null || value.trim().isEmpty()) {
            throw new RuntimeException("Property " + key + " is missing or empty in config.properties");
        }

        return value;
    }

}
