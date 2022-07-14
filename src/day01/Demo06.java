package day01;
/*
循环：for、while、do-while
for 确定次数的循环
while、do-while 不确定次数的循环
1、初始化条件
2、循环条件
3、迭代条件
4、循环体
 */
public class Demo06 {
    public static void main(String[] args) {
        /*
        int i = 0;初始化条件 1
        i < 5; 循环条件 2
        i++; 迭代条件 3
        sout 循环体 4
        执行顺序：1--2--4--3--2--4--3--
         */
        for (int i = 0; i < 5; i++) {  //i 局部变量，作用域只在for循环内
            System.out.println("Hello World");
        }

        //求1~100数字之和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //sum = sum + i;
            sum += i;
        }
        System.out.println(sum);

        //求1~100数字的偶数之和
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("偶数之和："+sum);

        sum = 0;
        for (int i = 2; i <= 100; i += 2){
            sum += i;
        }
        System.out.println("偶数之和："+ sum);

        //打印*，一次打印一个。一行五个
        //打印六行
        for(int j = 0; j < 6; j++) { //控制行数
            for (int i = 0; i < 5; i++) { //控制个数
                System.out.print("*");
            }
            System.out.println();//换行
        }

        /*
        练习：打印下面格式的符号图形
         *
         **
         ***
         ****
         *****
         */

        //方法一
        for(int i = 0; i < 5; i++){ //i控制行，一共打印五行
            //j控制每行有几个，i=0时，j=1; i=1时，j=2----
            for(int j = 0; j < i + 1; j++){ //j控制每行的个数
                System.out.print("*");
            }
            System.out.println();
        }
        //方法二
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
