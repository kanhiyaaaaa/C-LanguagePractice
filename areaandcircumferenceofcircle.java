import java.util.Scanner;

public class areaandcircumferenceofcircle {
    public static void main(String[] args) {
        double r;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the radius of circle");
        r=Sc.nextDouble();


        final double pie=3.14;
      

        System.out.println("area of circle: "+(pie*r*r));
        System.out.println("circumference of circle: "+2*pie*r);
    }
}
