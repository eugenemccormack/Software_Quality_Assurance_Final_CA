import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ControllerTest {
	
	
	@Test
	void totalGradeTest() {

		ArrayList<Rubric> rubricTest = new ArrayList<>();
		
		Controller controller = new Controller();
		
		Rubric rubric1 = new Rubric("testing", 3);
		
		Rubric rubric2 = new Rubric("design", 5);
		
		Rubric rubric3 = new Rubric("documentation", 1);
		
		rubricTest.add(rubric1);
		rubricTest.add(rubric2);
		rubricTest.add(rubric3);
		
		assertEquals(9, controller.totalGrade(rubricTest));
				
	}

	@Test
	void averageGradeTest() {

		ArrayList<Rubric> rubricTest = new ArrayList<>();
		
		Controller controller = new Controller();
		
		Rubric rubric1 = new Rubric("testing", 3);
		
		Rubric rubric2 = new Rubric("design", 5);
		
		Rubric rubric3 = new Rubric("documentation", 1);
		
		rubricTest.add(rubric1);
		rubricTest.add(rubric2);
		rubricTest.add(rubric3);
		
		assertEquals(3, controller.averageGrade(rubricTest));
				
	}
	
	@Test
	void maxGradeTest() {

		ArrayList<Rubric> rubricTest = new ArrayList<>();
		
		Controller controller = new Controller();
		
		Rubric rubric1 = new Rubric("testing", 3);
		
		Rubric rubric2 = new Rubric("design", 5);
		
		Rubric rubric3 = new Rubric("documentation", 1);
		
		rubricTest.add(rubric1);
		rubricTest.add(rubric2);
		rubricTest.add(rubric3);
		
		assertEquals(5, controller.maxGrade(rubricTest));
				
	}
	
	
	@Test
	void minGradeTest() {

		ArrayList<Rubric> rubricTest = new ArrayList<>();
		
		Controller controller = new Controller();
		
		Rubric rubric1 = new Rubric("testing", 3);
		
		Rubric rubric2 = new Rubric("design", 5);
		
		Rubric rubric3 = new Rubric("documentation", 1);
		
		rubricTest.add(rubric1);
		rubricTest.add(rubric2);
		rubricTest.add(rubric3);
		
		assertEquals(1, controller.minGrade(rubricTest));
				
	}
	
	@Test
	void standardDeviationTest() {

		ArrayList<Rubric> rubricTest = new ArrayList<>();
		
		Controller controller = new Controller();
		
		Rubric rubric1 = new Rubric("testing", 3);
		
		Rubric rubric2 = new Rubric("design", 4);
		
		Rubric rubric3 = new Rubric("documentation", 5);
		
		rubricTest.add(rubric1);
		rubricTest.add(rubric2);
		rubricTest.add(rubric3);
		
		assertEquals(0.816496580927726, controller.standardDeviation(rubricTest));
				
	}

}
