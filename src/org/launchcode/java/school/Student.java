package org.launchcode.java.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
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

}