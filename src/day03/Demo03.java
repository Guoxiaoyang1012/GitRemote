package day03;
/*
构造方法：与类同名的方法。创建对象的时候调用的方法
 */
public class Demo03 {
    public static void main(String[] args) {
        //Pet() 调用无参构造方法，创建实例
        //如果没有定义构造方法，系统自带一个默认的无参构造方法
        Pet cat = new Pet();
        cat.name = "加菲猫";
        cat.health = 90;
        cat.gender = '公';
        System.out.println(cat);

        //Pet(有参数) 调用有参数的构造方法创建实例，简化实例的创建
        Pet dog = new Pet("旺财",100,'公');
        System.out.println(dog);
    }
}

/*
宠物类：
      属性：名字、健康度、性别
      方法：toString()方法
 */
class Pet{
    String name;
    int health;
    char gender;

    //无参构造方法，构造方法支持重载
    Pet(){

    }

    //构造方法给三个属性赋值
    Pet(String n, int h, char g){
        name = n;
        health = h;
        gender = g;
    }

    //
    public String toString() {
        return "Pet{name=" + name +  ", health=" + health + ", gender=" + gender + "}";
    }

}

//构造方法可以自动生成
class Pet1 {
    String name;
    int health;
    char gender;

    //有参构造方法
    public Pet1(String name, int health, char gender) {
        //this关键字 类似python中的self，表示实例
        //成员变量：类里面定义的变量。创建对象的时候创建，对象销毁的时候释放
        //局部变量：方法的参数，或者在方法中定义的变量。方法调用时创建，方法调用完销毁
        //当成员变量与局部变量重名时，用this关键字来区分
        this.name = name; //局部变量
        this.health = health;
        this.gender = gender;
    }

    public String toString() {
        return "Pet1{name=" + name +  ", health=" + health + ", gender=" + gender + "}";
    }
}