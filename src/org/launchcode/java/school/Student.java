package org.launchcode.java.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    private Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    private Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    /* getters and setters  */
    /* protected so that subclasses can be used in other packages, but I don't want other classes
    in other packages accessing this data
     */
    protected String getName() {
        return(this.name);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getGpa() {
        return(this.gpa);
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    protected int getNumberOfCredits() {
        return(this.numberOfCredits);
    }

    protected void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    protected int getStudentId(){
        return(this.studentId);
    }


    //  Methods
    private void addGrade(double grade, int credits) {
        double currentQualityScore = getGpa() * getNumberOfCredits();
        double enteredQualityScore = grade * credits;
        double newQualityScore = currentQualityScore + enteredQualityScore;
        int newCreditTotal = getNumberOfCredits() + credits;
        setNumberOfCredits(newCreditTotal);
        double updatedGPA = newQualityScore / newCreditTotal;
        setGpa(updatedGPA);
    }

    public String getGradeLevel() {
        String gradeLevel = "Freshman";
        if (this.numberOfCredits > 29 && this.numberOfCredits < 60){
            gradeLevel = "Sophomre";
        } else if (this.numberOfCredits > 59 && this.numberOfCredits < 90){
            gradeLevel = "Junior";
        } else if (this.numberOfCredits > 89) { gradeLevel = "Senior";}
        return gradeLevel;
    }

    @Override
    public String toString() {
        return this.name + " (Credits: " + this.numberOfCredits + ", GPA: " + this.gpa + ")";
    }
    @Override
    public boolean equals(Object o) {
        // reference check
        if (o == this) {
            return true;
        }
        // null check
        if (o == null) {
            return false;
        }
        // class check
        if (o.getClass() != getClass()) {
            return false;
        }
        // cast
        Student theStudent = (Student) o;
        // custom comparison
        return theStudent.getStudentId() == getStudentId();
    }
}