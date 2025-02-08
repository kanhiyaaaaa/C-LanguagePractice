import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        int fc=0,i,n;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n to check its a prime no or not :");
        n=Sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                fc++;
                break;
            }

        }
        if(fc==0){
            System.out.println("prime no");

        }
        else{
            System.out.println("not a prime no");
        }
    }
}
