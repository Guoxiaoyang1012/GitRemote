package day02;
/*
break(跳出循环退出程序)、continue(结束循环继续执行)
 */
public class Demo02 {
    public static void main(String[] args) {
        //打印1~10之间的数字，遇到4的倍数退出。 break
        aaa: //标签名，自定义的
        for(int j = 0; j < 3; j++) { //打印三遍
            for (int i = 1; i <= 10; i++) {
                if (i % 4 == 0) {
                    // break; //跳出包含break这个关键字的最近一层循环
                    break aaa;  //跳出有aaa关键字的这层循环
                }
                System.out.print(i); //打印到一行
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------");//换行

        //打印1~10之间的数字，遇到4的倍数不打印。 continue
        bbb: //标签
        for(int j = 0; j < 3; j++) { //打印三遍
            for (int i = 1; i <= 10; i++) {
                if (i % 4 == 0) {
                    // continue; //结束包含continue关键字的最近一层循环
                    continue bbb; //结束有bbb标签的这层循环
                }
                System.out.print(i); //打印到一行
            }
            System.out.println();
        }



    }
}
