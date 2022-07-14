package day01;
/*
运算符：
    逻辑运算：(and、or、not) & 与、&&短路与、|或、||短路或、！非
    算术运算：+、-、*、/、%、++(自加)、--(自减)
    比较运算: >、<、>=、<=、==(判等)、!=(不等于)
    赋值运算：=、+=、-=、*=、/=、%=
    位运算：<<<  >>>
    三元运算符：可以用if-else来实现,简化了if-else表达式
    格式：(条件表达式) ? A:B  如果条件表达式为true，执行A，否则执行B
 */
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // ++、--
        int a = 10;
        int b = a++;  //先把a赋值给b之后，a自增1
        System.out.println("a="+ a + ",b=" + b);
        //等价于
        int a1 = 10;
        int b1 = a1;
        a1 = a1 + 1;
        System.out.println("a1=" + a1 + ",b1=" + b1);

        int a2 = 10;
        int b2 = --a2; //先自减1，再赋值给b2
        System.out.println("a2="+a2+",b2="+b2);

        /*& && 结果相同
          & 两边的表达式都会参与运算
          &&左边能计算结果时，右边不参与运算(不执行)
         */
        int n = 10;
        if(true & n++ > 0){
            System.out.println(n);
        }else{
            System.out.println(n);
        }
        System.out.println("--------分割线-----------");

        n = 10;
        if(false && n++ > 0){
            System.out.println(n);
        }else{
            System.out.println(n);
        }

        // | 或 两边都参与运算
        // || 短路或，左边能计算出来结果的，右边不参与运算
        // 常用短路与&&、短路或||

        int x = 10;
        int y = 20;
        int max;
        if(x>y){
            max = x;
        }else{
            max = y;
        }
        System.out.println("两数最大数为："+max);

        //三元运算符
        int max1 = x > y ? x : y;
        System.out.println("两数最大数为："+max1);

        /*
        从键盘输入一个三位整数，计算各个位上数字之和。
        比如输入123，和为1+2+3=6，输出6
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();

        int bai = num/100;
        System.out.println(bai);
        int shi = num % 100 /10;
        System.out.println(shi);
        int ge = num % 10;
        System.out.println(ge);
        System.out.println(bai + shi + ge);

    }
}
