import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favNumber = s.nextLine();
    System.out.print("Are you a student or teacher? \nStudent\nTeacher");
    String answer = s.nextLine();
    System.out.println(answer);
    
    if(answer.equals("Student")) {
        System.out.println(firstName + initialize(lastName) + favNumber + "@nycstudents.net");
    } 
    else {
        System.out.println(initialize(firstName) + lastName + favNumber + "@schools.nyc.gov");
    }
    
    generatePassword(8);
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
  
  /*
   *Name: generate
   *Purpose: generate a random password
   *Input: length of password (int)
   *Return: the password (String)
   */
  public static String generatePassword(int length) {
      String password = "";
      for(int i = 0; i < length; i++) {
          // loop 'length' times}
          //generate a random number 
          //from 65-90 capital letters
          //from 97-122 lwrcase
          //from 33-47 for special characters
          int choice = (int)(Math.random()* 3 + 1);
          if (choice == 1) {
              int max = 90;
              int min = 65;
            }
          else if (choice == 2) {
              int max = 97;
              int min = 122;
            }
          else {
              int max = 33;
              int min = 47;
            }
          int rand = (int)(Math.random()*(max - min + 1) + min);
          char c = (char)rand;
    
          // System.out.println(rand + "" + c);
          //convert the random int to char, ex: c =(char)i;
          //add char to password
          password += c;
          System.out.println(password);
        }
      return password; 
    } 
}
// end class
