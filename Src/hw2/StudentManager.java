package hw2;

import hw2.Student;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class StudentManager {
	private Student[] students;
    private int studentCount;
    
    public StudentManager() {
        students = new Student[0];
    }
    
    public boolean readFromFile(String fileName) {
    	//use Scanner and FileInputStream to read in data from the specified fileName
        try (Scanner fileReader = new Scanner(new FileInputStream(fileName))) {
        	while(fileReader.hasNextLine()) {
				//read in data from file line by line
				String data = fileReader.nextLine();
				
				//separate data on each line into different categories of student data
				String[] parts = data.split(" ");
				
				//make sure data on each line split up into 4 parts 
				// and assign to id, name (first and last put together, and grade for each student
				//then add student to array of students (using addStudentToArray method)
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName = parts[2];
                    double grade = Double.parseDouble(parts[3]);
                    Student student = new Student(id, firstName,lastName, grade);
                    addStudentToArray(student);
                } 
                else {
                    System.out.println("Invalid line format: " + data);
                }
            }
        } 
        //display error if there is a problem accessing and reading the file
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public void addStudentToArray(Student student) {
    	// Makes new array with length of students plus 1 so there is room to add another student
        Student[] newStudents = new Student[students.length + 1];
        // Copies students from the src array(students) starting @ position 0 and 
        // Places them in newStudents @ postion 0 which has the same length as src array(students)
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        // Sets the newStudents array equal to Students, so its now the main array
        students = newStudents;
        // Updates student Count to the current amount of students
        studentCount++;
    }
    
    public void displayStudents() {
    	// If the length of students is 0 which means it has no students then print out no students found 
        if (students.length == 0) {
            System.out.println("No students found.\n");
        } else {
        // If there is students in students and length is not equal to 0 then print out each student in students 
        	System.out.println("\n");
            for (Student student : students) {
            	System.out.println(student.toString());
            }
            
        }
    }
}
