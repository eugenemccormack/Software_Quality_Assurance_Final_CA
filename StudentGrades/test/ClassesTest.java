import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class ClassesTest {

	@Test
	void rubricTest() {

		Rubric rubricTest = new Rubric("testing", 2);
		assertEquals("testing", rubricTest.getCriteriaName());
		assertEquals(2,  rubricTest.getGrade());
		
	}
	
	@Test
	void rubricSetterTest() {

		Rubric rubricSetterTest = new Rubric();
		
		rubricSetterTest.setCriteriaName("testing");
		rubricSetterTest.setGrade(2);
		
		assert 
		
		rubricSetterTest.getCriteriaName().equals("testing");
		Integer.toString(rubricSetterTest.getGrade()).equals(2);
	}
	
	@Test
	void SubjectTest() {
		
		Subject subjectTest = new Subject();
		
			
		subjectTest.setSubjectName("SQA");

		Rubric rubricTest = new Rubric("testing", 2);
		
		ArrayList<Rubric> rubric = new ArrayList<>();
		
		rubric.add(rubricTest);
		
		subjectTest.setRubric(rubric);

		
		assert 
			
			
		subjectTest.getSubjectName().equals("SQA");
		rubricTest.getCriteriaName().equals("testing");
			
			
			
		}

	@Test
	void StudentTest() {

		Student studentTest = new Student();		
			
		studentTest.setName("John Barns");
		studentTest.setStudentNumber("C12345678");
						
		assert 
		
		studentTest.getName().equals("John Barns");
		studentTest.getStudentNumber().equals("C12345678");
						
	}
	
	@Test
	void StudentSubjectTest() {

		Student studentTest = new Student();
		
		Subject subjectTest = new Subject();
		
		ArrayList<Rubric> rubric = new ArrayList<>();
		
		studentTest.setName("John Barns");
		studentTest.setStudentNumber("C12345678");
		
		subjectTest.setSubjectName("SQA");
		
		Rubric rubricTest = new Rubric("testing", 2);
		
		rubric.add(rubricTest);
		
		subjectTest.setRubric(rubric);
		
		studentTest.setSubject(subjectTest);
			
				
		assert 
		
		studentTest.getName().equals("John Barns");
		studentTest.getStudentNumber().equals("C12345678");
		
		rubricTest.getCriteriaName().equals("testing");
		Integer.toString(rubricTest.getGrade()).equals(2);	
		
		subjectTest.getSubjectName().equals("SQA");	
						
	}	
	
}