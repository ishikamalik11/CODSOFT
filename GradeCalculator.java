import java.util.Scanner;

public class GradeCalculator{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no. of subjects:");
	int numberOfSubjects=scanner.nextInt();
	int[] marks=new int[numberOfSubjects];
	int totalMarks = 0;
	for(int i = 0,value; i < numberOfSubjects; i++) {
		System.out.print("\nEnter the marks obtained out of 100 in Subject "+(i+1)+":\t");
	    value = scanner.nextInt();
		if (value <= 100) {
			marks[i] = value;
			totalMarks += marks[i];
		}else {
			System.out.println("\n\t!!!Please enter the valid marks!!!");
			i--;	
		}
	}
	scanner.close();
	float averagePercentage = (float) totalMarks/numberOfSubjects;
	String grade;
	switch ((int) (averagePercentage/10)) {
	case 9, 10:
		grade = "A";
	    break;
	case 8:
		grade = "B";
		break;
	case 7:
		grade = "C";
		break;
	case 6:
		grade = "D";
		break;
	case 5, 4:
		grade = "Pass";
	    break;
	default:
		grade = "Fail";
		 break;
	}
	System.out.println("\nTotal marks:"+ totalMarks+"/"+ numberOfSubjects*100);
	System.out.println("\nAverage percentage:"+ averagePercentage);
	System.out.println("\nGrade:"+ grade);
  }
} 
    

