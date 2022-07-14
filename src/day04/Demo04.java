package day04;
/*
抽象类：abstract 关键字修饰
1、不能实例化
2、抽象类中有一些方法是抽象方法，只有声明，没有具体实现。
3、抽象类跟普通类一样，可以有属性和成员方法。
4、抽象类的子类(1)、要么实现抽象方法(2)、要么也定义成抽象类

 */
public class Demo04 {

    public static void play(Animal animal){
        animal.running("草地");
        animal.running("山坡");
    }

    public static void main(String[] args) {
        //Animal animal = new Animal(); 抽象类不能实例化

        Pig pig = new Pig();
        pig.name = "八戒";
        pig.running("菜地");
        pig.eating("白菜");

        //多态的特点：抽象类可以用子类来实例化
        Animal animal = new Pig();
        animal.name = "小黑";//实例化
        play(animal);
        play(pig);

    }
}


//抽象类
abstract class Animal{
    String name;//属性

    //成员方法：
    //方法头也就是方法的声明
    //方法体(花括号中的内容)也就是方法的实现。
    public void running(String place){
        System.out.println(name + "在" + place + "奔跑!");
    }
    //抽象方法：只有方法头，没有方法体
    public abstract void eating(String a);

}

//子类要实现父类的抽象方法
class Pig extends Animal{

    @Override
    public void eating(String a) {
        System.out.println(this.name + "吃" + a);
    }
}

//子类如果不实现父类的抽象方法，子类必须定义成抽象的。
abstract class Fish extends Animal{

}

