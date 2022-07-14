package day03;
/*
方法的重载：类里面重名的方法，方法名相同，方法的参数类型、参数个数、参数顺序不一样。
   System.out.println() 是重载的方法，调用起来比较简单
1、仅有返回值类型不同，不构成重载，系统无法自动识别该调用哪个方法。
2、仅有形参名称不同，也不构成重载。
 */
public class Demo02 {
    public static void main(String[] args) {
        //根据传的参数，自动选择合适的方法去调用
        System.out.println(Add.add(10,20));
        System.out.println(Add.add(10.0f,20.0f));
        System.out.println(Add.add(10,20,"30"));
        System.out.println(Add.add("30",10,20));
        System.out.println("=======================");
        System.out.println(Add.add(10,20,30,40,50));

        System.out.println(Max.max(10,20));
        System.out.println(Max.max(10.0f,20.0f,30.0f));
        System.out.println(Max.max(10.0,20.0,30.0,40.0));

    }
}

class Add{
    //static静态修饰的方法，用类名.方法名直接调用
    //方法名相同;方法的参数类型、参数个数、参数顺序不同。
    public static int add(int a, int b){
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    public static float add(float a, float b){
        System.out.println("float add(float a, float b)");
        return a + b;
    }

    public static String add(int a, int b, String c){
        System.out.println("String add(int a, int b, String c)");
        return a + b + c;
    }

    public static String add(String c, int a, int b){
        System.out.println("String add(String c, int a, int b)");
        return c + a + b;
    }

    /*
    nums是一个可变参数，可变参数只能放到最后，且一个方法只有一个可变参数。
    可变参数可以当做一个数组来处理。
     */
    public static int add(int a,int ... nums){
        System.out.println("int add(int a, int ... nums)");
        int sum = a;
        for(int n : nums){
            sum += n;
        }
        return sum;
    }
}

/*
练习：Max类中定义重载Max方法，返回最大值
两个int类型的参数
三个float类型的参数
可变个double类型的参数
 */

class Max{
    public static int max(int a, int b){
        int sun;
        if(a > b){
            sun = a;
        }else{
            sun = b;
        }
        return sun;
    }

    public static float max(float a, float b, float c){
        /*
        float sun = a;
        if(b > sun){
            sun = b;
        }
        if(c > sun){
            sun = c;
        }
        return sun;
        */

        /*
        Math.max(a,b) 调用数学中的方法求两数中的最大值
        float max = Math.max(a, b);
        return Math.max(max, c);
         */

        float max = a > b ? a : b;//三元运算符
        return max > c ? max : c;
    }

    public static double max(double ... sums){
        double max = sums[0];
        for(int i = 1; i < sums.length; i++){
            if(sums[i] > max){
                max = sums[i];
            }
        }
        return max;
    }
}