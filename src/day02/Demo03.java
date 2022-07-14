package day02;

import java.util.Arrays;

/*
数组 ：包含相同类型的一组数据，固定长度有序的。
 */
public class Demo03 {

    public static void main(String[] args) {
        //声明一个数组，并初始化
        int[] scores = {98, 97,67,58,88};

        System.out.println(scores[0]);//通过索引获取第一个元素
        System.out.println(scores[4]);

        System.out.println(scores.length);//数组的长度

        System.out.println(Arrays.toString(scores));

        //System.out.println(scores[5]); 索引超出长度范围报错

        String[] names = new String[3]; //声明一个数组必须指定数组长度
        names[0] = "tom";
        names[1] = "lucy";
        names[2] = "cick";//给数组中的元素赋值

        //遍历数组用for循环实现，根据索引取元素
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
        System.out.println("----------------");

        //遍历数组-foreach，每次获取数组中的一个元素
        for(int score : scores){
            System.out.println(score);
        }

        System.out.println("-----------------");

        //names数组用foreach遍历
        for(String name : names){
            System.out.println(name);
        }

        //数组的典型应用：求数组中的最大值/最小值
        //打擂的方式
        //把数组中的第一个元素赋值给最大值
        int max = scores[0];
        int min = scores[0];
        //遍历数组中的其他元素跟最大值比较
        for(int i = 1; i <scores.length; i++){
            if(scores[i] > max){
                max = scores[i]; //如果比最大值大，把最大值替换掉
            }
            if(scores[i] < min){
                min = scores[i]; //如果比最小值小，把最小值替换掉
            }
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);

        //数组的典型应用：冒泡排序：降序排序
        //外层循环控制比较的轮次，数组有多少数据比较多少轮
        for(int i = 0; i < scores.length; i++){ //外层循环控制轮次
            for(int j = 0; j <scores.length-1; j++){ //内层循环控制每轮比较的次数
                //比较相邻的两个元素
                if(scores[j] < scores[j+1]){
                    //交换两个元素
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }
        System.out.println(scores); //数组的内存地址
        //Arrays是一个类，toString是一个方法，把数组的内容转换成字符转
        System.out.println("排序后:"+ Arrays.toString(scores)); //数组的内容
    }
}
