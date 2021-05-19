
public class Rubric {
	
	private String criteriaName;
	private int grade;
	
	public Rubric(String criteriaName, int grade) {
		
		this.criteriaName = criteriaName;
		this.grade = grade;
		
	}

	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
