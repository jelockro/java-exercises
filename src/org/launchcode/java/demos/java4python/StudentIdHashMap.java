package org.launchcode.java.demos.java4python;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by user on 12/10/18.
 */
public class StudentIdHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = in.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);
    }

}

