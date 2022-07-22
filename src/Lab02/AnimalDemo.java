package Lab02;

import java.util.*;

public class AnimalDemo {

    public static void main(String[] args){
        Animal a = new Animal();
        Animal c;
        Animal b;
        b = new Animal();
        c = new Animal("Jimmy", 3,"Squirrel");
        System.out.println(b);
        System.out.println(c);

        System.out.println("Enter new Animal Name: ");

        Scanner input_1 = new Scanner(System.in);
        String name = input_1.nextLine();
        a.setName(name);

        System.out.println("Set Age: ");

        Scanner input_2 = new Scanner(System.in);
        Integer age = input_2.nextInt();
        a.setAge(age);

        System.out.println("Set Species: ");
//        Scanner input_3 = new Scanner(System.in);
        String species = input_1.nextLine();
        a.setSpecies(species);

        System.out.println(b);
        System.out.println(c);
        System.out.println(a);

    }
}
