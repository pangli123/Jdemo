package com.atguigu.clone;

public class Achievement implements Cloneable{
    private float Chinese;
    private float math;
    private float English;


    public Achievement(float chinese, float math, float english) {
        Chinese = chinese;
        this.math = math;
        English = english;
    }

    public void setChinese(float chinese) {
        Chinese = chinese;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public void setEnglish(float english) {
        English = english;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "Chinese=" + Chinese +
                ", math=" + math +
                ", English=" + English +
                '}';
    }

    @Override
    public Achievement clone() throws CloneNotSupportedException {
        return  (Achievement)super.clone();
    }


}
