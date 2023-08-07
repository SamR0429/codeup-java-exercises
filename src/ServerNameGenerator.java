public class ServerNameGenerator {

    public static String randomElementFromArray(String[] arr) {
        int randomIndex = (int) (Math.random() * arr.length);
        String randomElement = arr[randomIndex];
        System.out.println("Random Element = " + randomElement);
        System.out.println("Random Index = " + randomIndex);
        return randomElement;

        // this was steve's version
//        Random random = new Random();
//        int randomIndex = random.nextInt(arr.length);
//        return arr[randomIndex];

    }


    public static void main(String[] args) {

        String[] adjectives;
        String[] nouns;

        adjectives = new String[10];
        nouns = new String[10];

        adjectives[0] = "agreeable";
        adjectives[1] = "ambitous";
        adjectives[2] = "brave";
        adjectives[3] = "calm";
        adjectives[4] = "delightful";
        adjectives[5] = "eager";
        adjectives[6] = "faithful";
        adjectives[7] = "gentle";
        adjectives[8] = "happy";
        adjectives[9] = "jolly";

        nouns[0] = "van";
        nouns[1] = "match";
        nouns[2] = "eye";
        nouns[3] = "dress";
        nouns[4] = "doctor";
        nouns[5] = "tomato";
        nouns[6] = "traffic";
        nouns[7] = "truck";
        nouns[8] = "lizard";
        nouns[9] = "vase";


        randomElementFromArray(adjectives);
        System.out.println("Here is your server name: \n" + randomElementFromArray(adjectives) + "-" + randomElementFromArray(nouns));

    }
}
