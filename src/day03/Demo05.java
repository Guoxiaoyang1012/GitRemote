package day03;

import java.util.Arrays;

/*

 */
public class Demo05 {
    public static void main(String[] args) {
        //公司内有三个员工，定义一个员工数组
        Employee[] employees = new Employee[3];
        //调用有参构造方法实例化对象
        Employee e1 = new Employee("张三",10000);
        Employee e2 = new Employee("李四",12000);
        Employee e3 = new Employee("王五",15000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        System.out.println(Arrays.toString(employees));
        //涨工资 调用方法  类名.increaseSalary()
        Employee.increaseSalary(employees);
        System.out.println(Arrays.toString(employees));


    }
}

/*
员工类：
    属性：姓名、工资
 */
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /*
    每个员工涨工资10%  用static修饰的方法，用类.方法名调用
     */
    public static void increaseSalary(Employee[] employees){
        for(Employee employee : employees){
            employee.salary = employee.salary * 1.1;
        }
    }
    //没有用static修饰，属于实例的，属于每个对象的。实例.方法名调用
    public String toString(){
        return "Employee{name=" + name + ",salary=" + salary + "}";
    }
}