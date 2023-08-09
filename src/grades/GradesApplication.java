package grades;

import java.util.HashMap;

public class GradesApplication {
    private static void execute() {
        HashMap<String, Student> students = poplulateStudents(); //declare data types in < >
    }

    private static HashMap<String, Student> poplulateStudents() {
        HashMap<String, Student> students = new HashMap<>();

        Student studentOne = new Student("greg");
        studentOne.addGrade(78);
        studentOne.addGrade(46);
        studentOne.addGrade(74);

        Student studentTwo = new Student("pam");
        studentTwo.addGrade(87);
        studentTwo.addGrade(35);
        studentTwo.addGrade(68);

        Student studentThree = new Student("og bob");
        studentThree.addGrade(35);
        studentThree.addGrade(66);
        studentThree.addGrade(42);

        Student studentFour = new Student("alouicius");
        studentFour.addGrade(57);
        studentFour.addGrade(24);
        studentFour.addGrade(76);

        return students;
    }

    public static void main(String[] args) {

        execute();


//        students.put("Sam","SamR0429");
//        students.put("Snuffalafagos", "Snuff-g-01");
//        students.put("Carrie", "CarrieThis04");
//        students.put("Deez" , "DeezHugs04u");

//        students.put([90 , 80 , 70] , new Student("Sam"));
//        students.put("asddff", new Student("Bob"));
//        students.put("asddff", new Student("Rick"));
//        students.put("asddff", new Student("Doug"));


    }
}
