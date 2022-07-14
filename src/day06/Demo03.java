package day06;

import java.util.Arrays;
import java.util.Date;
import java.util.StringJoiner;

/*
String、StringBuilder、StringJoiner:字符串相关的类
 */
public class Demo03 {
    public static void main(String[] args) {
        String string = "Hello World";

        //根据索引获取字符
        System.out.println(string.charAt(4));
        //判断字符串是否包含某个子串
        System.out.println(string.contains("He"));

        String a = "Hello World";
        String b = "Hello Java";
        //比较字符串不相等，返回第一个不相等的字符差
        System.out.println(a.compareTo(b));
        //比较字符串相等，返回0
        System.out.println(a.compareTo(string));

        System.out.println("=========================");
        char w = 'W';
        char j = 'J';
        System.out.println((int) w);//返回字符对应的整数
        System.out.println((int) j);//返回字符对应的整数
        System.out.println(w - j);//字符差：13

        /*
        字符串拼接: + 、concat
        大量字符串拼接：使用+效率比较低，且占内存多
        @@@使用StringBuilder效率高，占内存少
         */
        String s = a + b;
        System.out.println(s);

        String t = a.concat(b);
        System.out.println(t);

        //用+拼接大量字符串
        String str = "";
        //获取程序运行的起始时间
        Date date = new Date();
        long begin = date.getTime();
        for(int i = 0; i < 10000; i++){
            str = str + i + ",";
        }
        System.out.println(str);
        //获取程序运行完的结束时间
        date = new Date();
        long end = date.getTime();
        System.out.println("耗时：" + (end - begin) + "ms");

        System.out.println("===========StringBuilder类=======");
        StringBuilder sb = new StringBuilder();
        //获取程序运行的起始时间
        date = new Date();
        begin = date.getTime();
        for(int i = 0; i < 10000; i++){
            sb.append(i).append(",");
        }
        System.out.println(str);
        //获取程序运行完的结束时间
        date = new Date();
        end = date.getTime();
        System.out.println("耗时：" + (end - begin) + "ms");

        /*
        String 是不可变的类，拼接过程中产生大量的临时对象(在内存中有一块区域存储这个对象)，占用内存且耗时
        StringBuilder是可变的类，整个拼接过程只有sb这一个对象
        StringBuffer是多线程时安全，StringBuilder多线程时不安全
         */

        String path = "E:\\IdeaProjects\\LearnJava42\\src\\day06\\Demo03.java";
        String[] temp = path.split("\\\\");//特殊符号要转义
        //System.out.println(Arrays.toString(temp));
        String path2 = String.join("/",temp);
        System.out.println(path2);

        String juzi = "Hello Jack.Good Morning";
        String[] danci = juzi.split(" ");//在空格处切割
        System.out.println(Arrays.toString(danci));

        String[] names = new String[]{"Tom","Jack","Lily"};
        //参数：delimiter:连接符 prefix:前缀 suffix:后缀
        StringJoiner joiner = new StringJoiner(",","Hello","!");
        for(String  name : names){
            joiner.add(name);
        }
        System.out.println(joiner.toString());

        //indexOf、lastindexOf 字符在字符串中的索引
        string = "Hello World";
        //第一个o的位置(空格算一位)，返回4
        System.out.println(string.indexOf("o"));
        //最后一个o的位置(空格算一位)，返回7
        System.out.println(string.lastIndexOf("o"));

        //一个参数表示开始索引，获取从开始索引到字符串结尾的子串
        System.out.println(string.substring(6));
        //两个参数表示开始索引到结束索引。包含开始不包含结束
        System.out.println(string.substring(6,8));

        //利用substring lastIndexOf 把一个路径中的文件后缀名取到
        String path11 = "E:\\IdeaProjects\\LearnJava42\\src\\day06\\Demo03.java";
        String path22 = "E:\\IdeaProjects\\LearnJava42\\test.xml";
        //取后缀名
        System.out.println(path11.substring(path11.lastIndexOf(".")+1));
        System.out.println(path22.substring(path22.lastIndexOf(".")+1));


    }
}
