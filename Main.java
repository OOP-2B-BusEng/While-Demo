import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int count, number;
    System.out.println ("Enter a number");
    Scanner keyboard = new Scanner (System.in);
    number = keyboard.nextInt ();
    count = 1;
    while (count <= number)
    {
      System.out.print (count + ", ");
      count++;
    }
    System.out.println ();
    System.out.println ("Buckle my shoe.");
  }
  
  public static void main2(String[] args) {
    int count, number;
    System.out.println ("Enter a number");
    Scanner keyboard = new Scanner (System.in);
    number = keyboard.nextInt ();
    count = 1;
    do
    {
      System.out.print (count + ", ");
      count++;
    }
    while (count <= number);
    System.out.println ();
    System.out.println ("Buckle my shoe.");
  }
}