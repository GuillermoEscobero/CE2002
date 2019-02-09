import java.util.Scanner;

public class Lab2p1 {
  public static void main(String[] args) {
    int choice;
    int arg1, arg2;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("\nPerform the following methods:");
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
          System.out.print("m = ");
          arg1 = sc.nextInt();
          System.out.print("n = ");
          arg2 = sc.nextInt();
          divide(arg1, arg2);
          break;
        case 3:
          System.out.print("m = ");
          arg1 = sc.nextInt();
          System.out.print("n = ");
          arg2 = sc.nextInt();
          modulus(arg1, arg2);
          break;
        case 4:
          System.out.print("n : ");
          arg1 = sc.nextInt();
          countDigits(arg1);
          break;
        case 5:
          System.out.print("m = ");
          arg1 = sc.nextInt();
          System.out.print("n = ");
          arg2 = sc.nextInt();
          position(arg1, arg2);
          break;
        case 6:
          //extractOddDigits();
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

    while (aux >= n) {
      aux -= n;
      counter++;
    }

    System.out.println(m + "/" + n + " = " + counter);
    return counter;
  }

  public static int modulus(int m, int n) {
    int aux = m;
    int counter = 0;

    while (aux >= n) {
      aux -= n;
      counter++;
    }

    System.out.println(m + " % " + n + " = " + aux);
    return aux;
  }

  public static int countDigits(int n) {
    if (n <= 0) {
      System.out.println("Error input!!");
      return -1;
    }

    int length = (int) (Math.log10(n) + 1);
    System.out.println("count = " + length);
    return length;
  }

  public static int position(int n, int digit) {
      int current;
      int counter = 0;

      while(0 < n && n != digit) {
        current = n % 10;
        n = n / 10;
        counter++;
      }

      System.out.println("position = " + counter);
      return counter;
  }

  public static long extractOddDigits(long n) {
      System.out.println("TODO: Implement this");
      return 0;
  }
}
