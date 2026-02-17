import java.util.Scanner;

/**
 * Program Description
 * 1) Ask user for a date in MM/DD/YYYY format
 * 2) Check if the date is valid
 * 3) Print if the date is valid or not
 * 
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/16/2026
 */

public class ValidDate_Starter
{
    public static void main (String[] args){
        int month, day, year;
        String temp, output;
        Scanner input = new Scanner(System.in);
        
        input.useDelimiter("/");
        
        output = "";
        
        System.out.print("Enter date in mm/dd/yyyy format: ");
        month = input.nextInt();
        day = input.nextInt();
        temp = input.nextLine().substring(1);
        year = Integer.parseInt(temp);
        
        boolean isValid = false;
        
        if (day < 1) {
            output = "Can never have less than 1 day in a month.";
        } else if (day > 31) {
            output = "Can never have more than 31 days in a month.";
        } else {
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    isValid = true;
                    break;
                    
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 30) {
                        isValid = true;
                    } else {
                        output = "Can not have 31 days for this month.";
                    }
                    break;
                    
                case 2:
                    if ((year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0))) {
                        if (day <= 29) {
                            isValid = true;
                        } else {
                            output = "Can not have 30 or more days in a leap year.";
                        }
                    } else {
                        if (day <= 28) {
                            isValid = true;
                        } else {
                            output = "Can not have 29 or more days in a non-leap year.";
                        }
                    }
                    break;
                    
                default:
                    output = "Months must be btw 1 and 12.";
                    break;
            }
        }
        
        if (isValid) {
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        } else {
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + output);
        }
        
        input.close();
    }
}
