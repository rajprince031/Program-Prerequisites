import java.util.*;
public class Area_of_Circle {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        float area = (22f/7f) * (radius * radius);

        System.out.println("Area of Circle : "+area);
        
    }
}
