package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
1. 创建一个静态方法，qiePian（类似Pythong中的切片），三个参数：
   第一个参数是一个整数列表，第二个参数是起始索引，第三个参数是结束索引。
   返回从开始到结束的子列表（包含开始和结束）

   对参数进行检查。

   设计用例，对该方法进行测试。（main方法中传不同的参数，调用该方法）
 */
public class HomeWork {
    public static void main(String[] args) {
        //数组转换成列表
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //输入正确的参数
        System.out.println(qiePian(list,3,9));
        //结束索引大于起始索引
        System.out.println(qiePian(list,7,3));
        //索引超出列表长度
        System.out.println(qiePian(list,3,12));
        //索引小于0
        System.out.println(qiePian(list,-3,-9));
    }

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

}
