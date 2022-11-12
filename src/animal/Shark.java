package animal;

public class Shark extends Animal{

    public Shark(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Shark name is: " + getName());
    }

    public void attack(){
        System.out.println(getName() + " hunt turtle.");
    }
}
