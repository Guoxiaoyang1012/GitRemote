package day04;
/*
继承：extends 关键字
 */
public class Demo01 {
    public static void main(String[] args) {
        //调用有参构造方法创建对象并实例化参数
        Pet cat = new Pet("加菲猫",3,100);
        cat.setHealth(90);
        System.out.println(cat);

        Dog dog = new Dog("大黄",5,90);
        dog.setHealth(80); //父类的setHealth
        System.out.println(dog);//toString()

        Dog dog1 = new Dog("小黑",3,85,"贵宾犬");
        System.out.println(dog1);
    }
}

/*
宠物狗类，从宠物类继承
1、子类继承父类的属性和方法
2、不继承构造方法。父类有构造方法，子类也需要写对应的构造方法
 */
class Dog extends Pet{

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, int health) {
        //super表示父类，调用父类的构造方法
        super(name, age, health);
    }

    public Dog(String name, int age, int health, String breed) {
        super(name, age, health);//调用父类的构造方法给名字、年龄、健康度赋值
        this.breed = breed;//给品种属性赋值
    }

    //父类的方法不适合子类时，子类可以重写父类的方法
    public String toString() { //super.方法名 调用父类的方法
        return "Pet{name=" + super.getName() + ", age=" + super.getAge() + ", health=" + super.getHealth() + ", breed=" + this.getBreed() + "}";
    }
}


/*
宠物类：3个属性、toString方法、get/set方法
 */
class Pet{
    private String name;
    private int age;
    private int health;

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + ", age=" + age + ", health=" + health + '}';
    }
}

