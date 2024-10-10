package com.sandbox.comparable_GB;

public class Orange extends Fruit {

    public Orange(String name, String color, String size, int qty) {
        super(name, color, size, qty);
    }

    public Orange() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange{");
        sb.append("Name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append(", qty=").append(qty);
        sb.append('}');
        return sb.toString();
    }

}
