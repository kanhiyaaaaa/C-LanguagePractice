import java.util.Scanner;
public class ifelse6 {
   public static void main(String[] args) {
    double a,b,c,r1,r2;
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter the values of a,b,c:");
    a=Sc.nextDouble();
    b=Sc.nextDouble();
    c=Sc.nextDouble();
    double d;
    d=(b*b-4*a*c);
    if(d<0){
        System.out.println("roots are imaginary");
    }
    else if(d==0){
        System.out.println("roots are equal");
        r1=-b/(2*a);
        r2=-b/(2*a);
        System.out.println("value of r1 :"+r1);
        System.out.println("value of r2 :"+r2);
    } 
    else{
        System.out.println("roots are real");
      r1=(-b+Math.sqrt(d))/(2*a);
      r2=(-b-Math.sqrt(d))/(2*a);
      System.out.println("value of r1 :"+r1);
      System.out.println("value of r2 :"+r2);
    }
   } 
}
