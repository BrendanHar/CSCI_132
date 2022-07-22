package Test;

import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TikTakToeOpponent {

    public TikTakToeOpponent(int input){}
//    int nameArray[][] = new int[15][2];
    Object[][] nameArray = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
        {"Sam", "Peter", "Sarah", "Mai", "Henry", "Max", "Holly", "Jennifer", "Bill", "Franklin", "Morgan", "Glen", "Dustin", "Milly", "Gabby"}
    };
//    public int chooseName(int input){}



    public Integer markerInput(Integer input) {
        return null;
    }

    public Object getNameArray(){

        for (int i= 0; i <nameArray.length; i++){
            for (int j = 0; j<nameArray[0].length; j++){
                nameArray[i][j]= i;
                System.out.print(nameArray[i][j]+ " ");

            }
//            System.out.print("");
        }
        return "end List.";
//        Scanner sc = new Scanner(new BufferedReader(new FileReader("sample.txt")));
//        while(nameArray.hasNextLine()){
//            for (int i=0; i<nameArray.length; i++){
//                String[] line = sc.nextLine().trim().split(" ");
//                for (int j=0; j<line.length; j++){
//                    nameArray[i][j] = Integer.parseInt(line[j]);
//                }
//            }
//        }
//        return nameArray;
    }
}
