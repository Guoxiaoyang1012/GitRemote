package day03;

import java.util.Arrays;

/*
新建一个学生类：
属性：姓名、年龄、分数（设置为私有的）
方法：get/set方法（对年龄、分数做参数检查，年龄 0~120，分数0~100之间取值）
      构造方法
      toString方法
      一个静态方法，批量修改学生的分数，如果分数小于60，则增加5分；大于60不处理。
      main方法中实例化一些学生，调用上述的方法。
 */
public class HomeWork {
    public static void main(String[] args) {
        Students[] students = new Students[4];
        //调用有参构造方法实例化对象
        Students stu1 = new Students("张三",18,87);
        Students stu2 = new Students("李四",19,59);
        Students stu3 = new Students("王五",20,56);
        //调用无参构造方法,实例化对象
        Students stu4 = new Students();
        stu4.setName("赵六");
        stu4.setAge(58);
        stu4.setScores(54);
        System.out.println(stu4);

        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;
        students[3] = stu4;
        System.out.println(Arrays.toString(students));
        //调用方法 类名.increaseScores()
        Students.increaseScores(students);
        System.out.println(Arrays.toString(students));

    }
}

class Students{
    private String name;
    private int age;
    private double scores;

    //无参构造方法
    public Students(){

    }

    //有参构造方法
    public Students(String name,int age,double scores){
        this.name = name;
        this.age = age;
        this.scores = scores;
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
        if(age > 0 && age <120){
            this.age = age;
        }else{
            System.out.println("输入参数不合法");
        }

    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        if(scores > 0 && scores < 100){
            this.scores = scores;
        }else{
            System.out.println("输入参数不合法");
        }

    }

    public static void increaseScores(Students[] students){
        for(Students student : students){
            if(student.scores < 60){
                student.scores = student.scores + 5;
            }else{
                student.scores = student.scores;
            }
        }
    }

    //toString()方法
    public String toString() {
        return "Students{name=" + name + ", age=" + age + ", scores=" + scores + "}";
    }
}