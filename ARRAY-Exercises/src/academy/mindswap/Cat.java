package academy.mindswap;

public class Cat {

    private int age;
    private int weight;
    private String[] catBreed = new String[2];


    public Cat(int age, int weight, String[] catBreed) {
        this.age = age;
        this.weight = weight;
        this.catBreed = catBreed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String[] getCatBreed() {
        return catBreed;
    }
}
