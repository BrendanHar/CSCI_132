package Lab5;
import java.util.Scanner;
public class Sorter  {

    String sentence;

    Sorter(String input){
        this.sentence = input;
    }

    //function to set the sentence
    public void setSentence(){
        Scanner input2 = new Scanner(System.in);
        System.out.print("Please enter a new sentence: ");
        String newSentence = input2.nextLine();
        this.sentence = newSentence;
        System.out.println("The new Sentence is: " + this.sentence);
    }

    //Function to count the number of instances of a letter in the sentence
    public void letterCounter(char letter){
        int count = 0;
        for (int i = 0; i < this.sentence.length(); i++){
            if (this.sentence.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("The sentence has " + count + " " + letter + "'s in the sentence.");
    }

    //function to delete the white spaces of a sentence
    public void spaceDelete(){
        String[] newSentence = this.sentence.split("\\s+");
        for (int i = 0; i < newSentence.length; i++){
            System.out.print(newSentence[i]);
        }
        System.out.println();
    }

    public void wordCounter(){
        String[] words = this.sentence.split("\\s+");
        System.out.println("There are " + words.length + " Words in the sentence.");
    }

}
