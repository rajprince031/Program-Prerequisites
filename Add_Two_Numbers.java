import java.util.*;

public class Add_Two_Numbers {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        
        System.out.println("sum of two number : "+sum);
    }
}
