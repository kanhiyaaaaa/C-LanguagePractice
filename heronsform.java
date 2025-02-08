import java.util.Scanner;

public class heronsform {
    public static void main(String[]args){
        double a,b,c,s,area;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the sides of triangle a,b,c:");
        a=Sc.nextDouble();
        b=Sc.nextDouble();
        c=Sc.nextDouble();
        s=(a+b+c)/2.0;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of tri. using herons form. is "+area);

    }
}
