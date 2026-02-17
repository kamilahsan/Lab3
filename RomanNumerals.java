
/**
 * Program that displays a number from 1-3 as a roman numeral, and gives an error when there is a number greater than 3 or less than 0
 *
 * @author Kamil Ahsank ahsan@student.sdccd.edu
 * @since 2/16/2026
 * @version v1.0
 *
 */

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 3: ");
        int number = input.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("The Roman numeral version is: I");
                break;
            case 2:
                System.out.println("The Roman numeral version is: II");
                break;
            case 3:
                System.out.println("The Roman numeral version is: III");
                break;
            default:
                System.out.println("Error: Not between 1 and 3");
                break;
        }
        
        input.close();
    }
}