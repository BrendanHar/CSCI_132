package Lab02;

import javax.xml.namespace.QName;

public class Animal {

    private String name = "Unamed";
    private int age = -1;
    private String species = "Squirrel";

    Animal(String theName, Integer theAge, String theSpecies){
        this.name = theName;
        this.age = theAge;
        this.species = theSpecies;
    }
    Animal(){
        this.name = "Unamed";
        this.age = -1;
        this.species = "Unknown";
    }
        //input.next

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public Integer setAge(Integer age){
        this.age = age;
        return this.age;
    }

    public String setSpecies(String species){
        this.species = species;
        return this.species;
    }
    public String getSpecies(){
        return this.species;
    }

    public String toString() {
        return "Name: " + name + ". Age: " + age + ". Species: " + species + ".";
    }
    }

