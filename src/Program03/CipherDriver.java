package Program03;

import java.util.Scanner;

public class CipherDriver {

    public static void main(String[] args){

//      Original Caesar Cipher code
        CaesarCipher cipher = new CaesarCipher(3);
        System.out.println("Encryption code = "+ new String(cipher.encoder));
        System.out.println("Decryption code = "+ new String(cipher.decoder));
        String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
        String coded = cipher.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: "+ answer + "\n");

//      Modified message and encryption value
        CaesarCipher myCipher = new CaesarCipher(5);
        System.out.println("New Encryption Code: " + new String(myCipher.encoder));
        System.out.println("New Decryption Code: " + new String(myCipher.decoder));
        String myMessage = "CAN'T WAIT FOR SPRING BREAK.";
        String coded01 = myCipher.encrypt(myMessage);
        System.out.println("My Secret: " + coded01);
        String answer01 = myCipher.decrypt(coded01);
        System.out.println("My Message: " + answer01 + "\n");

//      User input encryption value and user input message
        Scanner scn = new Scanner(System.in);
        Scanner scn01 = new Scanner(System.in);
        System.out.println("Enter Encryption value: ");
        int val = scn.nextInt();
        CaesarCipher userCipher = new CaesarCipher(val);
        System.out.println("New Encryption Code: " + new String(userCipher.encoder));
        System.out.println("New Decryption Code: " + new String(userCipher.decoder));
        System.out.println("Enter a Message to Encrypt: ");
        String userMessage = scn01.nextLine();
        String coded02 = userCipher.encrypt(userMessage);
        System.out.println("Your Secret: " + coded02);
        String answer02 = userCipher.decrypt(coded02);
        System.out.println("Your Message: " + answer02);


    }
}
