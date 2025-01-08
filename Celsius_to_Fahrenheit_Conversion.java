import java.util.*;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius : ");
        int celsius = sc.nextInt();
        float fahrenheit = (celsius * (9f/5f)) + 32;
        
        System.out.println("Temperature in Fahrenheit : "+fahrenheit);
    }
}
