package com.javase.demo.extendDemo;
/*
    手机类
 */
public class Phone extends Goods {

    private String colour;// 颜色
    private double money;// 价格

    public Phone(){
        super();
    }

    public Phone(String number, String name, int time, String brand, String colour) {
        super(number, name, time, brand);
        this.colour = colour;
    }

    /**
     * 获取颜色
     * @return
     */
    public String getColour() {
        return "red";
    }

    /**
     * 设置颜色
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * 获取价格
     * @return
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置颜色
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }


}
