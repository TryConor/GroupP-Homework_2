package hw2;

import hw2.Student;

public class StudentManager {
	private Student[] students;
    private int studentCount;
    
    public StudentManager() {
        students = new Student[0];
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
        if (students.length == 0) {
            System.out.println("No students found.\n");
        } else {
        	System.out.println("\n");
            for (Student student : students) {
            	System.out.println(student.toString());
            }
            
        }
    }
}
