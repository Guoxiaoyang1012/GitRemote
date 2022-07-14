package day03;
/*
面向对象的三大特点：封装、继承、多态
封装：把属性设置为私有的，对外提供公共的方法来操作属性。(set设置属性的值，get获取属性的值)
属性封装在类的内部，外部只能通过方法访问
 */
public class Demo06 {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "大黄"; //实例.属性 设置属性的值
        dog.age = 5;
        dog.gender = '公';
        System.out.println(dog);
        System.out.println("狗的名字：" + dog.name);//实例.属性 获取属性的值

        dog.gender = '鬼'; //调用者来保证输入参数的正确性。
        System.out.println(dog);

        Animal1 cat = new Animal1();
        cat.setName("皮皮");//私有属性通过提供的方法访问
        System.out.println(cat);
        System.out.println("猫的名字：" + cat.getName());
        cat.setAge(6);
        System.out.println("猫的年龄：" + cat.getAge());
        cat.setGender('公');
        System.out.println("猫的性别：" + cat.getGender());

        cat.setGender('鬼');//在方法内做参数检查，避免调用者传入异常值。
        System.out.println(cat);

    }
}
//没封装的写法
class Animal{
    String name;
    int age;
    char gender;

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }
}
//封装的写法
class Animal1{
    private String name; //属性设置为私有的
    private int age;
    private char gender;

    //提供公共的set方法设置属性的值
    public void setName(String name){
        this.name = name;
    }

    //提供公共的get方法获取属性的值
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        if(gender == '公' || gender == '母'){
            this.gender = gender;
        }else{
            System.out.println("输入的参数不合法!");
        }
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Animal1{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }
}