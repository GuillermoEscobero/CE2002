import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    char character;
    Scanner sc = new Scanner(System.in);

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
