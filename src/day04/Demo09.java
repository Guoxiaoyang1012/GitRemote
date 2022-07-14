package day04;
/*
public、private、protected
1、public修饰的类、属性、方法，其他类中都能访问到
2、private修饰属性、方法。只能在类内部访问
3、protected修饰属性、方法。只能在类内部、以及子类、子类的子类访问。
4、缺省，Demo10没有用public修饰，默认是缺省，只能在day04这个包中被访问，跨包无法访问到
 */
public class Demo09 {
    public static void main(String[] args) {
        //多个包中有同名的类，使用时可以带着包名，避免冲突
        day01.Demo01 d = new day01.Demo01();
        //Demo011没有使用public修饰，默认只能在day01包中访问
        //day01.Demo011 d1 = new day01.Demo011();
    }

    class Demo10{

    }
}

