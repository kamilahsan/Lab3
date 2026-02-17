import java.util.Scanner;

/**
 * ProbChall_4 asks the user to input three exam scores.
 * 1) Prompt user for three exam scores
 * 2) Calculate the average of the three scores
 * 3) Determine the letter grade based on the average
 * 4) Display the average and letter grade
 * 
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/16/2026
 */
public class ProbChall4_Stater
{
    public static void main (String[] args){
        int exam1, exam2, exam3;
        double average;
        String letterGrade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Exam 1 score: ");
        exam1 = input.nextInt();
        
        System.out.print("Enter Exam 2 score: ");
        exam2 = input.nextInt();
        
        System.out.print("Enter Exam 3 score: ");
        exam3 = input.nextInt();
        
        average = (double)(exam1 + exam2 + exam3) / 3.0;
        
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.printf("With an avg score of %.1f\n", average);
        System.out.println("Your grade is: " + letterGrade);
        
        input.close();
    }
}
