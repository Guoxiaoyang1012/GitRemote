package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
字典：Map接口，类似python里的字典。key-value,key是不允许重复的
Map接口的实现类: HashMap、TreeMap、LinkedHashMap
 */
public class Demo05 {
    public static void main(String[] args) {
        //<>中分别是key的类型，value的类型
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("CNY","人民币");
        map.put("USD","美元");
        map.put("HKD","港币");
        map.put("GBP","英镑");
        System.out.println(map);
        //修改元素
        map.put("CNY","Chinese Yuan");
        System.out.println(map);
        //根据key删除元素
        String v = map.remove("CNY");
        System.out.println(v);
        System.out.println(map);

        //判断key是否存在
        if(map.containsKey("TWD")){
            System.out.println(map.get("TWD"));
        }else{
            map.put("TWD","新台币");
            System.out.println(map.get("TWD"));
        }
        System.out.println(map);

        boolean bool = map.containsKey("CNY");
        System.out.println(bool);

        //判断value是否存在
        bool = map.containsValue("人民币");
        System.out.println(bool);

        //遍历Map，先获取所有的key值并转换成集合
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "\t" + map.get(key));
        }

        String str = new String("ababscdnd");
        System.out.println(countCharacter(str));

        System.out.println(countCharacter("您好！Hello World. Hi World"));

    }

    /*
    练习：封装一个静态方法，输入一个字符串，统计字符串中每个字符出现的次数
    用Map来储存结果，返回这个Map
     */
    public static Map<Character,Integer> countCharacter(String str){
        Map<Character,Integer> ret = new HashMap<>();
        //遍历字符串中每一个字符
        for(int i = 0; i < str.length(); i++){
            //遍历字符串中每一个字符
            char c = str.charAt(i);
            //如果字符在Map中不存在，将字符加入Map，value设置为1
            if(!ret.containsKey(c)){
                System.out.println("字符：" + c + "在map中不存在");
                ret.put(c,1);
            }else{
                //如果字符在Map中存在，将value取出来，加1后再放进去
                int value = ret.get(c);
                System.out.println("字符：" + c + "在map中存在，当前个数为：" + value);
                ret.put(c,value + 1);
            }
        }
        return ret;
    }
}
