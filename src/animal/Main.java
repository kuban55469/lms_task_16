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

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Animal[] animals1 = {
                new Shark("Baby"),
                new Shark("Rip"),
                new Shark("Rip"),
                new Shark("Rip"),
                new Shark("Rip"),
                new Shark("Rip"),
                new Shark("Rip"),
                new Turtle("Donatella"),
                new Turtle("Donatella"),
                new Turtle("Donatella"),
                new Turtle("Mikelanjela"),
                new Turtle("Rafael"),
                new Turtle("Rafael"),
                new Turtle("Rafael"),
                new Turtle("Rafael"),
                new Eagle("Sam"),
                new Eagle("Alex"),
                new Eagle("Macho"),
                new Eagle("Macho"),
                new Eagle("Macho"),
        };

        int sh = 0;
        int tr = 0;
        int ea = 0;
//

        for (Animal animal : animals1) {
            animal.eat();
            if (animal instanceof Shark){
                ((Shark) animal).attack();
                sh++;
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
                tr++;
            }else if (animal instanceof  Eagle){
                ((Eagle) animal).fly();
                ea++;
            }
        }

        System.out.println();

        Shark[] sharks = new Shark[sh];
        System.out.println("Sharks is num: " + sh);

        System.out.println();

        Turtle[] turtles = new Turtle[tr];
        System.out.println("Turtle is num: " + tr);

        System.out.println();

        Eagle[] eagles = new Eagle[ea];
        System.out.println("Eagles is num: " + ea);
    }
}
