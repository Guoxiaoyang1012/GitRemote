package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
异常处理：try、catch、finally、throw、throws
 */
public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        /*
        }catch (InputMismatchException e){
            System.out.println("异常：" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic异常：" + e.getMessage());
         */
        }catch (Exception e){
            //打印异常
            System.out.println("Except异常：" + e.getMessage());
        } finally{
            //不论程序是否出现异常，都会执行的代码
            System.out.println("程序结束!");
        }

        Student stu = new Student();
        /*
        如果一个方法抛出异常，调用这个方法时：
        1.要么声明也抛出异常 2.要么try-catch处理异常
         */
        try {
            stu.setGender('男');
            stu.setGender('神');
        } catch (Exception e) {
            System.out.println("异常信息：" + e.getMessage());
            e.printStackTrace();//打印调用栈，方法之间的调用关系
        }

        Student stu1 = null;
        //stu1对象是null，调用成员方法时，会报空指针异常
        //控指针异常是代码逻辑问题，不能用try-catch规避
        //        //需要对参数做判空处理
        if(stu1 != null){
            stu1.setName("tom");
        }else{
            System.out.println("空指针异常");
        }

    }
}

class Student{
    private String name;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    //throws用在方法头，声明这个方法抛出一个异常
    public void setGender(char gender) throws Exception {
        if(gender == '男' || gender == '女'){
            this.gender = gender;
        }else{
            //throw 用在方法体，抛出一个自定义的异常
            throw new Exception("性别必须是男或女");
        }
    }

}
