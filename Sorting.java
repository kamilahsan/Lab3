import java.util.Scanner;

/**
 * Program Description
 * 1) Ask user for three non-negative numbers
 * 2) Read the three numbers from keyboard
 * 3) Use nested if statements to sort the numbers
 * 4) Display the numbers in increasing order from smallest to largest
 * 
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/16/2026
 */

public class Sorting_Starter
{
    public static void main (String[] args){
        int n1, n2, n3;
        int low, med, high;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        n1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        n3 = input.nextInt();
        
        if ((n1 <= n2) && (n1 <= n3)) {
            low = n1;
            
            if (n2 <= n3) {
                med = n2;
                high = n3;
            } else {
                med = n3;
                high = n2;
            }
        } else if (n2 <= n3) {
            low = n2;
            
            if (n1 <= n3) {
                med = n1;
                high = n3;
            } else {
                med = n3;
                high = n1;
            }
        } else {
            low = n3;
            
            if (n1 <= n2) {
                med = n1;
                high = n2;
            } else {
                med = n2;
                high = n1;
            }
        }
        
        System.out.println("The inputs sorted smallest to largest are: " + low + " " + med + " " + high);
        
        input.close();
    }
}
