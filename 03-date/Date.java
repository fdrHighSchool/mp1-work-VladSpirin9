import java.util.Scanner;

/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Date
{ 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week: ");
        String day = s.nextLine();
        
        System.out.print("Enter the month: ");
        String month = s.nextLine();
        
        System.out.print("Enter the year: ");
        String year = s.nextLine();
        
        System.out.print("Enter the day of the month: ");
        String dayofMonth = s.nextLine();
        
        System.out.println("American format: "+day+", "+month+" "+dayofMonth+", "+year);
        System.out.println("European format: "+day+" "+dayofMonth+" "+month+" "+year);
    }//end of main method
}    