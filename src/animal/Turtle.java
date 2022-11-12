package animal;

public class Turtle extends Animal{

    public Turtle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Turtle name is: " + getName());
    }

    public void swim(){
        System.out.println(getName() + " hiding under water from a shark.");
    }
}
