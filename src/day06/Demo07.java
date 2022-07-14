package day06;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //键盘输入七位会员卡号，分解获得会员卡上各个位上的数字，对数字求和，如果和大于35，则中奖。例如卡号：1234567
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入卡号：");
        int num = scanner.nextInt();
        int baiWan = num / 1000000;
        int shiWan = num % 1000000 / 100000;
        int wan = num % 100000 / 10000;
        int qian = num % 10000 / 1000;
        int bai = num % 1000 / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        int sun = baiWan + shiWan + wan + qian + bai + shi + ge;
        if (sun > 35) {
            System.out.println("恭喜您，中奖了！");
        } else {
            System.out.println("很遗憾，没有中奖！");
        }

        //输出100以内的所有的质数？
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值

        for (int i = 2; i <= 100; i++) {//遍历100以内的自然数

            for (int j = 2; j < i; j++) {//j:被i去除

                if (i % j == 0) { //i被j除尽
                    isFlag = false;
                }
            }
            if (isFlag == true) {
                System.out.print(i);
            }
            //重置isFlag
            isFlag = true;

        }
    }
}
