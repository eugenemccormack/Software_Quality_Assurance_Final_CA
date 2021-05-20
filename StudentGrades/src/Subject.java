import java.util.ArrayList;

public class Subject {

	
	private String subjectName;
	private ArrayList <Rubric> rubric;
	
	public Subject(String subjectName, ArrayList <Rubric> rubric) {
		
		this.subjectName = subjectName;
		this.rubric = rubric;
		
	
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public ArrayList<Rubric> getRubric() {
		return rubric;
	}

	public void setRubric(ArrayList<Rubric> rubric) {
		this.rubric = rubric;
	}
	
	
	
}
