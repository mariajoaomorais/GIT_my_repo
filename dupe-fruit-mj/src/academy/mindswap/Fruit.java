package academy.mindswap;

import java.util.Objects;

public abstract class Fruit implements Comparable <Fruit>{

    private int acidity;
    private String name;

    public Fruit(int acidity, String name) {
        this.acidity = acidity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "acidity=" + acidity +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return acidity == fruit.acidity && name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acidity, name);
    }

    @Override
    public int compareTo(Fruit o) {
        return acidity - o.acidity;
    }
}