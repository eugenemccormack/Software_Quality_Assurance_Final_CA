import java.util.Scanner;

public class Controller {
	
	Scanner scan = new Scanner(System.in);

	
	public Controller() {
		
		
		Menu();
		
		
		
		
		
	}
	
	public void Menu() {
		
		int option = 0;
		
		System.out.println("Welcome to the Student Rubric Creator \n");
		
		System.out.println("1. Create New Student Rubric");
		System.out.println("2. View All Rubric's");
		System.out.println("3. View Grades Associated with a Specific Rubric");
		System.out.println("4. View Summary of Student's Grades");
		System.out.println("5. Exit System");
		
		
		
		
		System.out.println("\nPlease enter a Menu Number : ");
		
		
		do {
		
		
		option = scan.nextInt();
		
		if(option < 1 || option > 5) {
			
			System.out.println("Error - Please Enter a Menu Option Between 1 and 5\n");
			
			Menu();
			
			
		}
		
		switch(option) {
		
		case 1 : CreateNewRubtic();
		
		case 2 : ViewAllRubrics();
		
		case 3: ViewRubricName();
		
		case 4: Summary();
		
		case 5: Exit();
		
		
		}
		
		}while(option <1 && option >5);
		
		
		
	}
	
	
	public void Exit() {
		
		System.out.println("Exit");
		
		Menu();
		
	}
	public void Summary() {

		System.out.println("Summary");
		
		Menu();
		
	}
	private void ViewRubricName() {
		
		System.out.println("ViewRubricName");
		
		Menu();
		
		
	}
	public void ViewAllRubrics() {
		
		System.out.println("ViewAllRubrics");
		
		Menu();
		
	}
	public void CreateNewRubtic() {

		System.out.println("CreateNewRubtic");
		
		Menu();
		
	}
	public static void main(String[] args) {

		new Controller();

	}

}
