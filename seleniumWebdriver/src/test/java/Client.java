import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by jitendra on 30/5/17.
 */
public class Client {

    static Logger l = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

        String log4jConfPath = "src/test/java/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        // Logger example without log4j.properties

        /*Layout l1 = new SimpleLayout();
        Appender a;
        try
        {
            a = new FileAppender(l1,"my.txt", false);

            // 3rd parameter is true by default
            // true = Appends the data into my.txt
            // false = delete previous data and re-write

            l.addAppender(a);
        }
        catch(Exception e) {}

        l.fatal("This is the error message..");
        l.info("hi");
        System.out.println("Your logic executed successfully....");*/


        // Logger example with log4j.properties

        l.debug("This is debug message");
        l.info("This is info message");
        l.warn("This is warn message");
        l.fatal("This is fatal message");
        l.error("This is error message");

        System.out.println("Your logic executed successfully....");

    }
}
