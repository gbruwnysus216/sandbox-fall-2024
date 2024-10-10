package com.sandbox.comparable_GB;

public class Apple extends Fruit implements Comparable<Fruit>{

    public Apple(String name, String color, String size, int qty) {
        super(name, color, size, qty);
    }

    @Override
    public int compareTo(Fruit fruit){

        int nameComparison = this.getName().compareTo(fruit.getName());
        if(nameComparison != 0){
            return nameComparison;
        }

        int colorComparison = this.getColor().compareTo(fruit.getColor());
        if(colorComparison != 0){
            return colorComparison;
        }

        int sizeComparison = this.getSize().compareTo(fruit.getSize());
        if(sizeComparison != 0){
            return sizeComparison;
        }

        return Integer.compare(this.getQty(), fruit.getQty());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange{");
        sb.append("type='").append(this.getName()).append('\'');
        sb.append(", color='").append(this.getColor()).append('\'');
        sb.append(", size='").append(this.getSize()).append('\'');
        sb.append(", qty=").append(this.getQty());
        sb.append('}');
        return sb.toString();
    }


}
