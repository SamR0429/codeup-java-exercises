package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("what is your name?");
        String nameResponse = input.getString();
        System.out.println(nameResponse);

        System.out.println("type Y");
        boolean yesNo  = input.yesNo();
        System.out.println(yesNo);

        int Int = input.getInt(1, 10);

        double IntTwo = input.getDouble(1, 10);
    }

}
