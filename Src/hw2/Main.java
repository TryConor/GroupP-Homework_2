package hw2;

import hw2.StudentManager;
import hw2.Student;

public class Main {

	public static void main(String[] args) {
		// Instantiate StudentManager, perform operations based on the requirements
		StudentManager studentManager = new StudentManager();
		
		// Read student data from a file and initialize Student objects
		boolean fileReadOk = studentManager.readFromFile("files/studentData.txt");
				
			// If reading from file successful, it displays all the students' data
			if (studentManager.readFromFile("files/studentData.txt")) {
				studentManager.displayStudents();
			}

	}

}
