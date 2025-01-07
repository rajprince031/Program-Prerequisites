import java.util.Scanner;

public class Convert_Kilometers_to_Miles {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dustance(in KM) : ");
        float kilometer = sc.nextFloat();
        float miles = kilometer * 0.621371f;
        System.out.println("Distance in Miles : "+miles);
    }
}
