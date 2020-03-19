package config;

import java.io.IOException;

public class Configuration {

    public static String getBrowser() throws IOException {
        return PropertiesFile.getProperty("browser");
    }

    public static String getURL(){
        try {
            return PropertiesFile.getProperty("URL");
        }
        catch(Exception ex) {
            return null;
        }
    }

}
