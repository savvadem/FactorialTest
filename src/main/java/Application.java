import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Application {


    private static final Logger logger = Logger.getLogger(Factorial.class.getName());

    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Provide factorial value...");
            return;
        }
        try {
            Integer factorial = Integer.valueOf(args[0]);
            logger.info("Zero count in the end " + new Factorial().countFactorialZero(factorial));
        } catch (NumberFormatException e)
        {
            logger.severe("Illegal argument. Must be integer value");
        }

    }
}
