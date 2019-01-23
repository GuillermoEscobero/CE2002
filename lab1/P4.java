/**
 * Task 4 - Lab 1
 * @author Escobero Hernandez Guillermo (N1804693E)
 */

import java.util.Scanner;

public class P4 {
  public static void main(String[] args) {
    int height;

    // Read height from keyboard
    Scanner sc = new Scanner(System.in);
    height = sc.nextInt();

    // Height must be positive and not 0
    if (height <= 0) {
      System.out.println("Error input!!");
      return;
    }

    // Auxiliary variable to alternate between 'AA' and 'BB' in the line
    int aux;

    // Nested for loops, first one to create each line
    // and inner one to print in it
    for (int i = 1; i <= height; i++) {
      // Each line starts in 'AA' or 'BB' alternately
      if (i % 2 != 0) {
        aux = 0;
      } else {
        aux = 1;
      }
      for (int j = 0; j < i; j++) {
        // Prints and change the value of aux for the next iteration
        if (aux == 0) {
          System.out.print("AA");
          aux = 1;
        } else {
          System.out.print("BB");
          aux = 0;
        }
      }
      System.out.println();
    }
  }
}
