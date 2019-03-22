package com.javase.demo.extendDemo;
/*
    汽车类
 */
public class Car extends Goods {

    private int dateOfProduction;// 出厂时间
    private String model;// 型号

    public Car(){

        super();
    }

    public Car(String number, String name, int time, String brand, int dateOfProduction) {
        super(number, name, time, brand);
        this.dateOfProduction = dateOfProduction;
    }

    /**
     * 获取出厂日期
     * @return
     */
    public int getDateOfProduction() {
        return dateOfProduction;
    }

    /**
     * 设置出厂日期
     * @param dateOfProduction
     */
    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    /**
     * 获取型号
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }
}
