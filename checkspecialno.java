import java.util.Scanner;

public class checkspecialno {
    public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in);
        n=Sc.nextInt();
        int k=n;
        int s=0;
        int d;
        while(n>0)
        {
            d=n%10;
            int f=1;
            for(int i=d;i>=1;i--){
                f=f*i;

            }
         s=s+f;
         n=n/10;

        }
        if(s==k){
            System.out.println("special no");
        }
        else{
            System.out.println("not a special no");
        }
    }
}
