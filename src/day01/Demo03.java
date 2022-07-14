package day01;

/*
基本数据类型：8种
   整型：byte(1个字节)、short(2个字节)、int(4个字节)、long(8个字节)
   浮点型: float(4个字节)、double(8个字节)
   布尔型：boolean
   字符型：char(2个字节)
 */

public class Demo03 {
    public static void main(String[] args) {
        //取值范围 -128~127
        byte b1 = -128;

        short s1 = 100;
        int i1 = 1000;
        long long1 = 1000;
        System.out.println(i1);
        System.out.println(long1);

        /*
        int 类型比较常用。java中的整数，默认是int类型的。
        123456789099 默认是int类型，超过int的取值范围，报错
        在数字后加L，表示数字是Long类型的
         */
        long long2 = 123456789234L;
        System.out.println(long2);

        double d1 = 12.3; //小数默认是double类型
        float f1 = 12.3F; //小数赋值给float，在数字后面加F/f
        System.out.println(f1);

        //字符用单引号,字符串用双引号
        //字符底层使用整数来存储的,0~65535之间
        char c1 = '花';
        char c2 = 'A';  //97
        char c3 = '\n';  //转义字符
        char c4 = '\u6666'; //unicode 0000~FFFF之间
        char c5 = '\u0041';
        System.out.println(c5);
        System.out.println(c5+3);

        boolean b = true;
        boolean b2 = false;
        System.out.println(b);

        /*
        数据类型之间的转换
        小容量-> 大容量,自动转换
        大容量-> 小容量,强制转换
        byte、char、short---->int---->long---->float--->double
        boolean 不能与其他类型转换
         */

        byte b3 = 10;
        int num = b3; //把byte类型的变量赋值给int，有自动转换的过程

        short s3 = (short)num; //int类型的变量赋值给short,需要强转

        System.out.println(s3);

        float f4 = 3.1415F;
        int i3 = (int)f4; //强转导致精度丢失
        System.out.println(i3);

        long x = 123455667654L;
        int y = (int) x; //强转导致数据溢出
        System.out.println(x);
        System.out.println(y);


    }
}
