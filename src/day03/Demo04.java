package day03;

public class Demo04 {
    public static void main(String[] args) {
        Triangle tr = new Triangle(5.0,8.0,8.0);
        double mj = tr.mainJi();
        System.out.println(mj);
        double zc = tr.zhouChang();
        System.out.println(zc);

        String ty = tr.type();
        System.out.println(ty);
        System.out.println(tr.toString());
        System.out.println(tr);
    }
}
/*
练习：创建一个三角形的类，Triangle
    属性：a、b、c三条边长
    方法：1、构造方法，设置三条边长
          2、toString方法
          3、mainJi方法，计算面积(海伦公式：Math.sqrt开平方)
          4、zhouChang方法，计算周长
          5、type方法，返回三角形的类型(一般三角形、等边三角形、等腰三角形，不是三角形)
 */
class Triangle{
    double a;
    double b;
    double c;

    //有参构造方法
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public  double mainJi(){
        if(type().equals("参数不合法") || type().equals("不是三角形")){
            return 0;
        }else{
            double p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }


    }

    public  double zhouChang(){
        //字符串判等不能用==，==比较的是内存地址，equals比较的是具体的值
        if(type().equals("参数不合法") || type().equals("不是三角形")){
            return 0;
        }else {
            return a + b + c;
        }
    }

    public String type(){
        if(a <= 0 || b <= 0 || c <= 0){
            return "参数不合法";
        }else if(a == b && b == c){
            return "等边三角形";
        }else if(a == b || a == c || b == c){
            return "等腰三角形";
        }else if(a + b > c && a + c > b && b + c > a){
            return "一般三角形";
        }else{
            return "不是三角形";
        }

    }

    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", 类型=" + type() + ", 周长=" + zhouChang() + ", 面积=" + mainJi() +"}";
    }
}