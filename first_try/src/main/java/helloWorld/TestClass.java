package helloWorld;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;


/**
 * Created by bbencze on 2017.06.19..
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
/* Ensure directory has been created */
        new File("logs").mkdir();
/* Get the date to be used in the filename */
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        Date now = new Date();
        String date = df.format(now);
/* Set up the filename in the logs directory */
        String logFileName = "logs\\testlog-" + date + ".txt";
/* Set up Logger */
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger scjaLogger = Logger.getLogger("SCJA Logger");
        scjaLogger.setLevel(Level.ALL);
        scjaLogger.addHandler(myFileHandler);
/* Log Message */
        scjaLogger.info("\nThis is a logged information message.");
/* Close the file */
        myFileHandler.close();
    }


}
