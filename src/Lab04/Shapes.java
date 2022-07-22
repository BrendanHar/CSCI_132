package Lab04;

import java.util.Scanner;

public abstract class Shapes {

    private String color= "White";


    public String setColor(String userInput){
        if (userInput == ""){
            return "White";
        }
        else
            return userInput;
    }


    public String getColor() {
        return this.color;
    }
}


