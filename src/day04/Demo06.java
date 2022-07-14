package day04;



/*
练习：
门(Door)：抽象类，开门、关门两个抽象方法
警报(Alarm)：接口，报警功能
普通门(CommonDoor)：门的子类，实现了开门、关门的方法
防盗门(AlarmDoor)：门的子类，实现了开门、关门的方法，实现警报功能，实现了usb功能：连接usb口给防盗门充电。
车(Car)：实现了报警功能
USB(Usb):接口，usb的功能。车实现了usb功能：连接车载充电器给手机充电
 */
public class Demo06 {
    public static void main(String[] args) {
        CommonDoor com = new CommonDoor();
        com.name = "小明";
        com.openDoor();
        com.closeDoor();

        //子类只能有一个父类，但可以实现多个接口
        AlarmDoor al = new AlarmDoor();
        al.name = "大黄";
        al.openDoor();
        al.closeDoor();
        al.baoJing();
        al.chongDian();

        Car car = new Car();
        car.name = "小黑";
        car.baoJing();
        car.chongDian();
    }
}

//抽象类：门
abstract class Door{
    String name;

    public abstract void openDoor();//抽象方法 开门

    public abstract void closeDoor();//抽象方法 关门
}

//接口：警报
interface Alarm{
    void baoJing();//接口的抽象方法 报警

}

//Usb接口
interface Usb{
    void chongDian();//接口的抽象方法：充电

}

//普通门继承门类
class CommonDoor extends Door{

    @Override
    public void openDoor() {
        System.out.println(this.name + "在开门！");
    }

    @Override
    public void closeDoor() {
        System.out.println(this.name + "在关门！");
    }
}

//防盗门继承门类，并实现了警报接口
class AlarmDoor extends Door implements Alarm,Usb{

    @Override
    public void openDoor() {
        System.out.println(this.name + "指纹识别成功，门打开了！");
    }

    @Override
    public void closeDoor() {
        System.out.println(this.name + "推门，门关上了，！");
    }

    @Override
    public void baoJing() {
        System.out.println("生人靠近，警报响了！");
    }

    @Override
    public void chongDian() {
        System.out.println(this.name + "连接Usb接口给防盗门充电");
    }
}

//车类实现了警报接口
class Car implements Alarm,Usb{
    String name;

    @Override
    public void baoJing() {
        System.out.println("车门被非法打开，警报响了！");
    }

    @Override
    public void chongDian() {
        System.out.println(name +"连接车载充电器充电");
    }
}
