
import java.util.Scanner;
class GettingGreater{
    public static void main (String [] args){
        
    Scanner input = new Scanner (System.in);

    System.out.print("Getting the Greater Value");
    input.nextLine();

    System.out.print("Enter first character: ");
    char ch1 = input.next().charAt(0);

    System.out.print("Enter second character: ");
    char ch2 = input.next().charAt(0);

    int num = (int) ch1;
    int num1 = (int) ch2;

    System.out.println("--------------------------------------------------------------");
    if (ch1 >ch2){
        System.out.println("The character with greater value is: " +ch1);
    }
    else {
        System.out.println("The character with greater value is: " +ch2);
    }
    System.out.println("--------------------------------------------------------------");

    System.out.println ("Showing the ASCII Codes");
    System.out.println("a: " +num);
    System.out.println("1: " +num1);

    }
}