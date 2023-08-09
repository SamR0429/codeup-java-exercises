public class ExceptionExercises {

    public static int divideNums(int input1, int input2) {
        if (input2 == 0) {
            throw new IllegalArgumentException("Cannot divide be 0!");
        } else
            System.out.println("it went through");
        return input1 / input2;
    }


    public static void main(String[] args) {
        try {
            int result = divideNums(10, 5);
            System.out.println("result");


            result = divideNums(8, 0); // This will throw an exception
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
