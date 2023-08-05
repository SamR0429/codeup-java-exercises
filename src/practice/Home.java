package practice;



import java.util.Scanner;

public class Home {

//    private Scanner scanner;
//
//     public Input(){
//         this.scanner = new Scanner(System.in);
//     }
//     public String getString(){
//         return this.scanner.nextLine();
//     }

    //STATIC PROPERTIES: are a set property every object/method? will have, something set
    final public static int HEIGHT_FOOT_OF_CEILING = 9;
    protected static int homesCreated;


    //instance properties: these are properties that every method? will have, kinda like declaring variables for JS
    private int windows ;
    private String color;
    private int doors;
    private int bedrooms;
    private int floors;

    //CONSTRUCTORS: are the building our own versions of what we want with the instance properties given

    public Home (String color, int windows, int doors, int bedrooms, int floors){
        this.color = color; //referencing the "variable color" and we are making it our own value for this house?
        this.windows = windows;
        this.doors = doors;
        this.bedrooms = bedrooms;
        this.floors = floors;
        homesCreated++;
    }

    //GETTERS:
    public String getColor(){
        return this.color; //this color is being referenced to the "variable" grabbing it and making a method for it ?
    }
    public int getWindows(){
        return this.windows;
    }
    public int getDoors(){
        return this.doors;
    }

    public int getBedrooms(){
        return this.bedrooms;
    }
    public  int getFloors(){
        return this.floors;
    }
    //SETTERS:
    public void setColor(String color){
        this.color = color; //ask how these colors are diff again, this is grabbing the "var" and letting us take the value and set it to what we want ?
    }
    public void setWindows(int windows){
        this.windows = windows;
    }

    public  void setDoors(int doors){
        this.doors = doors;
    }

    public void setBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }

    public void setFloors(int floors){
        this.floors = floors;
    }

    //INSTANCE METHODS:

//    public void changeDoorAmount (){
//        this.doors
//    }

}
