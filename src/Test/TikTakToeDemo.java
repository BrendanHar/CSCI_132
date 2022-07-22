package Test;

import java.util.Scanner;

public class TikTakToeDemo {

    public static void main(String[] args){
        Scanner input_1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = input_1.nextInt();

        TikTakToe game_1 = new TikTakToe();

        TikTakToeOpponent opponent = new TikTakToeOpponent(userInput);

        Object[][] nameArray = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
                {"Sam", "Peter", "Sarah", "Mai", "Henry", "Max", "Holly", "Jennifer", "Bill", "Franklin", "Morgan", "Glen", "Dustin", "Milly", "Gabby"}
        };

        for (int i= 0; i <nameArray.length; i++){
            for (int j = 0; j<nameArray[0].length; j++){
                nameArray[i][j]= i;
                System.out.print(nameArray[i][j]+ " ");

            }
//            System.out.print("");
        }

        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.print("------------------------------");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.print("------------------------------");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");
        System.out.printf("%6s","%6s","%6s", '|',"|","|");

//        System.out.print(TikTakToeOpponent.getnameArray());

    }
}
