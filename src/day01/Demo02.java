package day01;

import java.util.Scanner;
/*
标识符：字母、数字、下划线、$符号、不能用(数字)开头,不能用java关键字命名
类名：大驼峰,每个单词首字母大写  HelloWorld
方法名：小驼峰，第一个单词首字母小写，其他单词首字母大写 helloWorld
变量名：小驼峰
包名：全小写  helloworld
常量名：大写字母+下划线  HELLO_WORLD

输入和输出（类似Py中的input、print）
 */
public class Demo02 {
    public static void main(String[] args) {
        /*
        Scanner 是java获取输入的类
        用new创建一个对象/实例
        Scanner(System.in)构造方法，这个方法有一个参数
        in 表示标椎输入，从键盘输入
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的姓名：");
        String name = scanner.next();  //获取字符串

        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();

        System.out.println("输入身高:");
        float shenGao = scanner.nextFloat(); //读取时遇到 空格、换行、tab键就结束了

        // + 字符串拼接
        System.out.println("姓名:"+ name + ",年龄:" + age + ",身高:" + shenGao);
    }
}
