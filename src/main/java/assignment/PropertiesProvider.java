package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {
    public static final Properties PROPS;

    static{
        PROPS = new Properties();
        try {
            /* krever at du har lagret opplysningene i 'files/world.properties' so følgt :
            * host=localhost
            * db_name=world
            * port=3306
            * uname=<username>  -- her setter du din brukernavn
            * pwd=<password> -- her setter du passordet ditt
             */
            PROPS.load(new FileInputStream("files/world.properties"));
        } catch (IOException e) {
            System.out.println("Unable to load properties:"+e.getMessage());
        }
    }
}
