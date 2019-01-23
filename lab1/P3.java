/**
 * Task 3 - Lab 1
 * @author Escobero Hernandez Guillermo (N1804693E)
 */

import java.util.Scanner;

public class P3 {
  public static void main(String[] args) {
    final double rate = 1.82;
    int starting, ending, increment;

    Scanner sc = new Scanner(System.in);

    // Read values from keyboard
    System.out.print("starting: ");
    starting = sc.nextInt();
    System.out.print("ending: ");
    ending = sc.nextInt();
    System.out.print("increment: ");
    increment = sc.nextInt();

    sc.close();

    // Are values correct?
    if (starting > ending) {
      System.out.println("Error input!!");
      return;
    }

    // First table
    System.out.println("US$\t\tS$");
    System.out.println("-------------------");
    for (int i = starting; i <= ending ; i+= increment) {
      System.out.println(i + "\t\t" + i*rate);
    }

    System.out.println();

    // Second table
    int i = starting;
    System.out.println("US$\t\tS$");
    System.out.println("-------------------");
    while (i <= ending) {
      System.out.println(i + "\t\t" + i*rate);
      i += increment;
    }

    System.out.println();

    // Third table
    i = starting;
    System.out.println("US$\t\tS$");
    System.out.println("-------------------");
    do {
      System.out.println(i + "\t\t" + i*rate);
      i += increment;
    } while (i <= ending);

  }
}
