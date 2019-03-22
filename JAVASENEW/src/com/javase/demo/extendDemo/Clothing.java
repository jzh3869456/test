package com.javase.demo.extendDemo;
/*
    衣服
 */
public class Clothing extends Goods{

    private String colour;// 颜色
    private double size;// 尺码
    private double moeny;// 价格

    public Clothing(){
        super();
    }

    public Clothing(String colour, double size, double moeny) {
        this.colour = colour;
        this.size = size;
        this.moeny = moeny;
    }

    /**
     * 获取颜色
     * @return
     */
    public String getColour() {
        return colour;
    }

    /**
     * 设置颜色
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * 获取尺码
     * @return
     */
    public double getSize() {
        return size;
    }

    /**
     * 设置尺码
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * 获取价格
     * @return
     */
    public double getMoeny() {
        return moeny;
    }

    /**
     * 设置价格
     * @param moeny
     */
    public void setMoeny(double moeny) {
        this.moeny = moeny;
    }
}
