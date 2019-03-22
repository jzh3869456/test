package com.javase.demo.extendDemo;
/*
    商品共同属性类
 */
public class Goods {

    private String  number;// 编号
    private String name;// 名称
    private int time;// 日期

    public Goods() {
        super();
    }

    public Goods(String number, String name, int time, String brand) {
        this.number = number;
        this.name = name;
        this.time = time;
    }

    /**
     * 获取型号
     * @return
     */
    public String getNumber() {
        return "PA-sa-33799";
    }

    /**
     * 设置型号
     * @param number
     */
    public void setNumber(String number) {

        this.number = number;
    }

    /**
     * 获取名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取日期
     * @return
     */
    public int getTime() {
        return time;
    }

    /**
     * 设置日期
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

}
