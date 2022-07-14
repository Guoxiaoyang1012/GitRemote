package day06;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/*
常用的类:
Math:实现了一些数学的方法，以及常量。PI、e
Random/SecureRandom:生成随机数
Date：日期与时间
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("=========Math类===========");
        //2的10次方
        System.out.println(Math.pow(2,10));
        //最大值
        System.out.println(Math.max(1,3));
        //最小值
        System.out.println(Math.min(2,6));

        System.out.println("========Random/SecureRandom类=======");
        //Random random = new Random();
        SecureRandom random = new SecureRandom();
        //生成10个int类型的随机数
        for(int i = 0; i < 10; i++){
            //int类型的随机数，在int的取值范围内随机
            System.out.print(random.nextInt() + ",");
        }
        System.out.println();//换行

        //bound参数:取值范围
        for(int i = 0; i < 20; i++){
            //0~10范围内随机，包含0，不包含10
            System.out.print(random.nextInt(10) + ",");
        }
        System.out.println();//换行

        //生成10个float类型的随机数
        for(int i = 0; i < 10; i++){
            //0~1之间取随机数
            System.out.print(random.nextFloat() + ",");
        }
        System.out.println();//换行

        System.out.println("============Date类=============");
        //创建一个Date实例，该实例记录了当前的时间
        Date date = new Date();

        System.out.println(date);
        //日期格式化的类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sdf.format(date));
        //设置日期输出格式
        sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(date));

        //时间戳：相对于1970-1-1 0时0分0秒到当前时间过了多少毫秒
        Long time = date.getTime();
        System.out.println(time);

        //在时间戳上增加毫秒
        Long time1 = time + 300000;
        Date date1 = new Date(time1);//把数字转换成时间
        System.out.println(sdf.format(date1));

        /*
        时间的应用场景
        1、打印日志：会把日志打印的当前时间记录到文件中。
        2、定时任务：定时任务的启动时间不能写死，获取当前时间，
              在当前时间的基础上加上三五分钟，作为定时任务的启动时间
        3、方法/功能执行耗时：可以在方法调用前后，打印时间，计算时间差
         */

    }
}
