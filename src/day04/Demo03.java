package day04;
/*
多态：子类对象可以作为父类对象来使用。
Dog 宠物狗，即是宠物狗类型，也是宠物类型的
 */
public class Demo03 {
    //给宠物狗看病的方法
    public static void doctor(Dog dog) { //支持Dog类型以及Dog类型的子类
        if(dog.getHealth() < 60){
            System.out.println("打针吃药");
            int health = dog.getHealth() + 10;//健康度提升
            dog.setHealth(health);//设置狗的健康度
        }else{
            System.out.println("洗澡按摩");
            int health = dog.getHealth() + 5;//健康度提升
            dog.setHealth(health);//设置狗的健康度
        }
    }

    public static void doctor_shenyi(Pet pet) { //支持Pet类型以及Pet类型的子类
        if(pet.getHealth() < 60){
            System.out.println("打针吃药");
            int health = pet.getHealth() + 10;//健康度提升
            pet.setHealth(health);//设置狗的健康度
        }else{
            System.out.println("洗澡按摩");
            int health = pet.getHealth() + 5;//健康度提升
            pet.setHealth(health);//设置狗的健康度
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小黑",3,50);
        System.out.println(dog);
        doctor(dog);//静态方法的调用，同一个类中可直接调用；不同类中用类名.方法名调用
        doctor_shenyi(dog);
        System.out.println(dog);

        Pet pet = new Pet("小黄",4,50);
        System.out.println(pet);
        //doctor(pet); //宠物类型的对象不能使用这个方法
        doctor_shenyi(pet);
        /*
        多态的特点：doctor_shenyi的参数是Pet类型，可以传Pet类型的参数，
        也可以传Pet子类类型的参数
        子类的对象可以当做父类的对象来使用
         */
    }
}
