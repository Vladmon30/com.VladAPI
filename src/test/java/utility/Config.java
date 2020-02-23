package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    private static Properties pro;

    static{
        String path = "config.properties";
        try {
// take the location of config.properties folder as a constructor
            FileInputStream file = new FileInputStream(path);
// FileInputStream file = new FileInputStream(config.properties);   ---> same

//  read value inside config.property like key-->value
            pro = new Properties();

//load the properties from inputstream
            pro.load(file);

// close inputstream
            file.close();

        } catch (Exception e) {
            System.out.println("Path: " + path + " - not found.");
        }
    }

    public static String getProperty(String property){

        return pro.getProperty(property);
    }


}
