package day01;

import java.util.Scanner;

/*
条件分支：if-else、switch-case
 */
public class Demo05 {
    public static void main(String[] args) {
        int age = 10;
        if(age<18){
            System.out.println("未成年");
        }else if(age<60){
            System.out.println("青壮年");
        }else{
            System.out.println("老年");
        }

        //switch-case 一个变量与一组常量对比
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个季节：");
        String season = scanner.next(); //获取键盘输入的内容
        switch (season){
            case "春":  //case后面跟常量，不能是表达式
                System.out.println("春季");
                break;
            case "xia":
            case "summer":
            case "夏":
                System.out.println("夏季");
                break;
            case "秋":
                System.out.println("秋季");
                break;
            case "冬":
                System.out.println("冬季");
                break;
            default:
                System.out.println("不认识的季节");
        }
    }
}
