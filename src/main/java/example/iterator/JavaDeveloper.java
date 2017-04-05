package example.iterator;

/**
 * Created by Владислав on 04.04.2017.
 */
public class JavaDeveloper implements Collection {
    private String name;
    private String[] skils;

    public JavaDeveloper(String name, String[] skils) {
        this.name = name;
        this.skils = skils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkils() {
        return skils;
    }

    public void setSkils(String[] skils) {
        this.skils = skils;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIyerataror();
    }

    private class SkillIyerataror implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < skils.length) return true;
            else return false;

        }

        @Override
        public Object next() {
            return skils[index++];
        }
    }
}
