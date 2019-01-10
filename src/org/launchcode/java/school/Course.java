package org.launchcode.java.school;

import java.util.ArrayList;
import java.util.HashMap;


public class Course {
    private String courseName;
    private int courseID;
    private ArrayList<String> parentDepartment;
    private ArrayList<String> contentCategories;
    private ArrayList<String> prerequisites;
    private int maxEnrollment;
    private int currentEnrollment;
    private int minEnrollment;
    private HashMap<Integer,  String> studentAndIds;
    private String instructor;


    public int getCourseID() {
        return this.courseID;
    }

    @Override
    public String toString() {
        return this.courseName + " (" +
                "courseID: " + this.courseID +
                ", Instructor: " + this.instructor +
                ", Prerequisites: " + this.prerequisites +
                ", Current Enrollment: " + this.currentEnrollment +
                ", Max Enrollment: " + this.maxEnrollment +
                ")";
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
        Course theCourse = (Course) o;
        // custom comparison
        return theCourse.getCourseID() == getCourseID();
    }
}

