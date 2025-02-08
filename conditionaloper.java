import java.util.Scanner;
public class conditionaloper {
    public static void main (String[]args){
     int a,b,c;
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter the values of a,b,c");
     a=Sc.nextInt();
     b=Sc.nextInt();
     c=(a>b)?a:b;
     System.out.println("greater is "+c);
    }
}
