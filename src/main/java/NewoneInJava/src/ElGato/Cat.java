package NewoneInJava.src.ElGato;

public class Cat {
    private String name;
    private double weight;

    public Cat() {
    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
