import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        int n,d,rev=0;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n :");
        n=Sc.nextInt();
        int orig=n;
        while(n>0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;

    }
    System.out.println("reverse is "+rev);
    if(orig==rev){
        System.out.println("pallindrome no.");
    }
    else{
        System.out.println("not pallindrome");
    }
    }
}
