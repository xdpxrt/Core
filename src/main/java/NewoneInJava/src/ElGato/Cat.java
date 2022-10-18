package NewoneInJava.src.ElGato;

public class Cat {
    private String name;
    private double weight;
    private boolean status;
    private int happy;
    private Color color;

    public Cat() {
    }

    public Cat(String name,Color color, double weight, boolean status, int happy) {
        this.name = name;
        this.weight = weight;
        this.status = status;
        this.happy = happy;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getHappy() {
        return this.happy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public String toString() {
        return "Name: " + getName() +" Color: " + color.getValue() + " Weight: " + getWeight() + " Alive: " + getStatus() + " Happy: " + getHappy();
    }
}
