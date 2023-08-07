import java.util.Arrays;

public class ArraysExercises {
    private static String[] addToNames(String[] names, String nameToAdd) {
        String[] newArray = Arrays.copyOf(names, names.length + 1);
        newArray[newArray.length - 1] = nameToAdd;
        return newArray;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        //im no too sure why it only works with .toString ? is its cause its inside of the main method and the main method is String[]?

        String[] Person;
        Person = new String[3];

        Person[0] = "Sam";
        Person[1] = "Dette";
        Person[2] = "Liz";

//        for(String p : Person){
//            System.out.println(p);
//        }

        //        System.out.println(Arrays.toString(Person));

        //making a copy of the person array
        String[] PersonCopy = Arrays.copyOf(Person, 3);
        System.out.println(Arrays.toString(Person));
        System.out.println(Arrays.toString(PersonCopy));

        //adding to person array
        Person = addToNames(Person, "Momo");
        System.out.println(Arrays.toString(Person));


    }
}
