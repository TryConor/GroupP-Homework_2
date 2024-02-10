package hw2;

import hw2.StudentManager;
import hw2.Student;

public class Main {

	public static void main(String[] args) {
		// Instantiate StudentManager, perform operations based on the requirements
		StudentManager studentManager = new StudentManager();
				
		// If reading from file successful, display all the students' data
		if (studentManager.readFromFile("files/studentData.txt")) {
			studentManager.displayStudents();
		}
		
		// Search for student by id and display student found
        boolean studentFound = studentManager.searchStudentById(101);
	    
        // Update the grade of a student by ID
	    boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, 95);
	    
	    //Display all students after the update
	    studentManager.displayStudents();
        }
		

}
