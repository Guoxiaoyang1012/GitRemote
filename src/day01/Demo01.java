package day01;
/*
Java语言：强制面向对象的，所有的代码是放到类里面的。
public表示公共的，class创建类的关键字
Demo01是类名,首字母大写,大驼峰命名格式:XxxYyyZzz
 */

public class Demo01 {
   /*
    java的入口方法:main方法(固定格式)
    public 表示公共的
    static 静态的
    main 方法名
    void 返回值类型,表示没有返回值
    String 字符串类型
    String[] 字符串数组
    args 是参数名,java是强类型语言,变量用之前要先声明类型，且只能赋值这个类型的值。
     */
    public static  void main(String[] args){
        //println打印并换行
        System.out.println("Hello Word!");
        //print打印不换行
        System.out.print("Hello");
        System.out.print(" Word!");
        
    }
}

