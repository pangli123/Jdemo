package com.atguigu.trycatch;

public class Person {

    private String name;
    private int age;
    private String address;
    public Person(int age){
        super();
    }

    public  String run(String name,int bg){
        return "run";
    }

    public  void run2(){
        System.out.println("ggggg");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
