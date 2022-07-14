package day04;

/*
练习：圆类：
    属性：r 定义成私有的
    方法：get、set方法（对r参数检查，<=0报错）、构造方法、toString方法、面积、周长
  圆柱从圆类继承：
    属性：继承父类的属性r，同时有自己的属性：h(高)
    方法：get、set方法，构造方法、toString方法(重写父类)，面积(重写父类)，tiji
 */
public class Demo02 {
    public static void main(String[] args) {
        //调用有参构造方法创建对象并实例化参数
        Circle ci = new Circle(5);
        double mj = ci.mianJi();
        double zc = ci.zhouChang();
        System.out.println(mj);
        System.out.println(zc);
        System.out.println(ci);
        System.out.println("======================");

        Cylinder cy = new Cylinder(6,8);
        double mj1 = cy.mianJi();
        double tj = cy.tiJi();
        System.out.println(mj1);
        System.out.println(tj);
        System.out.println(cy);

    }
}

class Circle{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r > 0){
            this.r = r;
        }else{
            System.out.println("输入参数不合法");
        }

    }

    public double mianJi(){
        return Math.PI * r * r;
    }

    public double zhouChang(){
        return Math.PI * r * 2;
    }


    public String toString() {
        return "Circle{" + "r=" + r + '}';
    }
}

class Cylinder extends Circle{

    private double h;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if(h > 0){
            this.h = h;
        }else{
            System.out.println("输入参数不合法");
        }
    }

    //调用父类的构造方法
    public Cylinder(double r) {
        super(r);
    }

    public Cylinder(double r, double h) {
        super(r); //调用父类的构造方法给半径赋值
        this.h = h; //给高赋值
    }

    //重写父类的mianJi()方法
    public double mianJi(){
        double r = super.getR();
        return 2 * Math.PI * r * (r + h) ;
    }

    //增加tiJi()方法
    public double tiJi(){
        return super.mianJi() * h;
    }

    //重写父类的toString()方法
    public String toString() {
        return "Cylinder{" + "r=" + super.getR() + ", h=" + this.getH() + ", 表面积=" + this.mianJi() + ", 体积=" + this.tiJi() + "}";
    }

}