package design.pattern.singleton;

import java.util.logging.Logger;

public class SingletonApp {


    static Logger logger = Logger.getLogger(SingletonApp.class.getName());


    public static void main(String[] args) {

        logger.info("Testing Singleton instance...");

        Singleton instance1 = Singleton.getInstance("FOO");
        Singleton instance2 = Singleton.getInstance("BAR");

        if (instance1 == instance2) {
            logger.info("Same Singleton instance re-used");
        } else {
            logger.warning("Different instance detected!");
        }

        logger.info("Singleton Value: " + instance1);
    }


}
