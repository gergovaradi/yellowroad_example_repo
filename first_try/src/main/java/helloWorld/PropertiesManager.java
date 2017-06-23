package helloWorld;

import java.util.Properties;
public class PropertiesManager {
    public static void main(String[] args) {
        Properties props = System.getProperties();
/* New property example */
        props.setProperty("new_property2", "new_value2");
        if (args[0].equals("-list_all")) {
            props.list(System.out); // Lists all properties
        } else if (args[0].equals("-list_prop")) {
/* Lists value */
            System.out.println(props.getProperty(args[1]));
        } else {
            System.out.println("Usage: java PropertiesManager [-list_all]");
                    System.out.println(" java PropertiesManager [-list_prop [property]]");
        }
    }
}
