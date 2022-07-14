package day05;

import java.util.*;

/*
集合：Set接口，实现类HashSet 哈希的方式存放元素，TreeSet树的方式存放元素的
列表与集合的区别：
    1、列表是有序的，集合是无序的
    2、列表中元素的可以重复的，集合中元素不能重复
列表与字典的区别：

 */
public class Demo04 {
    public static void main(String[] args) {
        //创建一个集合，集合中的元素是String类型的。用实现类HashSet实现实例化
        Set<String> set = new HashSet<>();
        set.add("red");
        set.add("yellow");
        set.add("blue");
        set.add("green");
        System.out.println(set);

        //集合是无序的，没有索引，所以没有get、set方法根据索引获取、设置值。
        //删除元素
        set.remove("blue");
        System.out.println(set);

        //contains 查询是否包含某个元素，size大小

        //遍历集合用foreach循环遍历
        for(String c : set){
            System.out.println(c);
        }

        //Arrays 数组的工具类
        List<Integer> lists = Arrays.asList(1,2,3,1,2,1,21,2,4,5);//数组转换为列表
        List<Integer> num = quChong(lists);
        System.out.println(num);


    }

    /*
    利用集合不能有重复元素的特点，可以实现对列表去重。
    封装一个静态方法，输入一个列表，对列表去重后返回。
     */
    public static List<Integer> quChong(List<Integer> a){
        //列表转成集合
        Set<Integer> b = new HashSet<>(a);
        //集合转成列表
        return new ArrayList<>(b);
    }

    public static List<Integer> quChong1(List<Integer> a){
        //列表转成集合
        Set<Integer> b = new HashSet<>();
        for(int i : a){
            b.add(i);
        }
        //集合转成列表
        List<Integer> c = new ArrayList<>();
        c.addAll(b);

        return c;
    }

}
