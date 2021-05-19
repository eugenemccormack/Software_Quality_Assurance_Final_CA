
public class Student {
	
	private String name;
	private String studentNumber;
	private Subject subject;
	
	public Student(String name, Subject subject) {
		
		this.name = name;
		this.subject = subject;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
