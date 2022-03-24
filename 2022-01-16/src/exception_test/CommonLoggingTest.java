package exception_test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * commons logging日志级别：
 * FATAL
 * ERROR
 * WARNING
 * INFO
 * DEBUG
 * TRACE
 */
public class CommonLoggingTest {

    static final Log log = LogFactory.getLog(CommonLoggingTest.class);

    public static void main(String[] args) {
        log.fatal("abc");
        log.error("bcd", new IllegalArgumentException());
//        log.warn("xxx");
//        log.info("aaa");
//        log.debug("bbb");
//        log.trace("cccc");
    }

}
