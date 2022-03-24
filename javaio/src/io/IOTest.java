package io;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class IOTest {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("/home/wxz/mytemp/a.txt");
////        System.out.println(f1.createNewFile());
//        File f2 = new File("/home/wxz/mytemp/a.txt");
//        System.out.println(f1.renameTo(f2));
////1.创建一个文件对象
//        File file = new File("/home/wxz/mytemp/a.txt");
//        System.out.println(file.getAbsolutePath());
//
////2.创建一个文件输入流
//        FileInputStream inputStream = new FileInputStream(file);
//
//        int b;
////while循环里，每次读取字节赋值给b
//        while ((b = inputStream.read()) != -1) {
//            System.out.println(b);
//        }
//        inputStream.close();


        /*//将文件拷贝到另一个文件中
        File f3 = new File("/home/wxz/IdeaProjects/javaio/lib/shadow.mp3");
        System.out.println(f3.getAbsolutePath());
        System.out.println(f3.createNewFile());
//        f3.delete();
//
        FileInputStream inputStream1 = new FileInputStream("/home/wxz/IdeaProjects/javaio/lib/YouAndBeautifulWorld.mp3");
        FileOutputStream outputStream = new FileOutputStream("/home/wxz/IdeaProjects/javaio/lib/shadow.mp3");
        byte[] bs = new byte[inputStream1.available()];
        inputStream1.read(bs);
        outputStream.write(bs);
        inputStream1.close();
        outputStream.close();
        */




/*
//        File f4 = new File("./lib/note.txt");
        FileWriter fw = new FileWriter("./lib/note.txt");
        fw.write("你好，欢迎来到*****，请**********\r\n请看管好个人物品");
        fw.flush();
//        fw.close();

        File file = new File("./lib/note.txt");


        FileReader fr = new FileReader("./lib/note.txt");
        char[] a = new char[50];
        fr.read(a);
        for (char c : a){
            System.out.print(c);
        }
        fr.read();
        // 创建文件
//        file.createNewFile();
        // creates a FileWriter Object
//        FileWriter writer = new FileWriter(file);
//        // 向文件写入内容
//        writer.write("This\n is\n an\n 我现在\n");
//        writer.flush();
//        writer.close();
        // 创建 FileReader 对象
//        FileReader fr = new FileReader(file);
//        char[] a = new char[50];
//        fr.read(a); // 从数组中读取内容
//        for (char c : a)
//            System.out.print(c); // 一个个打印字符
//        fr.close();
*/

/*      文档拷贝
        File f5 = new File("./lib/note.txt");
        File f6 = new File("./lib/note1.txt");
//        f5.createNewFile();
        FileWriter fw = new FileWriter(f6);
//        fw.write("abcdefghijklmnopqrstuvwxyz");
//        fw.flush();
        FileReader fr = new FileReader(f5);
        char[] a = new char[1024];
        int len;
        while ((len=fr.read(a))!=-1){
            System.out.println(len);
            fw.write(a,0,len);
        }
        fw.close();、
*/

/*
      //练习：计算一个文档中包含多少个关键字，我用的方法是将输入的汉字装为16进制字符
        // 再通过Integer.toHexString将10进制转为16进制，在做对比
        Scanner sc = new Scanner(System.in);

        File f5 = new File("./lib/note.txt");
        FileReader fr = new FileReader(f5);
        int len;
        int times=0;
        String sign = sc.nextLine();
        sign = encodeHex(sign);//在网上找到的方法，将我输入的文字转为16进制
        while((len = fr.read())!=-1){//fe.read方法是将内容读取为10进制
            String s = Integer.toHexString(len);//现在将len转为16进制
            if (s.equals(sign)){
                times++;
            }
        }
        System.out.println("一共有"+times);
*/

//53f6


//        BufferedWriter bw = new BufferedWriter(new FileWriter("./lib/note1.txt"));
//        bw.write("abcd");
////        bw.newLine();//回车换行的意思，我直接\n不好吗？
//        bw.write("abcd");
//        bw.flush();
/*      //缓冲读取/写入缓冲区大小为8kb
        BufferedReader br= new BufferedReader(new FileReader("./lib/note1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./lib/note.txt"));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
*/
/*      //将一个文档的文字以一种编码输出，再以另一种编码输入到另一个TXT文件
        FileInputStream fis = new FileInputStream("./lib/note1.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fos = new FileOutputStream("./lib/note.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        int c;
        while ((c = br.read())!=-1){
//            System.out.println(c);
            bw.write(c);
        }
        br.close();
        bw.close();
        */


/*        File f = new File("./lib/note.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("./lib/note.txt"));
        BufferedReader fr = new BufferedReader(new FileReader("./lib/note1.txt"));
        int s;
        while((s=fr.read())!=-1){
            bw.write(fr.readLine());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        fr.close();*/

        //文件筛选器，筛选一个文件夹内以***结尾的文件，现在还写不出来
        File f = new File("./lib");
        System.out.println(Arrays.toString(f.listFiles()));
        while (f.getName().toLowerCase().endsWith(".txt")) {
            MyFileter m = new MyFileter();
            System.out.println(m.accept(f));
        }



/*
        FileInputStream fis1 = new FileInputStream("./lib/note.txt");
        FileInputStream fis2 = new FileInputStream("./lib/note1.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        FileOutputStream fos = new FileOutputStream("./lib/note2.txt");
         int b;
         while((b = sis.read())!=-1){
             fos.write(b);
         }
         sis.close();
         fos.close();
*/

        Vector<FileInputStream> v = new Vector<>();
        v.addElement(new FileInputStream("./lib/note.txt"));
        v.addElement(new FileInputStream("./lib/note1.txt"));
        v.addElement(new FileInputStream("./lib/note2.txt"));
        Enumeration<FileInputStream> e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);

    }

/*  //在第100行的程序中使用了
    public static String encodeHex(String str) {
        // 定义变量保存结果
        final StringBuffer hexStr = new StringBuffer();
        // 遍历字符串，直接使用Integer.toHexString返回每个字符的十六进制字符串
        for (int i = 0; i < str.length(); i++)
            hexStr.append(Integer.toHexString(str.charAt(i)));
        // 返回结果
        return hexStr.toString();
    }*/


}

//这个的使用位置在170行
class MyFileter implements FileFilter {
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith("1");
    }
}
