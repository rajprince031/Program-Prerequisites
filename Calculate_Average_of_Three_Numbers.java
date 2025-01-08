import java.util.Scanner;

public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2st number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter your 3st number : ");
        int num3 = sc.nextInt();
        float average = ((float)(num1+num2+num3))/3f;
        
        System.out.print("Average : "+average);
    }
}
