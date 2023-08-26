package com.mycompany.utility;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigUtility implements ApacheCommons {


    @Override
    public void evaluate() {

        try {

            String path = System.getProperty("user.dir") +
                    System.getProperty("file.separator");

            Configurations configs = new Configurations();
            FileBasedConfigurationBuilder<?> builder =
                    configs.propertiesBuilder(path+"config.properties");
            Configuration config = builder.getConfiguration();

            String appName = config.getString("app.name");
            int maxUser = config.getInt("app.max.users");
            boolean debugMode = config.getBoolean("app.debug.mode");

            System.out.println("App Name: " + appName);
            System.out.println("Max User: " + maxUser);
            System.out.println("Debug Mode: " + debugMode);
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

}
