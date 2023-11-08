import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int totSub;
        System.out.print("Enter the total number of subjects: ");
        totSub = scanner.nextInt();
		
        int[] subMarks = new int[totSub];
        int totMarks = 0;
System.out.println("\nEnter marks obtained in each subject out f 100:");
        for (int i = 0; i < totSub; i++) {
            System.out.print("\nEnter marks for subject " + (i + 1) + ": ");
            subMarks[i] = scanner.nextInt();
            totMarks += subMarks[i];
        }
        float averagePer = (float) totMarks / (totSub * 100) * 100;
		
        String grade;

        if (averagePer >= 90) {
            grade = "A+";
        } else if (averagePer >= 80) {
            grade = "A";
        } else if (averagePer >= 70) {
            grade = "B";
        } else if (averagePer >= 60) {
            grade = "C";
        } else if (averagePer >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
		System.out.println("\n------------------------------------------------------");
        System.out.println("\nTotal Marks: " + totMarks);
        System.out.println("\nAverage Percentage: " + averagePer + "%");
        System.out.println("\nGrade: " + grade);
    }
}