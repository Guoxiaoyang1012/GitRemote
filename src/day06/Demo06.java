package day06;

import java.util.ArrayList;
import java.util.List;

/*
单元测试:对方法的测试。Java单元测试框架，Junit（JDK自带）、TestNg
单元测试是开发人员对代码进行的基本功能的测试。有一些公司可能由测试人员来做
单元测试属于白盒测试
实际开发中有时间、有精力、有能力做单元测试的产品比较少。

测试驱动开发：Test - Driven Development TDD
在开发实现功能代码之前，先将测试代码写出来

 */
public class Demo06 {
    /*
    创建一个静态方法，qiePian（类似Pythong中的切片），三个参数：
    第一个参数是一个整数列表，第二个参数是起始索引，第三个参数是结束索引。
    返回从开始到结束的子列表（包含开始和结束）

    对参数进行检查。

    设计用例，对该方法进行测试。（main方法中传不同的参数，调用该方法）
    */

    public static List<Integer> qiePian(List<Integer> list, int start, int end){
        List<Integer> ret = new ArrayList<>();
        if(list == null || list.size() == 0){
            System.out.println("列表为空");
            return null;
        }
        if(start < 0 || start >= list.size()){
            System.out.println("起始索引不正确");
            return null;
        }
        if(end < start || end >= list.size()){
            System.out.println("结束索引不正确");
            return null;
        }

        //取子列表
        for(int i = start; i <= end; i++){
            ret.add(list.get(i));
        }
        return ret;
    }

    /*
    满足判定条件覆盖，要设计哪些用例？
        判定：1 a > b && b > 0 为真
              2 a > b && b > 0 为假
              3 a > 6 || b > 2 为真
              4 a > 6 || b > 2 为假
        条件：
             5 a > b 为真，6 a <= b 为假
             7 b > 0 为真，8 b <= 0 为假
             9 a > 6 为真，10 a <= 6 为假
             11 b > 2 为真，12 b <= 2 为假

        用例1：a = 8, b = 4 (1 3 5 7 9 11)
        用例2：a = 0, b = 0 (2 4 6 8 10 12)

        设计上面两个用例，可以满足判定条件覆盖，每个判定的true/false至少覆盖一次
        每个条件的true/false至少覆盖一次。


     */
    public static int panDingTiaoJian(int a, int b){
        int ret = 0;
        if(a > b && b > 0){
            ret = a / b;
        }
        if(a > 6 || b > 2){
            ret = a * b;
        }else{
            ret = 0;
        }
        return ret;
    }

}
