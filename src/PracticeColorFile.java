public class PracticeColorFile {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RED_BACKROUND = "\u001B[41m";

    public static final String TEXT_BRIGHT_BG_PURPLE = "\u001B[105m";


    public static void main(String[] args) {

        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKROUND + "This text is red!" + ANSI_RESET);
        System.out.println(TEXT_BRIGHT_BG_PURPLE + "this text is...." + ANSI_RESET);


    }
}
