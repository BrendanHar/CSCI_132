package Lab03;

public class Cat extends Pet {

        public Cat(String name, int birthMonth, int birthDate, int birthYear){
            super(name, birthMonth, birthDate, birthYear);
        }
            @Override
            public int getAgeInHumanYears() {
                if (super.getAge() == 0)
                    return 0;
                else if (super.getAge() == 1)
                    return 15;
                else if (super.getAge() == 2)
                    return 25;
                else
                    return 25 + ((super.getAge()-2)*4);
            }

}
