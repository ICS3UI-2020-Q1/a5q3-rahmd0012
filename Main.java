import java.util.Scanner;
/**
 * a program to find the factorial of a user entered number
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter an integer to calculate the factorial of");
    int n = input.nextInt();

    // the accumulator variable to add the count into
    int total = 1;

    // create a for loop
    for(int count = n; count >= 1; count--){
      // create a total for the numbers decsending
      total = total * count;
    }
    // print the total to the screen
    System.out.println(n + "! = " + total);
  }
}
