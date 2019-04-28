import java.util.Scanner;

/**
   This program uses the startsWith method to search using
   a partial string.
*/

public class GoTSearch
{
   public static void main(String[] args)
   {
      String lookUp;  // To hold a lookup string
      
      // Create an array of names.
      String[] people = { "Targaryen, Daenerys", "Snow, John", "Stark, Arya", "Greyjoy, Theon", "Baratheon, Joffrey", 
                           "Lannister, Jaime", "Baelish, Peter", "Bolton, Ramsey", "Hodor"
                          };

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a partial name to search for.
      System.out.print("Enter the first few characters of " +
                       "the last name to look up: ");
      lookUp = keyboard.nextLine();

      // Display all of the names that begin with the 
      // string entered by the user.
      System.out.println("Here are the names that match:");
      for (String person : people)
      {
         if (person.startsWith(lookUp))
            System.out.println(person);
      }
   }
}
