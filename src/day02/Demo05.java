package day02;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

/*
数组的工具类：提供了一些方法，方便操作数组。Arrays
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] ids = {1,2,4,2,4,3,5,6};
        //toString() 数组转换成字符串
        System.out.println(Arrays.toString(ids));

        //sort 升序
        Arrays.sort(ids);//升序
        System.out.println("排序后:" + Arrays.toString(ids));

        //二分查找：升序的序列中，去查找某个元素是否存在，存在返回索引
        int index = Arrays.binarySearch(ids, 3);
        System.out.println("在数组中的位置:" + index);

        //插入点：如果这个元素在序列中存在，返回在这个序列中的位置(索引)
        //如果元素不存在序列中，返回 -(插入点+1)
        index = Arrays.binarySearch(ids, 5);
        System.out.println("不存在，返回 -(插入点+1):" + index);

        //fill 快速填充
        float[] fs = new float[5];
        Arrays.fill(fs, 100.0f);
        System.out.println(Arrays.toString(fs));

        //判断数组是否相等，
        //equals 比较的是数组里面的元素
        // == 比较的是数组的内存地址
        int[] a = {1,2,3,4};
        int[] b = {1,2,3};
        int[] c = {4,3,2,1};
        int[] d = {1,2,3,4};
        System.out.println(Arrays.equals(a, b)); //false
        System.out.println(a == b); //false
        System.out.println(Arrays.equals(a, d)); //true
        System.out.println(a == d); //false
        System.out.println(Arrays.equals(a, c)); //false

    }
}
