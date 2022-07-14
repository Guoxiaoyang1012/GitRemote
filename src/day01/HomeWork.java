package day01;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
       /*
       从键盘输入一个年份，输出对应的生肖。switch-case实现。
       1900年为鼠年，1900%12为4,case 4时，打印鼠年。
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        int num = year % 12;
        switch(num){
            case 0 :
                System.out.println(year + "是猴年！");
                break;
            case 1 :
                System.out.println(year + "是鸡年！");
                break;
            case 2 :
                System.out.println(year + "是狗年！");
                break;
            case 3 :
                System.out.println(year + "是猪年！");
                break;
            case 4 :
                System.out.println(year + "是鼠年！");
                break;
            case 5 :
                System.out.println(year + "是牛年！");
                break;
            case 6 :
                System.out.println(year + "是虎年！");
                break;
            case 7 :
                System.out.println(year + "是兔年！");
                break;
            case 8 :
                System.out.println(year + "是龙年！");
                break;
            case 9 :
                System.out.println(year + "是蛇年！");
                break;
            case 10 :
                System.out.println(year + "是马年！");
                break;
            case 11 :
                System.out.println(year + "是羊年！");
                break;
            default:
                System.out.println("输入年份不合法！");
        }

        //打印九九乘法表
        int sum;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
            }
            System.out.println();
        }

        //从键盘输入3个数，从大到小输出。用if-else实现

        System.out.println("请输入三个整数分别为:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("三个数从大到小分别为:"+ c + "," + b + "," + a);
        if(a > b && a > c){
            if(b > c){
                System.out.println("三个数从大到小分别为:"+ a + "," + b + "," + c);
            }else{
                System.out.println("三个数从大到小分别为:"+ a + "," + c + "," + b);
            }
        }else{
            if(b > a && b > c){
                if(a > c){
                    System.out.println("三个数从大到小分别为:"+ b + "," + a + "," + c);
                }else{
                    System.out.println("三个数从大到小分别为:"+ b + "," + c + "," + a);
                }

            }else{
                if(c > a && c > b){
                    if (a > b) {
                        System.out.println("三个数从大到小分别为:"+ c + "," + a + "," + b);
                    } else {
                        System.out.println("三个数从大到小分别为:"+ c + "," + b + "," + a);
                    }

                }
            }
        }
    }
}


