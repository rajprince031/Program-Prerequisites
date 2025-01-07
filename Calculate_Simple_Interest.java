import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        float principle = sc.nextFloat();
        System.out.print("Enter the Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter the Time : ");
        float time = sc.nextFloat();
        float area = (principle * rate * time) / 100 ;
        System.out.println("Simple Interest : "+area);
    }
}
