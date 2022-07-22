package Lab5;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.print("Please enter a sentence: ");
        String stringInput = scan.nextLine();
        Sorter example = new Sorter(stringInput);
        while (choice != 9){
            System.out.println();
            System.out.println("Enter the number of the task you would like to perform.");
            System.out.println("1- To count the occurrences of a single letter.");
            System.out.println("2- To count the number of words in your sentence.");
            System.out.println("3- To delete the white spaces in your sentence.");
            System.out.println("4- To create a new sentence.");
            System.out.println("9- To exit");
            choice = scan.nextInt();

            if (choice == 1){
                System.out.print("Please enter a letter that you would like to count: ");
                char letter = scan.next().charAt(0);
                example.letterCounter(letter);
            }
            if (choice == 2){
                example.wordCounter();
            }
            if (choice == 3){
                example.spaceDelete();
            }
            if (choice == 4){
                example.setSentence();
            }
            if (choice == 9){
            }
            else{
            }
        }
    }
}
