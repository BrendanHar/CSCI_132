package Lab03;

public class Dog extends Pet{

    public Dog(String name, int birthMonth, int birthDate, int birthYear){
        super(name, birthMonth, birthDate, birthYear);
    }
    @Override
    public int getAgeInHumanYears() {
        if (super.getAge() == 0)
            return 0;
        else if (super.getAge()== 1)
            return 15;
        else if (super.getAge() == 2)
            return 24;
        else
            return 25 + ((super.getAge()-2)*4);
    }


}
