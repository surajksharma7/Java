import java.util.Scanner;
class SimpleTryCatch { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    try {
      System.out.println(a+"/"+b+" = "+a/b);
    }
    catch(ArithmeticException e) {
      System.out.println("Division by zero is not allowed");

    }
  }
}
