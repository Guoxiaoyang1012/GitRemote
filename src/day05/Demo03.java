package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
列表：List是个接口，ArrayList、LinkedList是两个实现类
ArrayList类：一组相同类型元素的集合。可变长度的数组
 */
public class Demo03 {
    public static void main(String[] args) {
        //<Integer> 列表中元素的类型
        List<Integer> ids = new ArrayList<>();

        //增删改查
        ids.add(10);
        ids.add(20);

        for(int i = 30; i <= 100; i = i + 10){
            ids.add(i);
        }
        System.out.println(ids);
        //根据索引删除元素
        ids.remove(1);
        //根据元素内容删除元素
        ids.remove(Integer.valueOf(30));
        System.out.println(ids);

        //修改元素，将第一个元素修改为1000
        ids.set(0,1000);
        System.out.println(ids);

        //查找元素 contains()
        System.out.println(ids.contains(100));
        System.out.println(ids.contains(10));

        //遍历列表
        //for循环遍历，通过索引获取元素
        for(int i = 0; i < ids.size(); i++){
            //int a = ids[0];列表不能用[i]获取
            System.out.println(ids.get(i));
        }
        //foreach循环
        for(int id : ids){
            System.out.println(id);
        }

        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Animal("小猫",5);
        Animal animal2 = new Animal("小狗",7);
        Animal animal3 = new Animal("小熊",6);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        //遍历列表
        for(Animal animal : animals){
            System.out.println("名字为：" + animal.getName() + "\t" + "年龄为：" + animal.getAge());
        }

        //列表与数组之间的转换
        List<String> names = Arrays.asList("AA","BB","CC");//数组转换为列表
        System.out.println(names);

        System.out.println(animals);
        //列表转换为数组
        Animal[] as = new Animal[animals.size()];
        animals.toArray(as);//列表转换数组的方法
        System.out.println(Arrays.toString(as));

        //LinkedList 列表的方式存储元素的
        //ArrayList 可变长度的数组，遍历元素、访问元素的效率比较高
        //LinkedList 插入和删除元素效率高。add、remove方法之外，还提供一些插入、删除的方法
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("AA");
        linkedList.add("BB");
        System.out.println(linkedList);

        //在列表头部增加元素
        linkedList.addFirst("aa");
        System.out.println(linkedList);
        //在列表尾部增加元素
        linkedList.addLast("bb");
        System.out.println(linkedList);

        linkedList.removeFirst();//删除第一个元素
        linkedList.removeLast();//删除最后一个元素
        System.out.println(linkedList);

        //把列表中的元素加入到另一个列表中
        linkedList.addAll(names);
        System.out.println(linkedList);
    }
}

/*
练习：新建一个Animal类，name、age两个属性，一个构造方法，设置这两个属性的值
新建一个列表，存放三只动物。
遍历列表，每个动物的name、age打印到一行，tab键分隔
 */

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}