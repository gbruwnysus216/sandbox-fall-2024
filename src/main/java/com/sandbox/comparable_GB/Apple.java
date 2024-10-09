package com.sandbox.comparable_GB;

public class Apple extends org.example.sandbox.comparable.Fruit implements Comparable<org.example.sandbox.comparable.Fruit>{

    @Override
    public int compareTo(org.example.sandbox.comparable.Fruit fruit){

        int nameComparison = this.name.compareTo(fruit.name);
        if(nameComparison != 0){
            return nameComparison;
        }

        int colorComparison = this.color.compareTo(fruit.color);
        if(colorComparison != 0){
            return colorComparison;
        }

        int sizeComparison = this.size.compareTo(fruit.size);
        if(sizeComparison != 0){
            return sizeComparison;
        }

        return Integer.compare(this.qty,fruit.qty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange{");
        sb.append("type='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append(", qty=").append(qty);
        sb.append('}');
        return sb.toString();
    }


}
