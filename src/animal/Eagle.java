package animal;

public class Eagle extends Animal{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eagle name is: " + getName());
    }

    public void fly(){
        System.out.println(getName() + " hunt turtle.");
    }


}
