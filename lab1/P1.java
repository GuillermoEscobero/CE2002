/**
 * Task 1 - Lab 1
 * @author Escobero Hernandez Guillermo (N1804693E)
 */

import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    char character;
    Scanner sc = new Scanner(System.in);

    // Read from standard input and get the first char.
    // Converted to lower case to simplify the logic
    character = sc.next().toLowerCase().charAt(0);

    sc.close();

    switch (character) {
      case 'a':
        System.out.println("Action movie fan");
        break;
      case 'c':
        System.out.println("Comedy movie fan");
        break;
      case 'd':
        System.out.println("Drama movie fan");
        break;
      default:
        System.out.println("Invalid choice");
    }

  }
}
