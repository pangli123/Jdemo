package com.atguigu.trycatch;

import java.io.IOException;
import java.lang.reflect.*;

public class TryCatchTest {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        TryCatchTest dt=new TryCatchTest();
               StringBuffer bf=new StringBuffer("ff");
               StringBuffer kk=bf.append("vv");
        Domot domot=new Domot();
               Class c=dt.getClass();
               ClassLoader classLoader=c.getClassLoader();
                System.out.println(classLoader);
               System.out.println(classLoader.getParent());
                System.out.println(classLoader.getParent().getParent());
        System.out.println("*****************");
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        System.out.println("99999999999999999999");
          Class cl=Person.class;
       /* Person p2=(Person)cl.newInstance();
        System.out.println(p2);*/
       Class parss[]=new Class[1];
        parss[0]=Integer.TYPE;
        Constructor constructor=  cl.getDeclaredConstructor(parss);
        Object[] obj=new Object[1];
        obj[0]=new Integer(3);
        Person p=(Person) constructor.newInstance(obj);

        System.out.println(p);
          Field[] fields= cl.getDeclaredFields();
        System.out.println(fields.length);
          for(Field field:fields){
              System.out.println(field.getName()+" "+field.getType());
          }

        System.out.println("333333333333333");
        Method[] methods= cl.getDeclaredMethods();
        System.out.println(methods.length);
        for(Method ethod:methods){
            Parameter[] parameters =ethod.getParameters();
            System.out.println(ethod.getName()+" "+parameters.length);
            for (Parameter parameter:parameters) {
                System.out.println("vvvvvvvvvv   "+parameter.getName()+" "+parameter.getType());
            }
        }
    }

}
