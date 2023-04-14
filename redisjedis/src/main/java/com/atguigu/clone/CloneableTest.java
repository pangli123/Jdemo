package com.atguigu.clone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneableTest {

    public static void main(String[] args) throws CloneNotSupportedException {
       int x= 8 >> 4;
        System.out.println(x);
        List list=new ArrayList<>();
        list.add(23);
        int [] ass={1,3,5,7};
        int[] s=Arrays.copyOf(ass,20);
        System.out.println(s.length);
        System.out.println(s[1]);
        Person person=new Person();
        person.setAge(11);
        person.setName("张三");
        person.setAchievement(new Achievement(100,100,100));
        System.out.println(person);
        Person person1=(Person) person.clone();
        person.setName("lis");
        person.setAge(98);
        person.getAchievement().setChinese(9);
        person.getAchievement().setEnglish(9);
        person.getAchievement().setMath(9);
        System.out.println(person.toString());
        System.out.println(person1);


    }
}
