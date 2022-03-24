package exception_test;

import oop.ExtendTest;

public class SelfExceptionTest {

    public static void main(String[] args) {
        TestException.useException();
    }
}

class SelfException extends RuntimeException {
    public SelfException() {
        super();
    }

    public SelfException(String message, Throwable cause) {
        super(message, cause);
    }

    public SelfException(String message) {
        super(message);
    }

    public SelfException(Throwable cause) {
        super(cause);
    }
}

class TestException {

    public static void useException() throws SelfException {
        throw new SelfException("abc");
    }
}
