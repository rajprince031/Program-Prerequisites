import java.util.*;
public class Volume_of_a_Cylinder {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Cylinder : ");
        float radius = sc.nextFloat();
        System.out.print("Enter the height of Cylinder : ");
        float height = sc.nextFloat();
        float area = (22f/7f) * (radius * radius * height);

        System.out.println("Area of Circle : "+area);
        
    }
}
