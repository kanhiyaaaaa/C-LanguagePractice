import java.util.Scanner;

public class ifelse {
    public static void main(String[]args){
        double a,b,c;
        Scanner Sc=new Scanner(System.in);
        System.out.println("entr the values of a and b and c");
        a=Sc.nextDouble();
        b=Sc.nextDouble();
        c=Sc.nextDouble();
        if(a>b && a>c){
            System.out.println("a is greater no:"+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("b is greater no:"+b);
        }
        else
        {
            System.out.println("c is greater no:"+c);
        }
    }
}
