package day04;
/*
接口：interface修饰的
1、接口里的方法都是抽象的，默认用 public abstract 修饰的
2、接口里面定义的属性都是常量。默认用 public static final 修饰的
3、接口不是用来继承的，是用来实现的。implements 关键字
鸟具有飞的功能，飞机有飞的功能。飞看做一个接口。鸟、飞机、飞没有实质性的关系。
 */
public class Demo05 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.upFly();
        bird.downFly();

        Plane plane = new Plane();
        plane.upFly();
        plane.downFly();

        //接口通过子类实例化
        Fly fly = new Bird();
        fly.upFly();
        fly.downFly();
    }
}

interface Fly{

    public abstract void upFly();//向上飞，抽象方法只有声明
    public abstract void downFly();
}

//鸟类实现Fly接口
class Bird implements Fly{

    @Override
    public void upFly() {
        System.out.println("展翅高飞");
    }

    @Override
    public void downFly() {
        System.out.println("向下低空滑翔");
    }
}

//飞机类实现Fly接口
class Plane implements Fly{

    @Override
    public void upFly() {
        System.out.println("飞机起飞");
    }

    @Override
    public void downFly() {
        System.out.println("飞机降落");
    }
}

