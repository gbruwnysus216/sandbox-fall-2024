package com.sandbox.comparable_GB;

public class Fruit implements Comparable<Fruit> {

    //fields
    protected String name;
    protected String color;
    protected String size;
    protected int qty;

    public Fruit(String name, String color, String size, int qty) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.qty = qty;
    }

    public Fruit(){
        this.name = "";
        this.color = "";
        this.size = "";
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public int compareTo(Fruit that){

        int nameComparison = this.name.compareTo(that.name);
        if(nameComparison != 0){
            return nameComparison;
        }

        int colorComparison = this.color.compareTo(that.color);
        if(colorComparison != 0){
            return colorComparison;
        }

        int sizeComparison = this.size.compareTo(that.size);
        if(sizeComparison != 0){
            return sizeComparison;
        }

        return Integer.compare(this.qty,that.qty);
    }
}