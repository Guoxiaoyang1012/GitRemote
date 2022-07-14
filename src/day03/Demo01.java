package day03;

/*
1、面向过程：最小的处理单位是函数
   把某个功能分解成一个一个的函数。大象装入冰箱的过程
   (1)、打开冰箱门
   (2)、把大象装入冰箱
   (3)、关上冰箱门
2、面向对象
   最小处理单位是类。大象装入冰箱的过程
   大象：进入(冰箱)
   冰箱：开门()、关门()
   人：打开(冰箱)、操作(大象)、关闭(冰箱)
   识别整个过程中有哪些对象，把对象抽象成类。
3、类：是一个对象，是一群事物的抽象，这群事物有公共的属性(成员变量)和行为(方法)。
 */

public class Demo01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "Lily";
        stu1.age = 18;
        stu1.classes = "二年级一班";
        stu1.phone = "18087688888";

        System.out.println(stu1.toString());
        stu1.learning("英语");
        stu1.sleeping();

        Student stu2 = new Student();
        stu2.name = "Tom";
        stu2.sleeping();

        Circle ci1 = new Circle();
        ci1.r = 12;
        ci1.mianJi();//没有返回值，方法中直接打印结果，直接调用方法即可
        System.out.println("周长为：" + ci1.zhouChang()); //有返回值，main方法中得打印结果
        System.out.println(ci1.toString());
        System.out.println("--------------------------------");

        Circle ci2 = new Circle();
        ci2.r = 8;
        float mj = ci2.mianJi2();
        System.out.println("面积为：" + mj);
        System.out.println("周长为：" + ci2.zhouChang());
        System.out.println(ci2.toString());

    }
}
/*
学生类：
    属性：姓名、年龄、班级、联系方式（python init）
    行为：学习、睡觉、考试
 */
class Student{
    String name;
    int age;
    String classes;
    String phone;
    /*
    public 表示公共的，void表示没有返回值
    sleeping 方法名() 这个方法没有参数
     */
    public void sleeping(){
        System.out.println(name + "正在睡觉!");
    }
    //String book 是参数
    public void learning(String book){
        System.out.println(name + "正在学习!" + book );
    }
    //方法声明返回一个String类型的值
    public String toString(){
        return "学生姓名：" + name + ",年龄：" + age + ",班级：" + classes + ",联系方式：" + phone;
    }

}

/*
创建一个圆的类 Circle
属性：半径 r
方法：圆面积、圆周长
main 方法中实例化两个圆，计算面积和周长
 */

/*
问题：
1、类定义到main方法中
2、String和double类型做乘法
3、mainJi、zhouChang定义成属性
4、定义返回值类型与实际返回值类型不匹配
 */

class Circle{
    float r;

    //没有返回值的方法
    public void mianJi(){
        System.out.println("圆面积为：" + Math.PI * r * r);
    }

    //有返回值的方法
    public float mianJi2(){
        return (float) Math.PI * r * r;
    }

    public float zhouChang(){
        return (float) Math.PI * r * 2;
    }

    public String toString(){
        return "圆半径：" + r + ",周长为：" + zhouChang() + ",面积为：" + mianJi2();
    }
}
