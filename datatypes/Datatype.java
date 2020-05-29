import java.util.Scanner;

public class Datatype {

  public static void main(String[] args) {
    double a;
    int b;
    char e;
    float d;
    boolean t;
    boolean f;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Double");
    a = sc.nextDouble();
    System.out.println("Enter Int");
    b = sc.nextInt();
    System.out.println("Enter String");
    String c = sc.next().toString();
    System.out.println("Enter float");
    d = sc.nextFloat();
    System.out.println("Enter character");
    e=sc.next().charAt(0);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println("Data Types are done . . . ");
    t=true;f=false;
    System.out.println(t);
    System.out.println(f);
  }

}