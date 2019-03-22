package com.javase.demo.abstractDemo;
/*
    动物抽象父类
 */
public abstract class Animal {

    private String animalName;
    private int animalAge;

    public Animal() {
        super();
    }

    /**
     * 获取动物名称
     * @return
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * 设置动物名称
     * @param animalName
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     * 获取动物年龄
     * @return
     */
    public int getAnimalAge() {
        return animalAge;
    }

    /**
     * 设置动物年龄
     * @param animalAge
     */
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    /**
     * 动物叫抽象方法
     * @return
     */
    public abstract String  called();
}
