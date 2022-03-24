package exception_test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 假设用户输入了abc：
//        String s = "abc";
//        int n = Integer.parseInt(s); // NumberFormatException!

        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));


//        try {
//            //....读文件
//        } catch (IOException e) {
//            System.out.println("文件名称：文件大小，读取文件失败");
//            e.printStackTrace();
//        }

    }


//    static byte[] toGBK(String s) {
//        try {
//            // 用指定编码转换String为byte[]:
//            return s.getBytes("GBK");
//        } catch (UnsupportedEncodingException e) {
//            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
//            System.out.println(e); // 打印异常信息
//            return s.getBytes(); // 尝试使用用默认编码
//        }
////        return null;
//    }


    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
}
