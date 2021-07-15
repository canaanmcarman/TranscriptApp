public class Course {
    private String courseName;
    private String grade;
    private double credits, qualityPoint;

    public Course() {
        this.courseName = "";
        this.grade = "";
        this.credits = 0;
        this.qualityPoint = 0;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName() {
        return this.courseName;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade(){
        return this.grade;
    }
    public Double getQualityPoint() {
        this.qualityPoint = 0.0;
        if (this.grade.equalsIgnoreCase("A")) {
            this.qualityPoint = 4.0;
        }else if (this.grade.equalsIgnoreCase("B")) {
            this.qualityPoint = 3.0;
        }else if (this.grade.equalsIgnoreCase("C")) {
            this.qualityPoint = 2.0;
        }else if (this.grade.equalsIgnoreCase("D")) {
            this.qualityPoint = 1.0;
        }else {
            this.qualityPoint = 0.0;
        }
        return this.qualityPoint;
    }
    public void setCredits(double credits) {
        this.credits = credits;
    }
    public double getCredits() {
        return this.credits;
    }

}
