package Lab07;

import java.util.LinkedList;

public class DoublyLinkedListDemo {

    public static void main(String[] args){

        LinkedList testList = new LinkedList();
        DoublyLinkedList myList = new DoublyLinkedList();

        testList.add(5);
        testList.add(9);
        testList.add(1);
        testList.add(8);
        System.out.println(testList);
        testList.add(2,7);
//        testList.add(8,7);
        testList.clear();
        System.out.println(testList);
        testList.add(10);
        testList.add(11);
        testList.add(12);
        testList.add(13);
        System.out.println(testList.get(3));
//        System.out.println(testList.get(4));
        testList.set(2, 22);
//        testList.set(7,77);
        System.out.println(testList +"\n");

        myList.add(5);
        myList.add(9);
        myList.add(1);
        myList.add(8);
        System.out.println(myList);
        myList.add(2,7);
        myList.add(8,7);
        myList.clear();
        System.out.println(myList);
        myList.add(10);
        myList.add(11);
        myList.add(12);
        myList.add(13);
//        System.out.println(myList.get(3));
//        System.out.println(myList.get(4));
//        myList.set(2, 22);
//        myList.set(7,77);
        System.out.println(myList);





    }
}
