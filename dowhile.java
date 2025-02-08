import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        char ch;
        int n,s=0;
        Scanner Sc =new Scanner(System.in);
        do{
            System.out.println("enter no ");
            n=Sc.nextInt();
            s=s+n;
            System.out.println("want to enter aother no if say yes or no");
            ch=Sc.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
            System.out.println("sum is"+s);
    }
    }

