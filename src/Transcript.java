import java.util.ArrayList;
public class Transcript {
    private String firstName, lastName;
    private String id;
    private ArrayList<Course> courseList;
    private double gradeTotal;

    public Transcript() {
        this.firstName = "";
        this.lastName = "";
        this.id = "";
        this.courseList = new ArrayList<>();
        this.gradeTotal = 0;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public void addCourse(Course course) {
        this.courseList.add(course);
    }
    public ArrayList<Course> getCourses() {
        return courseList;
    }
    public double getOverallGPA() {
        double gradeTotal= 0.0;
        for (Course course: courseList) {
            Double qualityPoint = course.getQualityPoint();
            gradeTotal += qualityPoint;

        }
        double GPA = (gradeTotal / courseList.size());
        System.out.println(gradeTotal + " / " + courseList.size() + "= " + GPA);
        return GPA;

    }
    public String getFormattedGPA() {
        String print = "GPA: " + getOverallGPA();
        return print;
    }
    @Override
    public String toString() {
        String print = " Course           Credits          Grade           Quality Points\n" +
                       "________         _________       ________             __________\n";


        for (Course course : courseList) {
            print += course.getCourseName() + "              " + course.getCredits() + "            " +  course.getGrade() + "                    " + course.getQualityPoint() + "\n";
        }


        return print;
    }

}
