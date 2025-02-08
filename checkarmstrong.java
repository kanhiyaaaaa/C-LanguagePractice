import java.util.Scanner;

public class checkarmstrong{
    public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in) ;

        System.out.println("armstrong no between 1 to 500 is:");
        for(n=1;n<=500;n++){
            int s=0;
            int k=n;
            while(k>0){
                int d=k%10;
                s=s+d*d*d;
                k=k/10;

            }
            if(s==n){
                System.out.println(n);
            }
        }
    }
}
