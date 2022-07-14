package day05;

/*
包装类：Java中每个基本类型对应一个包装类
1、基本类型不是面向对象的
2、包装类，提供了一些方法操作对象。列表、Map(字典)不支持基本类型

byte    Byte
short   Short
int     Integer
long    Long
float   Float
double  Double
boolean Boolean
char    Character
 */

public class Demo02 {
    public static void main(String[] args) {
        Integer num = 10;

        //整数转换成字符串
        String a = Integer.toString(num);
        System.out.println(a);

        // radix 进制，代表数字是十六进制的
        String b = Integer.toString(0xFF,16);
        System.out.println(b);

        //Integer转换成double
        double d = num.doubleValue();
        System.out.println(d);

        //基本类型和包装类可以相互转换
        int x = 10;
        Integer y = 20;
        x = y; //Integer类型赋值给int类型的，属于自动拆箱
        y = x; //int类型赋值给Integer类型，属于自动装箱
        System.out.println(x);
        System.out.println(y);

        //进制转换
        //二进制：0、1
        //八进制：0~7
        //十一进制：0~9、a
        //十六进制：0~9、a~f
        //三十六进制：0~9、a~z
        System.out.println("转成二进制：" + Integer.toBinaryString(100));
        System.out.println("转成八进制：" + Integer.toOctalString(100));
        System.out.println("转成八进制：" + Integer.toOctalString(0b100001));
        System.out.println("转成八进制：" + Integer.toOctalString(0xffaa));
        System.out.println("转成十六进制：" + Integer.toHexString(100));

        //其他进制转换成十进制
        //aa 是十一进制的，转换成十进制
        System.out.println(Integer.valueOf("aa",11));
        //144 是八进制的，转换成十进制
        //valueOf、parseInt功能一样，返回值类型不一样
        System.out.println(Integer.valueOf("144",8));//返回Integer类型
        System.out.println(Integer.parseInt("144",8));//返回int类型
        System.out.println("===========================");

        //设计测试用例：有四种情况
        //第一种：正确的5位八进制数字
        System.out.println(oct2dec("12345")); //正确的五位数字，边界内的
        System.out.println(oct2dec("77777"));//正确的最大数字
        System.out.println(oct2dec("-7777"));//正确的最小数字
        System.out.println(oct2dec("+1234"));//正确的
        //第二种：参数长度不合法
        System.out.println(oct2dec("1234"));//报错，长度不对
        System.out.println(oct2dec("123456"));//报错，长度不对
        //第三种：参数格式不正确
        System.out.println(oct2dec("81234"));//报错，非法的八进制
        System.out.println(oct2dec("1@345"));//报错，非数字
        //第四种：参数为null
        System.out.println(oct2dec(null));//值为空



    }

    public static int oct2dec(String oct){
        /*
        练习：定义一个静态的方法，输入一个字符串，将5位八进制数字转成十进制
        在main方法中调用给方法，传不同参数测试功能是否正确（设计用例）
         */
        if(oct == null){
            System.out.println("参数为null");
            return 999999;
        }
        if(oct.length() != 5){
            System.out.println("参数长度不合法！");
            return 999998;
        }
        try{
            return Integer.parseInt(oct,8);

        }catch (Exception e){
            System.out.println("参数格式不正确！");
            return 999997;
        }
    }


}
