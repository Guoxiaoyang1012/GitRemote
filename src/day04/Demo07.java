package day04;
/*
final 关键字
1、可以修饰类：这个类不能被继承
2、可以修饰方法：这个方法不能被子类重写
3、可以修饰属性或局部变量：属性或变量只能赋值一次
 */
public class Demo07 {
}

final class A{

}

class B{
    public static final float PI = 3.14f;//常量
    public final void func(){
        //PI = 3.1415f; 不能修改
        final int a = 10;
        // a = 11; a只能赋值一次
        System.out.println("方法：func");
        }
}

class C extends B{
    /*不能重写
    public void func(){
    }*/
}