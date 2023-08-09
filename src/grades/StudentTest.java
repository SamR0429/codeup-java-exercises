package grades;

public class StudentTest {


    public static void main(String[] args) {

        Student bob = new Student("Bob");
        bob.addGrade(90);
        bob.addGrade(80);
        bob.addGrade(70);

        System.out.println(bob.getGrades());
        System.out.println(bob.getGradeAverage());

    }
}
