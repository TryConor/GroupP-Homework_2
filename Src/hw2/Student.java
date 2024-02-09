package hw2;

public class Student {
	
	private int id;
	private String FirstName;
	private String LastName;
	private double grade;
	
	public Student(int id, String FirstName, String LastName, double grade) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.grade = grade;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
    public String toString() {
        return "id: " + id + ", name: " + FirstName + " " + LastName + ", grade: " + grade;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id;
    }
	

}
