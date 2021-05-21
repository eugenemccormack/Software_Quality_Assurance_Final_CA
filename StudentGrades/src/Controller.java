import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	private final Scanner scan = new Scanner(System.in);
	
	private final ArrayList<Rubric> rubrics = new ArrayList<>(); 
	private final ArrayList<Student> students = new ArrayList<>(); 
	private final ArrayList<Subject> subjects = new ArrayList<>(); 

	
	public Controller() {
		
		
		//Menu();		

		
		
		

	}
	
	public void Menu() {
		
		int option = 0;
		
		System.out.println("Welcome to the Student Rubric Creator \n");
		
		System.out.println("1. Create New Student Rubric");
		System.out.println("2. View All Rubric's");
		System.out.println("3. Find Rubric by Name");
		System.out.println("4. View Grades Associated with a Specific Rubric");
		System.out.println("5. View Summary of Rubric Grades");
		System.out.println("6. Exit System");
		
		
		
		
		System.out.println("\nPlease enter a Menu Option Number : ");
		
		
		do {	
			
		
		option = scan.nextInt();

		
		if(option < 1 || option > 6) {
			
			System.out.println("Error - Please Enter a Menu Option Between 1 and 6\n");
			
			Menu();
			
			
		}
		
		
		

		
		switch(option) {
		
		case 1 : CreateNewRubric();
		
		case 2 : ViewAllRubrics();
		
		case 3: ViewRubricName();
		
		case 4: ViewRubricGrades();
		
		case 5: Summary();
		
		case 6: Exit();
		
		
		}
		

		
		}while(option <1 && option >6);
		
		
		
	}
	


	public void CreateNewRubric() {
		
		System.out.println("\n| Create New Rubric |");
		
		ArrayList<Rubric> subjectRubric = new ArrayList<>(); 	
		
		int criteriaRows = 0;
		int grade = 0;
		
		
		System.out.println("\nPlease Enter Students Name : ");
		
		String name = scan.next();
		
		System.out.println("\nPlease Enter Students Number : ");
		
		String studentNumber = scan.next();
		
		System.out.println("\nPlease Enter the Subject : ");
		
		String subjectName = scan.next();
		
		do {
			
			System.out.println("\nPease Enter the Number of Criteria's You Would Like to Create for " + subjectName + "?");			
			
			criteriaRows = scan.nextInt();
			
			if(criteriaRows < 1 || criteriaRows > 10)
				
				System.out.println("\nError - The Criteria Can Only be Between 1 and 10 Columns");
			
			
		}while(criteriaRows < 1 || criteriaRows > 10);
		
		for(int i = 0; i < criteriaRows; i++) {
			
			System.out.println("\nPlease Enter the Criteria Name : ");		
			
			String criteriaName = scan.next();
			
			do {
			
			System.out.println("\nPlease Enter a Grade : ");
			
			grade = scan.nextInt();
			
			if(grade < 1 || grade > 5) 
				
				System.out.println("Error - Please Enter a Grade Between 1 and 5");				
			
			
			}while(grade < 1 || grade > 5);
			
			Rubric rubric = new Rubric(criteriaName, grade);
									
			rubrics.add(rubric);
			
			subjectRubric.add(rubric);
			
		}		
		
		
		Subject subject = new Subject(subjectName, subjectRubric);
		
		subjects.add(subject);
		
		
		Student student = new Student(name, studentNumber, subject);
		
		students.add(student);		
		
		Menu();
		
	}
	
		public void ViewAllRubrics() {
			
			
			System.out.println("| View All Rubric's |\n");
			
			for(Subject subjectName: subjects)
			
			System.out.println("Rubric Subject : " + subjectName.getSubjectName() + "\n");
			
			Menu();
			
		}	
	

		private void ViewRubricName() {
			
			boolean found = false;
			
			System.out.println("| Find Rubric |\n");
			
			System.out.println("Please Enter a Subject : \n");
			
			String name = scan.next();
			
			for(Subject subjectName: subjects) {
				
				if(subjectName.getSubjectName().equalsIgnoreCase(name)) {
					
					found = true;
			
					System.out.println("\nRubric Found : " + subjectName.getSubjectName() + "\n");
				
				}		
			}
			
			if(!found)
				
				System.out.println("\nError - Subject " + name + " was Not Found\n");
			
			Menu();
			
			
		}
	
		private void ViewRubricGrades() {
			
			boolean found = false;
			
			String subjectFound = "";
			
			System.out.println("Please Enter a Subject : \n");
			
			String name = scan.next();
			
			for(Subject subjectName: subjects) {
				
				if(subjectName.getSubjectName().equalsIgnoreCase(name)) {
					
					found = true;
					
					subjectFound = name;				
				}					
			}								
					
					for(Student student: students) {
						
						if(student.getSubject().getSubjectName().equalsIgnoreCase(subjectFound)) {
							
							System.out.println("\nStudent Name : " + student.getName());
							System.out.println("Student Number : " + student.getStudentNumber() + "\n");
						
						for(int i = 0; i < student.getSubject().getRubric().size(); i++) {				
												
							System.out.println("Criteria : " + student.getSubject().getRubric().get(i).getCriteriaName());
							System.out.println("Grade : " + student.getSubject().getRubric().get(i).getGrade() + "\n");														
						}
					}
					}
			
			
			if(!found)
				
				System.out.println("\nError - Subject " + name + " was Not Found\n");
			
			Menu();
			
			
		}

	
		public void Summary() {
	
			System.out.println("| View Student Summary Rubric |\n");
			
			boolean subjectFound = false;
			
			String subjectStore = "";
			
			System.out.println("Please Enter a Subject : \n");
			
			String name = scan.next();
			
			for(Subject subjectName: subjects) {
				
				if(subjectName.getSubjectName().equalsIgnoreCase(name)) {
					
					subjectFound = true;
					
					subjectStore = name;				
				}					
			}								
					
					for(Student student: students) {
						
						if(student.getSubject().getSubjectName().equalsIgnoreCase(subjectStore)) {
							
							System.out.println("\nStudent Name : " + student.getName());
							System.out.println("Student Number : " + student.getStudentNumber() + "\n");
						
							averageGrade(student.getSubject().getRubric());
					}
				}
			
			
			if(!subjectFound)
				
				System.out.println("\nError - Subject " + name + " was Not Found\n");

			
			Menu();

			
		}
		
		public int averageGrade(ArrayList<Rubric> rubrics){
		
			int total = 0;
			
			for(Rubric rubric : rubrics) {
				
				total += rubric.getGrade();
				
			}
			
			System.out.println("Average Grade " + total / rubrics.size() + "\n");
			
			int average = total / rubrics.size();
			
			return average;
						
		}
	
		
		public void Exit() {
			
			System.out.println("Goodbye!!");

			
		}
		public static void main(String[] args) {
	
			new Controller();
	
		}
	

}
