package myExample.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class Building {
    private String name;
    private int price;
    private Type type;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
