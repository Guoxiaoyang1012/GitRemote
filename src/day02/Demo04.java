package day02;

import java.util.Scanner;

/*
数组不初始化时，有默认的初始值。默认的是对应类型的0值
 int : 0
 float: 0.0
 boolean: false
 String: null
 char : 0

 二维数组：可以看做一个一维数组，里面的元素是一维数组
 */
public class Demo04 {
    public static void main(String[] args) {
        //定义一个数组，未初始化
        float[] fs = new float[5];

        for(float f : fs){
            System.out.println(f);
        }

        //一维数组可以存放学生的姓名和分数
        //二维数组可以同时存放学生的学号和分数
        //4*2的数组
        int[][] students = new int[][] {{1001,90}, {1002,98}, {1003,88}, {1004,85}};
        System.out.println("第一个学生的学号:" + students[0][0]);
        System.out.println("第一个学生的分数:" + students[0][1]);

        System.out.println(students.length); //4
        System.out.println(students[0].length);//2


        //遍历数组for循环
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < students[i].length; j++){
                System.out.print(students[i][j] + "\t");
            }
            System.out.println();
        }

        //遍历数组 foreach循环
        for (int[] student : students){ //二维数组的元素为一维数组
            for(int s : student){
                System.out.print(s + "\t");//每个学生的信息打印到一行，\t分隔
            }
            System.out.println();//换行
        }

        /*
        练习：定义一个二维数组，float类型的，用来存放三个班级，每个班级5名学生的成绩
        成绩通过键盘输入。最后打印每个班级的总成绩
         */
        float[][] scores = new float[3][5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){ //外层循环遍历班级
            System.out.println("请输入第" + (i+1) + "个班的成绩:");
            float sum = 0;//存储总成绩
            for(int j = 0; j < scores[i].length; j++){ //内层循环遍历班级的每个学生成绩
                float s = scanner.nextFloat();
                scores[i][j] = s;//赋值
                sum += s;//求和
            }
            System.out.println("第" + (i+1) + "个班的总成绩为:" + sum);
        }




    }
}
