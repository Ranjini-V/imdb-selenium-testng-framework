package com.imdb.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

public class ConfigManager {

   private static final Logger log = LogManager.getLogger(ConfigManager.class);
    private static final Properties props = new Properties();
    private static ConfigManager configInstance;


    private ConfigManager(){
        String env = System.getProperty("env", "qa");

    }



}
