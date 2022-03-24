package exception_test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

//如果异常中遇到父子继承关系的异常，子异常一定要先于父异常进行捕获
public class CatchExceptionTest {
    public static void main(String[] args) {
        SomeException exception = new SomeException();

        try {
            exception.process1();
            exception.process2();
            exception.process3();
        }
        catch (UnsupportedEncodingException e) {
            System.out.println("abc" + e);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        //无论try中代码是否出现异常，在上述代码执行完成之后，都会执行finally里面的逻辑
        finally {
            System.out.println("END");
        }


    }
}

interface DataOperation{
    int get();
    void set();
    void delete();
}


class DataOperationImpl implements DataOperation{

    @Override
    public int get() {
        return 0;
    }

    @Override
    public void set() {
        //设置数据的逻辑
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException();
    }
}

class SomeException {
    //模拟抛出异常
    public void process1() throws IOException {
//        throw new IOException();
    }

    //模拟抛出异常
    public void process2() throws IllegalArgumentException {
//        throw new IllegalArgumentException();
    }

    //模拟抛出异常
    public void process3() throws UnsupportedEncodingException {
//        throw new UnsupportedEncodingException();
    }

    public void process4(){

    }
}
