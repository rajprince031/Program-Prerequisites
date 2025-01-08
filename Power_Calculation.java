import java.util.Scanner;

public class Power_Calculation {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = sc.nextInt();
        System.out.print("Enter the  exponent : ");
        int exponent = sc.nextInt();
        int power = (int)Math.pow(base,exponent);
        
        System.out.println("Power Calculation : "+power);
    }
}
