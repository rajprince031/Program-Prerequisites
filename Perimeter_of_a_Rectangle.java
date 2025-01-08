import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle : ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of Rectangle : ");
        float breadth = sc.nextFloat();
        float perimeter = 2 * (length * breadth);
        
        System.out.println("Perimeter of a Rectangle : "+perimeter);
    }
}
