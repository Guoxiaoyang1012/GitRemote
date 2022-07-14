package day02;

import java.util.Scanner;

/*
while、do-while循环
 */
public class Demo01 {
    public static void main(String[] args) {
        //1~100数字累加
        int i = 1; //初始化条件 1
        int sum = 0;
        while(i <= 100){ //循环条件 2
            sum += i; //循环体 3
            i++; //迭代条件 4
        }
        System.out.println(sum);
        //执行顺序1---2---3---4---2---3---4---

        int i1 = 1; //初始化条件 1
        int sum1 = 0;
        do{
            sum1 += i1; //循环体 3
            i1++; //迭代条件 4
        }while(i1 <= 100); //循环条件 2
        System.out.println(sum1);
        //执行顺序1---3----4----2----3----4----2----


        /*
        while、do-while的差别
        如果循环条件不满足，while循环体不会执行
        如果循环条件不满足，do-while循环体会执行一次
         */
        int a = 10;
        while(a < 0){ //条件不满足
            System.out.println("while"); //执行不到
        }

        do{
            System.out.println("do-while"); //执行一次
        }while(a < 0); //条件不满足



        /*
        从键盘录入不确定个数的整数，统计正数的个数，负数的个数，遇到0结束程序
         */
        Scanner scanner = new Scanner(System.in);
        int count = 0; //存储正数个数
        int con = 0; //存储负数个数
        System.out.println("请输入整数为:");
        int num = scanner.nextInt(); //读取一个整数
        while(num != 0){
            if (num > 0) {
                count++;
            } else {
                con++;
            }
            num = scanner.nextInt(); //继续读取下一个整数
        }
        System.out.println("正数个数为:"+count+",负数个数为:"+con);

        while(true){ //死循环
            if(num>0){
                count++;
            }else if(num<0){
                con++;
            }else{
                break;
            }
            num = scanner.nextInt();
        }
        System.out.println("正数个数为:"+count+",负数个数为:"+con);
    }
}
