package animal;


import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Animal[] animals={
                new Shark("Toothy"),
                new Turtle("Nataniel"),
                new Eagle("Shot")
        };
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Shark) {
                if(animal.getClass().equals(Shark.class)) {
                    ((Shark) animal).attack();
                    System.out.println();
                }
            } else if (animal instanceof Turtle) {
                if (animal.getClass().equals(Turtle.class)){
                    ((Turtle) animal).swim();
                    System.out.println();
                }
            }else {
                if (animal instanceof Eagle){
                    ((Eagle) animal).fly();
                }
            }
        }

        Shark[] sharks = {
                new Shark("Toothy")
        };
        Turtle[] turtles = {
                new Turtle("Nataniel")
        };
        Eagle[] eagles = {
                new Eagle("Shot")
        };
    }
}
