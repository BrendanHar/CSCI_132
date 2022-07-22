package DrunkByDaylightRoulette;

public class KillerDrinks {

    int selector;


    public int getSelector() {
        return selector;
    }


    //

    public void findDrinks(){

        if (selector >= 0 && selector < 8){
            System.out.println("If you play Nurse you have to drink a shot");
        }
        if (selector >= 8 && selector < 16){
            System.out.println("If you play Huntress you have to drink a shot");
        }
        if (selector >= 16 && selector < 24){
            System.out.println("If you play Hillbilly you have to drink a shot");
        }
        if (selector >= 24 && selector < 32){
            System.out.println("If you play Wraith you have to drink a shot");
        }
        if (selector >= 32 && selector < 45){
            System.out.println("If you play Trapper you have to drink a shot");
        }
        if (selector >= 45 && selector < 49){
            System.out.println("If you play Spirit you have to drink a shot");
        }
        if (selector >= 49 && selector < 53){
            System.out.println("If you play Hag you have to drink a shot");
        }
        if (selector >= 53 && selector < 57){
            System.out.println("If you play Oni you have to drink a shot");
        }
        if (selector >= 57 && selector < 61){
            System.out.println("If you play Nightmare you have to drink a shot");
        }
        if (selector >= 61 && selector < 65){
            System.out.println("If you play Triangle Head you have to drink a shot");
        }
        if (selector >= 65 && selector < 70){
            System.out.println("If you play Pig you have to drink a shot");
        }
        if (selector >= 70 && selector < 75){
            System.out.println("If you play Plague you have to drink a shot");
        }
        if (selector >= 75 && selector < 80){
            System.out.println("If you play Deathslinger you have to drink a shot");
        }
        if (selector >= 80 && selector < 83){
            System.out.println("If you play Ghostface you have to drink a shot");
        }
        if (selector >= 83 && selector < 86){
            System.out.println("If you play Doctor you have to drink a shot");
        }
        if (selector >= 86 && selector < 89){
            System.out.println("If you play Bubba you have to drink a shot");
        }
        if (selector >= 89 && selector < 93){
            System.out.println("If you play Clown you have to drink a shot");
        }
        if (selector >= 93 && selector < 97){
            System.out.println("If you play Michael Myers you have to drink a shot");
        }
        if (selector >= 97 && selector < 100){
            System.out.println("If you play Demigorgan you have to drink a shot");
        }
    }
}
