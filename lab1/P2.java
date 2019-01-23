/**
 * Task 2 - Lab 1
 * @author Escobero Hernandez Guillermo (N1804693E)
 */

import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    double salary;
    int merit;

    Scanner sc = new Scanner(System.in);

    System.out.print("salary: $");
    salary = sc.nextDouble();
    System.out.print("merit: ");
    merit = sc.nextInt();

    sc.close();

    // Salary range for grade C: $500 - $649
    if(500 <= salary && salary <= 649) {
      if(salary >= 600) {
        if(merit >= 10) {
          System.out.println("Grade B");
        } else {
          System.out.println("Grade C");
        }
      } else {
        System.out.println("Grade C");
      }

    // Salary range for grade B: $600 - $799
    } else if(600 <= salary && salary <= 799) {
      if(salary >= 700) {
        if(merit >= 20) {
          System.out.println("Grade A");
        } else {
          System.out.println("Grade B");
        }
      }

    // Salary range for grade A: $700 - $899
    } else if(700 <= salary && salary <= 899) {
      System.out.println("Grade A");
    } else {
      System.out.println("Salary range not defined");
    }
  }

}
