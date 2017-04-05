package myExample.itrator;

import example.iterator.*;

/**
 * Created by Владислав on 04.04.2017.
 */
public class Store implements Collection {
    String name;
    String[] pruduct;

    public Store(String name, String[] pruduct) {
        this.name = name;
        this.pruduct = pruduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPruduct() {
        return pruduct;
    }

    public void setPruduct(String[] pruduct) {
        this.pruduct = pruduct;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }
    private class ProductIterator implements Iterator{
  int index;
        @Override
        public boolean hasNext() {
            if (index < pruduct.length) return true;
            else return false;
        }

        @Override
        public Object next() {
            return pruduct[index++];
        }
    }
}
