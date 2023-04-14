package com.atguigu.myantotaion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * autor 庞礼
 * date  2023-03-01
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Fruit {
    String value() default "";
    int age();
}

class test{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
       Class clazz= Class.forName("com.atguigu.myantotaion.Apple");
       Fruit fruit= (Fruit)clazz.getAnnotation(Fruit.class);
       String s= fruit.value();
       int age= fruit.age();
        Method method=clazz.getMethod("say");
        Fruit fruit2= (Fruit)method.getAnnotation(Fruit.class);
        System.out.println(fruit2.value());


    }
}
@Fruit(value="{苹果,桃子}",age=23)
class Apple{

    @Fruit(value="例子",age=35)
    public void say(){
        System.out.println("fff");
    }
}