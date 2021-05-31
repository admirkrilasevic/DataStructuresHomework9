package hw9;

public class Student {
	
	private int studentID;
	private String name;
	private String dateOfBirth;
	private String universityName;
	private String departmentCode;
	private String departmentName;
	private int yearOfEnrolment;
	
	
	
	public int getStudentID() {
		return studentID;
	}

	public Student(int studentID, String name, String dateOfBirth, String universityName, String departmentCode,
			String departmentName, int yearOfEnrolment) {
		this.studentID = studentID;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.universityName = universityName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.yearOfEnrolment = yearOfEnrolment;
	}
	
	@Override
	public String toString() {
		return "Student ID: " + this.studentID + "\n"  + 
				"Name and surname: " + this.name + "\n" + 
				"Date of birth: " + this.dateOfBirth + "\n" + 
				"University:" + this.universityName + "\n" + 
				"Department code: " + this.departmentCode + "\n" + 
				"Department: " + this.departmentName + "\n" +
				"Year of enrolment: " + this.yearOfEnrolment;
	}

}
