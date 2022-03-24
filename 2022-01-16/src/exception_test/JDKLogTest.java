package exception_test;

import java.util.logging.Logger;

/**
 * 日志级别：
 * SEVERE
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 */
public class JDKLogTest {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process");
        logger.warning("memory is running out");
        logger.fine("ignored");
        logger.severe("process will be terminated...");
    }
}
