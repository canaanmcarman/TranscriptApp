import java.util.ArrayList;
import java.util.Scanner;
public class TranscriptApp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String userInput = "y";


        Transcript person = new Transcript();
        System.out.println("Welcome to the transcript application");
        System.out.print("Enter student id number: ");
        person.setId(kbd.nextLine());
        System.out.print("Enter student's first name: ");
        person.setFirstName(kbd.nextLine());
        System.out.print("Enter student's last name: ");
        person.setLastName(kbd.nextLine());

        while(userInput.equalsIgnoreCase("y")) {
            System.out.print("Enter course: ");
            Course course = new Course();
            course.setCourseName(kbd.nextLine());
            System.out.print("Enter credits: ");
            course.setCredits(kbd.nextDouble());
            System.out.print("Enter grade: ");
            kbd.nextLine();
            course.setGrade(kbd.nextLine());
            person.addCourse(course);
            System.out.println("Another course? (Y/N)");
            userInput = kbd.nextLine();

        }



        //our formatted print statement
        ArrayList<Course> courseList;
        courseList = person.getCourses();
        System.out.println(person.toString());
        System.out.println(person.getFormattedGPA());







    }

}
