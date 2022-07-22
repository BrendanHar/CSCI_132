package Lab05;

import java.util.Arrays;

public class GenericSwapper {

    // TODO make this generic... Copy this file and rename it GenericSwapper, then complete the following..

    public static <T> void reverse(T[] data){
        Integer low = 0, high = data.length-1;
        while (low < high){
            T temp = data[low];
            data[low++] = data[low];
            data[high--] = temp;
        }
    }
        // swaps integers a and b in the data array
        // TODO make it swap object a and b in the data array
    public static void swap(Integer[] data, int a, int b) {
            // TODO use exception handling in case a or b is out of bounds
            // in that case, output, "No swap happened because a requested index does not exist."
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
        }


        public static void main(String[] args) {

            // testing swap() method with an array of Integers
            Integer[] myIntegers = new Integer[10];
            for (int i = 0; i < myIntegers.length; i++) {
                myIntegers[i] = (i + 1) * 5;
            }
            System.out.println(Arrays.toString(myIntegers));

            GenericSwapper.swap(myIntegers, 0, 9);
            System.out.println(Arrays.toString(myIntegers));


            // TODO make the swap() method generic as described above, then:

            // TODO test with an array of Strings...

            String[] myStrings = new String[5];
            myStrings[0]= new String("Hello");
            myStrings[1]= new String("This");
            myStrings[2]= new String("Is");
            myStrings[3]= new String("A");
            myStrings[4]= new String("Test");

            System.out.println(Arrays.toString(myStrings));
            GenericSwapper.reverse(myStrings);
            System.out.println(Arrays.toString(myStrings));

            // TODO test with an array of Movies...

            Movie[] myMovies = new Movie[3];
            myMovies[0] = new Movie("The Notebook", 2008);
            myMovies[1] = new Movie("Transformers", 2009);
            myMovies[2] = new Movie("Spider-man: Into The Spiderverse", 2018);

            System.out.println(Arrays.toString(myMovies));
            GenericSwapper.reverse(myMovies);
            System.out.println(Arrays.toString(myMovies));

        }

}


