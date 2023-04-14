package com.atguigu.clone;

public class Person  implements Cloneable{
    private String name;
    private int  age;
    private Achievement achievement;

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person=(Person)super.clone();
        Achievement achievement=person.getAchievement().clone();
        person.setAchievement(achievement);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + achievement +
                '}';
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

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }
}
