import java.util.Scanner;

public class Lab2p1 {
  public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Perform the following methods:");
      System.out.println("1: multiplication test");
      System.out.println("2: quotient using division by substraction");
      System.out.println("3: remainder using division by substraction");
      System.out.println("4: count the number of digits");
      System.out.println("5: position of a digit");
      System.out.println("6: extract all odd digits");
      System.out.println("7: quit");

      choice = sc.nextInt();

      switch (choice) {
        case 1:
          mulTest();
          break;
        case 2:
          divide();
          break;
        case 3:
          modulus();
          break;
        case 4:
          countDigits();
          break;
        case 5:
          position();
          break;
        case 6:
          extractOddDigits();
          break;
        case 7:
          System.out.println("Program terminating...");
      }

    } while (choice < 7);
  }

  public static void mulTest() {
    int a, b, answer;
    int points = 0;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      a = (int) (Math.random() * 9);
      b = (int) (Math.random() * 9);
      System.out.print("How much is " + a + " times " + b + "? ");
      answer = sc.nextInt();

      if (a*b == answer) {
        points++;
      }
    }

    System.out.println(points + " answers out of 5 are correct.");
  }

  public static int divide(int m, int n) {
    int aux = m;
    int counter = 0;

    while (m >= n) {
      m -= n;
      counter++;
    }

    System.out.println(m + "/" + n + " = " + counter);
    return counter;
  }

  public static int modulus(int m, int n) {
    int aux = m;
    int counter = 0;

    while (m >= n) {
      aux -= n;
      counter++;
    }

    System.out.println(m + "%" + n + " = " + aux);
    return aux;
  }

  public static int countDigits(int n) {
    if (n <= 0) {
      System.out.println("Error input!!");
    }

    int length = (int) (Math.log10(n) + 1);
    System.out.println("count = " + length);
    return length;
  }

  public static int position(int n, int digit) {
    
  }

  public static void extractOddDigits() {}

}
