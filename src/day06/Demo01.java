package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections 工具类
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Float> fs = new ArrayList<>();

        fs.add(10.0f);
        fs.add(1.0f);
        fs.add(100.0f);
        fs.add(50.0f);

        System.out.println(Collections.max(fs));//最大值
        System.out.println(Collections.min(fs));//最小值
        //排序
        Collections.sort(fs);
        System.out.println(fs);
        //二分查找,在升序排序中查找，查到了返回索引
        int i = Collections.binarySearch(fs,100.0f);
        System.out.println(i);
        //查不到，返回 -(插入点+1) 插入点表示在第几个元素后插入
        System.out.println(Collections.binarySearch(fs,60.0f));
    }
}
