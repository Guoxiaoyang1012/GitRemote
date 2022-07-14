package day04;
/*
static 静态的
1、修饰方法，方法属于类的，用类名.方法名调用
   没有用static修饰的，方法属于实例的，用实例.方法名调用
2、修饰属性，属性属于类，所有实例共享这一个属性
   没有用static修饰的属性，属性属于实例，每个实例都有自己的属性
 */
public class Demo08 {
    public static void main(String[] args) {
        Voter v1 = new Voter("张飒");
        v1.vote();//非static的方法，用实例.方法名调用
        Voter.getCount();//static方法，用类名.方法名调用

        for(int i = 0; i < 20; i++){
            Voter v = new Voter("选民" + i);
            v.vote();
            Voter.getCount();
        }


    }
}

/*
选民类：每个选民有自己的名字。name
       统计票数的属性，所有选民共享的属性。count
 */
class Voter{
    String name;//每个实例有自己的名字。实例.属性名调用
    static int count;//所有实例共享。类名.属性名调用

    //构造方法
    public Voter(String name){
        this.name = name;
    }

    //投票方法：如果总票数达到20票时，停止投票。否则可以投票，投完票给数量加1
    public void vote(){
        if(count == 20){
            System.out.println(name + "投票结束，谢谢！");
        }else{
            System.out.println(name + "欢迎投票，谢谢！");
            count = count + 1;
        }
    }

    //打印当前的票数
    public static void getCount(){
        //System.out.println(name); static修饰的方法中不能用实例的属性
        System.out.println("当前投票数量：" + count);
    }
}