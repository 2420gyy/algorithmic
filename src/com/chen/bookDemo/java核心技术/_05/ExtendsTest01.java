package com.chen.bookDemo.java核心技术._05;

public class ExtendsTest01 {
    public static void main(String[] args) {
        /**
         * XXX is-a XXX
         * 经理是员工
         *
         * 里氏替换原则: 父类对象出现的地方可以用子类对象代替
         * 父类的引用指向子类
         * 
         *
         */
        Employee employee = new Employee();
        employee.doWork();
        employee.other();
        Employee e = new Manger();
        e.doWork();
        e.other();
    }

}


class Employee{
    public String name;

    public void doWork(){
        System.out.println("员工。。");
    }

    public void other(){
        System.out.println("员工1.。。");
    }
}

class Manger extends Employee{

    public void doWork(){
        System.out.println("经理。。");
    }

}
